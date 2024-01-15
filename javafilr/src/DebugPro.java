import java.util.Arrays;
public class DebugPro {
    public static boolean exit(char[][] board, int i, int j, boolean[][] visit, int idx, String word) {
        int r = board.length;
        int c = board[0].length;
        if (i >= r || j >= c) {
            return false;
        }
        if (!isvaild(board, i, j, visit, idx, word)) {
            return false;
        }
        if (idx == word.length() - 1) {
            return true;
        }
        char cc = board[i][j];
        visit[i][j] = true;
        boolean a = exit(board, i, j + 1, visit, idx + 1, word);
        boolean b = exit(board, i, j - 1, visit, idx + 1, word);
        boolean p = exit(board, i + 1, j, visit, idx + 1, word);
        boolean d = exit(board, i - 1, j, visit, idx + 1, word);
        visit[i][j] = false;
        return (a || b || p || d);

    }

    public static boolean isvaild(char[][] board, int i, int j, boolean[][] visit, int idx, String word) {
        int r = board.length;
        int c = board[0].length;
        return (i >= 0 && j >= 0 && i < r && j < c && board[i][j] == word.charAt(idx) && !visit[i][j]);
    }

    public static void main(String[] args) {
        char board[][] = {{'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        int r = board.length;
        int c = board[0].length;
        boolean visit[][] = new boolean[r][c];
        boolean val = exit(board, 0, 0, visit, 0, word);
        System.out.println(val);

    }
}
