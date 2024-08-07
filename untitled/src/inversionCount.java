import java.util.*;
public class inversionCount {
    public static void main(String[] args) {
        int[] arr={1,20,6,4,5};
        int n= arr.length;
        int count1 = mergeSort(arr,0,n-1);
        System.out.println(count1);
        int[]arr2={5,2,6,1};
        int[] res=new int[arr2.length];
        binarayIndexedTree(arr2,res);
        for(int num:res){
            System.out.print(num +" ");
        }

    }

    private static void binarayIndexedTree(int[] arr, int[] res) {
        int n=arr.length;
        int[] sort=arr.clone();
        Arrays.sort(sort);
        int[] inversion=new int[n];
        for(int i=0; i<n; i++){
            inversion[i]=findPostionInSortArray(sort,arr[i])+1;
        }
        int[] bit=new int[n+1];

        for(int i=n-1; i>=0; i--){
            int count=countSum(inversion[i]-1,bit);
            res[i]=count;
            updateBIT(inversion[i],1,bit);
        }
    }

    private static void updateBIT(int i, int val, int[] bit) {
        int n=bit.length;
        while(i<n){
            bit[i]+=val;
            i=i+(i&-i);
        }
    }

    private static int countSum(int i, int[] bit) {
        int sum=0;
        while(i>0){
            sum+=bit[i];
            i=i-(i&-i);
        }
        return sum;
    }

    private static int findPostionInSortArray(int[] sort, int val) {
        int si=0; int ei=sort.length-1;
        int pos=0;
        while(si<=ei){
            int mid=si+(ei-si)/2;
            if(sort[mid]<=val){
                pos=mid;
                si=mid+1;
            }
            else{
                ei=mid-1;
            }
        }
        return pos;
    }

    private static int mergeSort(int[] arr, int si, int ei) {
        if(si==ei){
            return 0;
        }
        int mid=si+(ei-si)/2;
        int count=0;
        count+=mergeSort(arr,si,mid);
        count+=mergeSort(arr,mid+1,ei);
        count+=combineArray(arr,si,mid,ei);
        return count;

    }

    private static int combineArray(int[] arr, int si, int mid, int ei) {
        int[] lt=Arrays.copyOfRange(arr,si,mid+1);
        int[] rt=Arrays.copyOfRange(arr,mid+1,ei+1);
        int m=lt.length;
        int n=rt.length;
        int i1=0;
        int i2=0;
        int idx=si;
        int count=0;
        while(i1<m && i2<n){
            if(lt[i1]>rt[i2]){
                count+=(m-i1);
                arr[idx++]=rt[i2++];
            }
            else{
                arr[idx++]=lt[i1++];
            }
        }
        while(i1<m){
            arr[idx++]=lt[i1++];
        }
        while(i2<n){
            arr[idx++]=rt[i2++];
        }
        return count;
    }

}
