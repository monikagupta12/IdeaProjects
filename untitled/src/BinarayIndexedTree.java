public class BinarayIndexedTree {
    public static void main(String[] args) {
        int[] arr={10,9,8,7,6,5,4,3,2,1};
        int n=arr.length;
        BinarayIndexedTree b1=new BinarayIndexedTree();
        int[] BIT1=b1.createBIT(arr, n);
        int[]BIT=b1.createBITPrefixSum(arr,n);
        b1.printArr(BIT);
        b1.printArr(BIT1);
        int sum1=b1.rangeSum(3,5,BIT);
        System.out.println(sum1);
        int sum2=b1.rangeSum(6,8,BIT);
        System.out.println(sum2);
        int sum3=b1.rangeSum(1,7,BIT);
        System.out.println(sum3);
        int sum4 =b1.rangeSum(5,5,BIT);
        System.out.println(sum4);


        b1.updateAtPoint(2+1,-8,BIT,arr);
        b1.printArr(BIT1);
        b1.printArr(BIT);

        int sum5 =b1.rangeSum(3,5,BIT);
        System.out.println(sum5);
        int sum6=b1.rangeSum(6,8,BIT);
        System.out.println(sum6);
        int sum7=b1.rangeSum(1,7,BIT);
        System.out.println(sum7);
        int sum8 =b1.rangeSum(5,5,BIT);
        System.out.println(sum8);
    }
    private int rangeSum(int l, int r, int[]BIT){
        return findSum(r+1,BIT)-findSum(l,BIT);
    }
    private void printArr(int[] arr){
        for(int num:arr){
            System.out.print(num+"->");
        }
        System.out.println();
    }
    private int[] createBIT(int[] arr, int n){
        int[] BIT =new int[n+1];
        for(int i=1; i<=n; i++) {
            updateAtPoint(i, arr[i-1],BIT,arr);
        }
        return BIT;
    }
    private int[] createBITPrefixSum(int[] arr, int n){
        int[] prefix =new int[n+1];
        int[] BIT =new int[n+1];
        for(int i=1; i<=n; i++){
            prefix[i]=prefix[i-1]+arr[i-1];
        }
        for(int i=1; i<=n; i++) {
            int nextI=i-(i&-i);
            BIT[i]=prefix[i]-prefix[nextI];
        }
        return BIT;
    }
    private void updateAtPoint(int i, int val, int[] BIT,int[] arr){
        int n=BIT.length;
        while(i<n){
            BIT[i]=BIT[i]+val;
            i=i+(i&-i);
        }
    }
    private int findSum(int i,int[] BIT){
        int sum=0;
        while (i > 0) {
            sum=sum+BIT[i];
            i=i-(i&-i);
        }
        return sum;
    }
}
