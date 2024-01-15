import java.util.*;

public class MinSortArray {
    int [] arr;
    int size;
    MinSortArray(int capcity){
        arr=new int[capcity];
        size=0;
    }
    public int lc(int i){
        return 2*i+1;
    }
    public int rc(int i){
        return 2*i+2;
    }
    public int par(int i){
        return (i-1)/2;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public boolean isFull(){
        return size==arr.length;
    }
    public void swap(int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public void add(int val){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        arr[size]=val;
        size++;
        int i=size-1;
        while (i!=0 && arr[par(i)]>arr[i]){
            swap(par(i),i);
            i=par(i);
        }
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue.is empty");
            return Integer.MAX_VALUE;
        }
        return arr[0];
    }
    public void minHeapify(int n,int i){
        int l=lc(i);
        int r=rc(i);
        int small=i;
        if(l<n && arr[l]<arr[small]){
            small=l;
        }
        if(r<n && arr[r]<arr[small]){
            small=r;
        }
        if(i!=small){
            swap(i,small);
            minHeapify(n,small);
        }
    }
    public int remove(){
         if(isEmpty()){
            return Integer.MAX_VALUE;
        }
        if(size==1){
            size--;
            return arr[0];
        }
        size--;
        swap(0,size);
        minHeapify(size,0);
        return arr[size];
    }
    public void insert(int i,int val){
        if(i>=arr.length){
            System.out.println("Invaild Location");
            return;
        }
        arr[i]=val;
        minHeapify(size,i);
        while (i!=0 && arr[par(i)]>arr[i]){
            swap(par(i),i);
            i=par(i);
        }
    }
    public int delete(int i){
        if(isEmpty()){
            return Integer.MAX_VALUE;
        }
        int val=arr[i];
        insert(i,Integer.MIN_VALUE);
        remove();
        return val;
    }

    public static void main(String[] args) {
        MinSortArray pq=new MinSortArray(7);
        pq.add(10);
        pq.add(7);
        pq.add(2);
        pq.add(6);
        pq.add(5);
        pq.insert(0,4);
        pq.insert(1,12);
        pq.delete(1);
        System.out.println(pq.size);
        System.out.println(pq.peek());
        while (!pq.isEmpty()) {
            System.out.print(pq.remove()+" ");
        }
        System.out.println();
        int out= pq.delete(2);
        System.out.println(out);
    }

}
