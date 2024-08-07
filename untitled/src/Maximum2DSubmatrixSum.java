public class Maximum2DSubmatrixSum {
    public static void main(String[] args) {
        int[][] arr={{1, 2}, {-5, -7}};
        Maximum2DSubmatrixSum m1=new Maximum2DSubmatrixSum();
        int sum=m1.findSum(arr);
        System.out.println(sum);

    }
    private int findSum(int[][] arr){
        int m=arr.length;
        int n=arr[0].length;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<m; i++){
            int[] sum=new int[n];
            for(int j=i; j<m; j++){
                addMatrix(sum,arr[j]);
                int curr=maxSum(sum);
                max=Math.max(max,curr);
            }
        }
        return max;
    }
    private int maxSum(int[] arr){
        int n=arr.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int num:arr){
            sum=Math.max(sum+num,num);
            max=Math.max(max,sum);
        }
        return max;
    }
    private void addMatrix(int[]sum , int [] arr){
        int n=arr.length;
        for(int i=0; i<n; i++){
            sum[i]=sum[i]+arr[i];
        }
    }
}
