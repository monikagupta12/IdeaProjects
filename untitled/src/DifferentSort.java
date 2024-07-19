import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author devenps
 */

public class DifferentSort {
    public static void main(String[] args) {
        int[] arrS={5,7,2,4,3,8,9};
        DifferentSort d1=new DifferentSort();
        d1.selectionSort(arrS);
        System.out.println("selectionSort");
        for(int num:arrS){
            System.out.print(num +" ");
        }
        System.out.println();

        int[] arrB={5,7,2,4,3,8,9};
        d1.bubbleSort(arrB);
        System.out.println("bubbleSort");
        for(int num:arrB){
            System.out.print(num +" ");
        }
        System.out.println();

        int[] arrI={5,7,2,4,3,8,9};
        d1.insertionSort(arrI);
        System.out.println("insertionSort");
        for(int num:arrI){
            System.out.print(num +" ");
        }
        System.out.println();

        int[] arrM={5,7,2,4,3,8,9};
        d1.mergeSort(arrM, 0,arrM.length-1);
        System.out.println("mergeSort");
        for(int num:arrM){
            System.out.print(num +" ");
        }
        System.out.println();

        int[] arrQ={5,7,2,4,3,8,9};
        d1.quickSort(arrQ, 0,arrM.length-1);
        System.out.println("quickSort");
        for(int num:arrQ){
            System.out.print(num +" ");
        }
        System.out.println();

        int[] arrH={5,7,2,4,3,9,8};
        d1.heapSort(arrH);
        System.out.println("heapSort");
        for(int num:arrH){
            System.out.print(num +" ");
        }
        System.out.println();

        int[] arrC={5,7,2,4,3,8,9};
        d1.countSort(arrC);
        System.out.println("countSort");
        for(int num:arrC){
            System.out.print(num +" ");
        }
        System.out.println();

        int[] arrR={543,741,2334,475,389,809,981};
        d1.radixSort(arrR);
        System.out.println("radixSort");
        for(int num:arrR){
            System.out.print(num +" ");
        }
        System.out.println();

        double[] arrBf= {0.65, 0.23, 0.45, 0.41, 0.53, 0.71};
        d1.bucketSort(arrBf);
        System.out.println("bucketSort");
        for(double num:arrBf){
            System.out.print(num +" ");
        }
        System.out.println();

    }
    private void swap(int i, int j, int[]arr){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    private void selectionSort(int[] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            int small=i;
            for(int j=i+1; j<n; j++){
                if(arr[small]>arr[j]){
                    small=j;
                }
            }
            swap(small,i, arr);
        }
    }
    private void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0; i<n-1; i++) {
            for (int j = 0; j < n-1; j++) {
                if (arr[j] >arr[j + 1]) {
                    swap(j, j + 1, arr);
                }
            }
        }
    }
    private void insertionSort(int[] arr){
        int n=arr.length;
        for(int unSorted=1; unSorted<n; unSorted++){
            int sorted=unSorted-1;
            int curr=unSorted;
            while(sorted>=0 && arr[sorted]>arr[curr]){
                swap(sorted ,curr, arr);
                curr=sorted;
                sorted--;
            }
        }
    }
    private void mergeSort(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int mid=si+(ei-si)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr,mid+1,ei);
        merge(arr,si,mid, ei);
    }
    private void merge(int[] arr, int si, int mid, int ei){
        int[]temp=new int[ei-si+1];
        int i1=si;
        int i2=mid+1;
        int j=0;
        while(i1<=mid && i2<=ei){
            if(arr[i1]>arr[i2]){
                temp[j++]=arr[i2++];
            }
            else{
                temp[j++]=arr[i1++];
            }
        }
        while(i1<=mid){
            temp[j++]=arr[i1++];
        }
        while(i2<=ei){
            temp[j++]=arr[i2++];
        }
        j=0;
        for(int i=si; i<=ei; i++){
            arr[i]=temp[j++];
        }
    }


    private void quickSort(int[] arr, int si, int ei){
        if(si>=ei){
            return;
        }
        int rightPos=partition(arr,si,ei);
        quickSort(arr,si,rightPos-1);
        quickSort(arr,rightPos+1,ei);
    }
    private int partition(int[] arr, int si, int ei){
        int pivot=arr[ei];
        int pos=si;
        for(int i=si; i<ei; i++){
            if(arr[i]<pivot){
                swap(pos,i,arr);
                pos++;
            }
        }
        swap(pos,ei,arr);
        return pos;
    }

    private void heapSort(int[] arr){
        int n=arr.length-1;
        int par=(n-1)/2;
        for(int i=par; i>=0; i--){
            heapify(arr,i,n);
        }
        for(int i=n; i>=1; i--){
            swap(0,i,arr);
            heapify(arr,0,i-1);
        }
    }
    private void heapify(int[]arr, int i, int n){
        int large=i;
        int lt=2*i+1;
        int rt=2*i+2;
        if(lt<=n && arr[large]<arr[lt]){
            large=lt;
        }
        if(rt<=n && arr[large]<arr[rt]){
            large=rt;
        }
        if(large!=i){
            swap(large,i,arr);
            heapify(arr,large,n);
        }
    }


    private void countSort(int[]arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
        int limit=max-min+1;
        int[] freq=new int[limit];
        for(int i=0; i<n; i++){
            int idx=arr[i]-min;
            freq[idx]++;
        }
        for(int i=1; i<limit; i++){
            freq[i]=freq[i-1]+freq[i];
        }
        int[] temp=new int[n];
        for(int i=n-1; i>=0; i--){
            int idx=arr[i]-min;
            int pos=freq[idx]-1;
            temp[pos]=arr[i];
            freq[idx]--;
        }
        for(int i=0; i<n; i++){
            arr[i]=temp[i];
        }
    }
    private void radixSort(int[] arr){
        int n=arr.length;
        int max=0;
        for(int num:arr){
            max=Math.max(max,num);
        }
        int exp=1;
        while(exp<=max){
            countingSort(arr,exp);
            exp=exp*10;
        }
    }
    private void countingSort(int[] arr, int exp){
        int n=arr.length;
        int[] freq=new int[10];
        for(int i=0; i<n; i++){
            int idx=(arr[i]/exp)%10;
            freq[idx]++;
        }
        for(int i=1; i<10; i++){
            freq[i]=freq[i-1]+freq[i];
        }
        int[] temp=new int[n];
        for(int i=n-1; i>=0; i--){
            int idx=(arr[i]/exp)%10;
            int pos=freq[idx]-1;
            temp[pos]=arr[i];
            freq[idx]--;
        }
        for(int i=0; i<n; i++){
            arr[i]=temp[i];
        }
    }
     private void bucketSort(double[] arr){
         int n=arr.length;
         ArrayList<Double>[] bucket=new ArrayList[n];
         for(int i=0; i<n; i++){
             bucket[i]=new ArrayList<>();
         }
         for(int i=0; i<n; i++){
             int idx=(int)(n*arr[i]);
             bucket[idx].add(arr[i]);
         }
         for(int i=0; i<n; i++){
             insertionSortArrayList(bucket[i]);
         }
         int idx=0;
         for(int i=0; i<n; i++){
             for(int j=0; j<bucket[i].size(); j++){
                 double temp=bucket[i].get(j);
                 arr[idx++]=temp;
             }
         }
     }
     private void insertionSortArrayList(ArrayList<Double> bucket){
        int n=bucket.size();
        for(int us=1; us<n; us++){
            int s=us-1;
            double curr=bucket.get(us);
            while(s>=0 && bucket.get(s)>curr){
                bucket.set(s+1,bucket.get(s));
                s--;
            }
            bucket.set(s+1,curr);
        }
     }
}
