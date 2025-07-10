import java.util.Arrays;
public class DebugPro {

    public void solveSudoku(char[][] board) {
        boolean[][] h=new boolean[9][10];
        boolean[][] v=new boolean[9][10];
        boolean[][] d = new boolean[9][10];

        for(int i = 0; i < board.length; ++i) {
            for(int j = 0; j < board[i].length; ++j) {
                if(board[i][j] != '.') {
                    int curr=board[i][j]-'0';
                    h[i][curr]=true;
                    v[j][curr]=true;
                    int box=(i/3)+(j/3)*3;
                    d[box][curr]=true;
                }
            }
        }
        dfs(0,0,board, h,v,d);
    }
    private boolean dfs(int r, int c, char[][] board, boolean[][] h, boolean[][] v, boolean[][] d){
        if(c==9){
            r=r+1;
            c=0;
        }
        if(r==9){
            return true;
        }
        if(board[r][c]!='.'){
            return dfs(r,c+1,board,h,v,d);
        }
        for(int num=1; num<10; num++){
            if(isVaild(num,board,r,c,h,v,d)){
                char val=(char)(num+'0');
                board[r][c]=val;
                h[r][num]=true;
                v[c][num]=true;
                int box=(r/3)+(c/3)*3;
                d[box][num]=true;
                if(dfs(r,c+1,board,h,v,d)){
                    return true;
                }
                h[r][num]=false;
                v[c][num]=false;
                d[box][num]=false;
                board[r][c]='.';
            }
        }
        return false;
    }
    private boolean isVaild(int num,char[][] board, int r, int c, boolean[][] h,boolean[][] v,boolean[][] d){
        if(h[r][num]==true){
            return false;
        }
        if(v[c][num]){
            return false;
        }
        int box=(r/3)+(c/3)*3;
        if(d[box][num]){
            return false;
        }

        return true;
    }


    public static void main(String[] args) {
        DebugPro d=new DebugPro();
        char board[][] = {{'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','8'},
                {'4','.','.','8','5','3','.','.','1'},
                {'7','1','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}};
        String word = "ABCCED";
        int r = board.length;
        int c = board[0].length;
        boolean visit[][] = new boolean[r][c];
        d.solveSudoku(board);
        System.out.println();

    }
}
