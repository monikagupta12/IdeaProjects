public class MaxHeap {
    int[] arr;
    int size;
    MaxHeap(int capcity){
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
    public boolean add(int val){
        if(isFull()){
            System.out.println("queue is full");
            return false;
        }
        arr[size]=val;
        size++;
        int i=size-1;
        while (i!=0 && arr[par(i)]<arr[i]){
            swap(i,par(i));
            i=par(i);
        }
        return true;
    }
    public int peek(){
        return arr[0];
    }
    public void maxHeapify(int n,int i){
        int l=lc(i);
        int r=rc(i);
        int larger=i;
        if(l<n && arr[l]>arr[larger] ){
            larger=l;
        }
        if(r<n && arr[r]>arr[larger]){
            larger=r;
        }
        if(larger!=i){
            swap(i,larger);
            maxHeapify(n,larger);
        }
    }
    public int remove(){
        if(isEmpty()){
            System.out.println("empty queue");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            size--;
            return arr[0];
        }
        size--;
        swap(size,0);
        maxHeapify(size,0);
        return arr[size];
    }
    public void insert(int i,int val){
        if(i>=size){
            System.out.println("invaild postion");
        }
        arr[i]=val;
        maxHeapify(size,i);
        while(i!=0 && arr[par(i)]<arr[i]){
            swap(i,par(i));
            i=par(i);
        }
    }
    public int delete(int i){
        if(isEmpty()){
            System.out.println("empty queue");
            return Integer.MIN_VALUE;
        }
        int val=arr[i];
        insert(i,Integer.MAX_VALUE);
        remove();
        return val;
    }

    public static void main(String[] args) {
          MaxHeap pq=new MaxHeap(7 );
          pq.add(12);
          pq.add(23);
          pq.add(9);
          pq.add(16);
          pq.add(50);
          pq.insert(0,90);
          pq.insert(1,25);
          pq.delete(1);
        pq.delete(1);
        System.out.println(pq.size);
        System.out.println(pq.peek());
        while(!pq.isEmpty()){
            System.out.print(pq.remove()+ " ");
        }
        System.out.println();
        pq.remove();

    }
}
