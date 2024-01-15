public class NqueenPro {
    public static int count=0;
    /* public static boolean isSafe(char board[][], int row, int col){

        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;  i>=0&& j>=0 ; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;  i>=0&& j<board.length ; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char board[][]){
        System.out.println("-------board------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void nQueenFunction(char board[][], int row){
        if(row==board.length){
            count++;
            System.out.println("-------"+count+"--------");
            printBoard(board);
            return ;
        }
        for(int j=0;j<board.length; j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nQueenFunction(board, row+1);
                board[row][j]='x';
            }
        }
    }
    public static void main(String []args){
        int n=4;
        char board[][]=new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='x';
            }
        }
        nQueenFunction(board,0);
    }
}

     */

    public static boolean isSafe(char board[][], int row, int col){

        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col-1;  i>=0&& j>=0 ; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1;  i>=0&& j<board.length ; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char board[][]){
        System.out.println("-------board------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static boolean nQueenFunction(char board[][], int row){
        if(row==board.length){
            count++;
            System.out.println("-------"+count+"--------");
            return true;
        }
        for(int j=0;j<board.length; j++){
            if(isSafe(board,row,j)) {
                board[row][j] = 'Q';
               if( nQueenFunction(board, row + 1)) {
                   return true;
               }
                board[row][j] = 'x';
            }
        }
        return false;
    }
    public static void main(String []args){
        int n=3;
        char board[][]=new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='x';
            }
        }
        if(nQueenFunction(board,0)){
            System.out.println("Solution exit");
            printBoard(board);
        }
        else{
            System.out.println(" Solution not exit");
        }
    }
}