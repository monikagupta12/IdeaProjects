import java.util.*;

public class DryRun {


    //    public static void print(char[][] board ){
//        for (int i=0; i< board.length;i++){
//            if ((i)%3==0){
//                System.out.println("----------------------------");
//            }
//            for (int j=0; j<board.length;j++ ){
//                if ((j)%3==0){
//                    System.out.print(" : ");
//                }
//                System.out.print(board[i][j]+" " );
//            }
//            System.out.println();
//        }
//        return;
//    }
    public static int minPathSum(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int sum=0;
        int minSum=Integer.MAX_VALUE;
        List<Integer> pathsum= new ArrayList<>();
        pathcount(grid,0,0,sum,pathsum);
        for(int num:pathsum){
            minSum=Math.min(minSum,num);
        }

        return minSum;
    }
    public static void pathcount(int[][] grid,int i,int j,int sum,List<Integer> pathsum){
        int r=grid.length;
        int c=grid[0].length;

        if(i==r-1 && j== c){
            pathsum.add(sum);
            return;
        }
        if(isvalidgrid(grid,i,j)){
            int cc= grid[i][j];
            pathcount(grid,i+1,j,sum+cc,pathsum);
            pathcount(grid,i,j+1,sum+cc,pathsum);
        }
        return;
    }
    public static boolean isvalidgrid(int[][] grid,int i,int j ){
        int r=grid.length;
        int c=grid[0].length;
        return i>=0 && j>=0 && i<r&& j<c;
    }


    public static void main(String[] args) {
        int[][] grid ={{1,3,1},{1,5,1},{4,2,1}};
        int path=minPathSum(grid);
        System.out.println(path);
    }

}
//    public static List<List<Integer>> permute(int[] nums){
//        ArrayList<ArrayList<Integer> > list= new ArrayList<ArrayList<Integer> >();
//        ArrayList<Integer> perm= new ArrayList<>();
//        if(perm.size()== nums.length){
//            list.add(perm);
//        }
//        if(list.get(0).size()== nums.length) {
//            return list;
//        }
//        for(int i=0; i<nums.lenght; i++){
//            int cc=nums[i];
//            perm.add(cc);
//            permute(nums);
//            perm.remove(perm.size()-1);
//        }
//
//    }
//
//     public static void main(String[] args) {
//         int nums={1,2,3};
//         ArrayList<ArrayList<Integer> > list= new ArrayList<ArrayList<Integer> >();
//         list=permute(nums);
//
//
//     }
