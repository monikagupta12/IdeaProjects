public class BinarayIndexedTree2D {
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printArray(arr);
        int[][] bit=createBIT(arr);
        printArray(bit);
        int x1=1;
        int y1=1;
        int x2=2;
        int y2=3;
        int sum1=rangeSum(x1,y1,x2,y2,bit);
        System.out.println(sum1+"=");
        updateArray(3+1,3+1,5,bit);
        int sum2 =rangeSum(x1,y1,x2,y2,bit);
        System.out.println(sum2 +"=");



    }
    private static void printArray(int[][] arr){
        int m= arr.length;
        int n=arr[0].length;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    private static int[][] createBIT(int[][] arr){
        int m= arr.length;
        int n=arr[0].length;
        int[][] bit=new int[m+1][n+1];
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                updateArray(i,j,arr[i-1][j-1],bit);
            }
        }
        return bit;
    }

    private static void updateArray(int i, int j, int val, int[][] bit) {
        int m= bit.length;
        int n=bit[0].length;
        int newI=i;
        while(newI<m){
            int newJ=j;
            while(newJ<n){
                bit[newI][newJ]+=val;
                newJ=newJ+(newJ&-newJ);
            }
            newI=newI+(newI&-newI);
        }
    }
    private static int rangeSum(int x1, int y1, int x2, int y2,int[][] bit ){
        return sumNum(x2+1,y2+1,bit)-sumNum(x1,y2+1,bit)-sumNum(x2+1,y1,bit)+sumNum(x1,y1,bit);
    }
    private static int sumNum(int i, int j, int[][] bit){
        int sum=0;
        int newI=i;
        while(newI>0){
            int newJ=j;
            while(newJ>0){
                sum+=bit[newI][newJ];
                newJ=newJ-(newJ&-newJ);
            }
            newI=newI-(newI&-newI);
        }
        return sum;
    }
}

