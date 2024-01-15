public class HeapSort {
    public static void sortingWithHeap(int []a){
        buildMaxHeap(a,a.length);
        for(int i=a.length-1; i>=1; i--){
            swap(a,i,0);
            maxHeapify(a,i,0);
        }
    }
    public static void buildMaxHeap(int[] a,int n){
        for(int i=(n/2-1); i>=0; i--){
            maxHeapify(a,n,i);
        }
    }
    public static void maxHeapify(int[] a, int n, int i){
        int lc=2*i+1;
        int rc=2*i+2;
        int larger=i;
        if(lc<n && a[larger]<a[lc]){
            larger=lc;
        }
        if(rc<n && a[larger]<a[rc]){
            larger=rc;
        }
        if(larger!=i){
            swap(a,i,larger);
            maxHeapify(a,n,larger);
        }
    }
    public static void swap(int[]a, int i, int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    public static void main(String[] args) {
        int[] a={-4,0,7,4,9,-5,-1,0,-7,-1};
        sortingWithHeap(a);
        for (int num:a){
            System.out.print(num+" ");
        }

    }
}
