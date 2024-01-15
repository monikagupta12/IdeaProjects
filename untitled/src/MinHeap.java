import java.util.ArrayList;
import java.util.List;

public class MinHeap {
    int size;
    List<Integer> list;
    MinHeap(){
        list=new ArrayList<>();
        size=0;
    }
    public int parent(int i){
        return (i-1)/2;
    }
    public int leftChild(int i){
        return 2*i+1;
    }
    public int rightChild(int i){
        return 2*i+2;
    }
    public boolean isEmpty(){
        return (size==0);
    }
    public void swap(int a,int b){
        int temp=list.get(a);
        list.set(a, list.get(b));
        list.set(b,temp);
    }
    public void add(int val){
        list.add(val);
        size++;
        int i=size-1;
        while(i!=0 && list.get(parent(i))> list.get(i)){
            swap(i,parent(i));
            i=parent(i);
        }
    }
    public int peek(){
        return list.get(0);
    }
    public void MinHeapify(int n,int i){
        int lc=leftChild(i);
        int rc=rightChild(i);
        int smallest=i;
        if(lc<n&&list.get(lc)<list.get(smallest)){
            smallest=lc;
        }
        if(rc<n&& list.get(rc)<list.get(smallest)){
            smallest=rc;
        }
        if(smallest!=i){
            swap(i,smallest);
            MinHeapify(n,smallest);
        }
    }
    public int remove(){
        if(isEmpty()){
            return Integer.MAX_VALUE;
        }
        size--;
        if(size==1){
            list.remove(0);
        }
        swap(size,0);
        MinHeapify(size,0);
        return list.remove(size);
    }
    public void insert(int i,int val){
        list.set(i,val);
        while (i!=0&&list.get(parent(i))<list.get(i)){
            swap(parent(i),i);
            i=parent(i);
        }
    }
    public int delete(int i){
        if(i>=size){
            return Integer.MAX_VALUE;
        }
        int val= list.get(i);
        size--;
        insert(i,Integer.MIN_VALUE);
        MinHeapify(size,0);
        list.remove(size);
        return val;
    }

    public static void main(String[] args) {
        MinHeap tree=new MinHeap();

    }
}
