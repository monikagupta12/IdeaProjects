import java.util.ArrayList;
import java.util.List;

public class nQueen {
//    public static List<List<String>> solveNQueens(int n) {
//        List<List<String>> solution= new ArrayList<>();
//        List<String> board =new ArrayList<>();
//        String row = "";
//        for(int i=0; i<n; i++){
//            row=row+'.';
//        }
//        for(int i=0; i<n; i++){
//            board.add(row);
//        }
//        placedNQueen(solution,board,0,n);
//
//        return solution;
//    }
//   private static void placedNQueen(List<List<String>> solution,List<String> board  ,int r,int n) {
//       if (r == n) {
//           solution.add(new ArrayList(board));
//           return;
//       }
//       for (int j = 0; j < n; j++) {
//           if (isvalid(board, r, j, n)) {
//               String temp = board.get(r);
//               StringBuilder sb = new StringBuilder(temp);
//               sb.setCharAt(j, 'Q');
//               board.remove(r);
//               board.add(r,sb.toString());
//               placedNQueen(solution, board, r + 1, n);
//               String backtracktemp = board.get(r);
//               StringBuilder bTsb = new StringBuilder(backtracktemp);
//              bTsb.setCharAt(j,'.');
//               board.remove(r);
//               board.add(r,bTsb.toString());
//           }
//       }
//   }
//   private static boolean isvalid(List<String> board,int r,int c,int n){
//        for(int i=r-1; i>=0; i--){
//            String temp=board.get(i);
//            if( temp.charAt(c)=='Q'){
//                return false;
//            }
//        }
//       int j=c-1;
//        for(int i=r-1; i>=0; i--){
//            String temp=board.get(i);
//            if(j<0){
//                break;
//            }
//            if( temp.charAt(j)=='Q'){
//                return false;
//            }
//            j--;
//
//
//        }
//       int p=c+1;
//        for(int i=r-1; i>=0; i--){
//            String temp=board.get(i);
//            if(p>=n){
//                break;
//            }
//            if( temp.charAt(p)=='Q'){
//                return false;
//            }
//            p++;
//
//        }
//        return true;
//    }
    public  static int totalNQueens(int n) {
        char[][] board=new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='.';
            }
        }
        int count=0;
        int row=0;
        return nQueen(board,n,row);
    }
    private static int nQueen(char[][] board,int n,int row){
        if(row==n){
            return 1;
        }
       int count=0;
        for(int col=0; col<n; col++){
            if(isSafe(board,row,col)){
                board[row][col]='Q';
                count= count+ nQueen(board,n,row+1);
                board[row][col]='.';
            }
        }
        return count;
    }
    private static boolean isSafe(char[][]board,int row,int col){
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1, j=col-1; i>=0&&j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1; i>=0&&j< board.length; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }return true;
    }


    public static void main(String[] args) {
        int n=4;
        int NoS= totalNQueens(n);
        System.out.println(NoS);
//        List<List<String>> solution= new ArrayList<>();
//        solution =solveNQueens(n);
//        int count=1;
//        for(List<String> b:solution){
//            System.out.println(count + "-----------");
//            for(String str: b){
//                System.out.println(str);
//            }
//            count++;
//            System.out.println();
//        }

    }
}
