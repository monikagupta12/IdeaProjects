import java.util.Scanner;

public class SudokuProb {
    public static boolean isSafe(int board[][],int row,int col , int digit){
        for(int i=0;i< board.length;i++){
           if( board[i][col]==digit){
               return false;
           }
        }
        for(int j=0; j< board.length; j++){
            if( board[row][j]==digit){
                return false;
            }
        }
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
               if( board[i][j]==digit){
                   return false;
               }
            }
        }
        return true;
    }
    public static void printFunc(int board[][]){
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean sudoku( int board[][], int row, int col){
        if(row== board.length){
            return true;
        }

       int newrow=0;
        int newcol=0;
        if( col==8){
            newrow=row+1;
            newcol=0;
        }
        else{
             newrow=row;
             newcol=col+1;
        }
        if (board[row][col]!=0) {
            if( sudoku(board,newrow,newcol)){
                return true;
            }
        }
        for( int digit=1; digit<=9; digit++){
            if(isSafe(board,row,col,digit)){
                board[row][col]=digit;
                if(sudoku(board,newrow,newcol)){
                   return true;
                }
                board[row][col]=0;
            }
        }
        return false;
    }
    public static void main(String[]args){
        int board[][]={{0,0,8,0,0,0,0,0,0},
                       {4,9,0,1,5,7,0,0,2},
                       {0,0,3,0,0,4,1,9,0},
                {1,8,5,0,6,0,0,2,0},
                {0,0,0,0,2,0,0,6,0},
                {9,6,0,4,0,5,3,0,0},
                {0,3,0,0,7,2,0,0,4},
                {0,4,9,0,3,0,0,5,7},
                {8,2,7,0,0,9,0,1,3}};
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SUDOKU");
      /*  for(int i=0; i<=8; i++){
            for(int j=0; j<= 8; j++){
                board[i][j]= sc.nextInt();
            }
            System.out.println( " row");
        }

       */
        System.out.println("SUDOKU IS");
        printFunc(board);

        if(sudoku(board,0,0)){
            System.out.println("SOLUTION OF SUDOKU");
            printFunc(board);
        }
        else{
            System.out.println("SOLUTION OF SUDOKU NOT EXIT");
        }
    }

}
