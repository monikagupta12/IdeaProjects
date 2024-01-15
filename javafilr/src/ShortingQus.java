import java.util.Arrays;
import java.util.Scanner;

public class ShortingQus {

        public static void MergeShort(int []arr,int si, int ei){
            if(si>=ei){

                return;
            }
            int mi=si+(ei-si)/2;
           MergeShort(arr,si,mi) ;
           MergeShort(arr,mi+1,ei);
           Conquere( arr, si, mi, ei);
        }
        public static void Conquere( int []arr, int si, int mi, int ei) {
            int[] merge = new int[ei - si + 1];
            int idx1 = si;
            int idx2 = mi + 1;
            int x = 0;
            while (idx1 <= mi && idx2 <= ei) {
                if (arr[idx1] <=  arr[idx2]) {
                    merge[x++] = arr[idx1++];
                } else {
                    merge[x++] = arr[idx2++];
                }
            }
            while (idx1 <= mi) {
                merge[x++] = arr[idx1++];
            }
            while (idx2 <= ei) {
                merge[x++] = arr[idx2++];
            }
            for (int i =0,j = si; i<merge.length; i++, j++) {
                arr[j] = merge[i];
            }
        }
        public static void printArr( int arr[]){
            for( int i=0; i< arr.length; i++){
                System.out.print(arr[i] +" ");
            }

        }
        public static void QuickSort(int []arr ,int si, int ei){

            int pi= pivot( arr,  si,  ei);
            QuickSort(arr, si, pi-1);
            QuickSort(arr, pi+1, ei);
        }
        public static int pivot( int arr[], int si, int ei){
            int pi=arr[ei];
            int x=si-1;
            int temp =0;
            for(int i=si;i<=ei;i++){
                if( arr[i]<=pi){
                   x++;
                   temp=arr[i];
                   arr[i]=arr[x];
                   arr[x]=temp;

                }
                x++;
                temp=arr[ei];
                arr[ei]=arr[x];
                arr[x]=temp;

            }
            return x;
        }


        public static void main(String []args){
            Scanner sc=new Scanner(System.in);
            System.out.println("ENTER ARRAY LENGTH");
            int n= sc.nextInt();
            System.out.println("ENTER ARRAY ELEMENT");
            int arr[]=new int[n];
            for( int i=0; i<n; i++){
                arr[i]= sc.nextInt();
            }
            System.out.println(" ARRAY Is =");
            for( int i=0; i<n; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            System.out.println("MERGE SORTED ARRAY IS=");
            MergeShort(arr,0,n-1);
           printArr(arr);
            System.out.println();


            System.out.println("ENTER ARRAY ELEMENT");
            int arr1[]=new int[n];
            for( int i=0; i<n; i++){
                arr1[i]= sc.nextInt();
            }
            System.out.println(" sort mathod");

            System.out.println(" ARRAY Is =");
            for( int i=0; i<n; i++){
                System.out.print(arr1[i]+" ");
            }
            System.out.println();

            System.out.println("QUCIK  SORTED ARRAY IS=");
            MergeShort(arr1,0,n-1);
            printArr(arr1);


        }

}
