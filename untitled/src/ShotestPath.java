public class ShotestPath {
      public static void main(String[] args) {
        int[][] board={{0,0},{0,0}};
        int path=uniquePathsWithObstacles(board);
        System.out.println(path);
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        return pathcount(obstacleGrid,0,0,0);
    }

    private  static int pathcount(int[][] board, int i, int j,int count ){
        int r=board.length;
        int c=board.length;

        if(i==r-1 && j==c-1) {
            return 1;
        }
        if(!isValid(board,i,j)){
            return 0;
        }
        return pathcount(board,i,j+1,count)+pathcount(board,i+1,j,count);
    }
    private static boolean isValid(int[][]board,int i,int j){
        int r=board.length;
        int c=board.length;
        return(i>=0)&&(j>=0)&&(i<r)&&(j<c)&&board[i][j]==0;
    }
}
