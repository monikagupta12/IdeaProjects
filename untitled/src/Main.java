import java.util.Arrays;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        char[][] board = {{'X', 'X', 'X', 'X'}, {'X', 'O', 'O', 'X'}, {'X', 'X', 'O', 'X'}, {'X', 'O', 'X', 'X'}};
        solve(board);
        for (char[] word : board) {
            for (char latter : word) {
                System.out.print(latter + " ");
            }
            System.out.println();
        }
    }

    public static void solve(char[][] board) {
        int r = board.length;
        int c = board[0].length;
        boolean[][] visit = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (board[i][j] == 'O'&&!visit[i][j]) {
                    if (!isvaild(board, i, j, visit)) {
                    }
                }

            }
        }
    }

    private static boolean isvaild(char[][] board, int i, int j, boolean[][] visit) {
        int r = board.length;
        int c = board[0].length;

            if ((i == 0 || j == 0 || j == c - 1 || i == r - 1 || visit[i][j]) &&board[i][j]==0) {
                return false;
            }
            if(i<0&&i>=r)


        board[i][j] = 'X';
        visit[i][j] = true;
        boolean up= isvaild(board, i-1, j, visit);
        boolean down=isvaild(board, i+1, j, visit);
        boolean right=isvaild(board, i, j+1, visit);
        boolean left =isvaild(board, i, j-1, visit);
        if(up&&down&&right&&left){
        }
        else {
            board[i][j] = 'O';
        }

        return false;

    }
}








