import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class subSet {
    public static void main(String[] args) {
        int[][] mat = {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}};
        int[][] target = {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}};
        boolean valid = findRotation(mat, target);
        System.out.println(valid);
    }

    public static boolean findRotation(int[][] mat, int[][] target) {
        int l = mat.length;
        int way = 0;
        int count = 0;
        boolean flag = false;
        while (way < 4) {
            for (int i = 0; i < l/ 2; i++) {
                for (int j = i; j < l - i - 1; j++) {
                    int temp = mat[i][j];
                    mat[i][j] = mat[l - 1 - j][i];
                    mat[l - 1 - j][i] = mat[l - 1 - i][l - 1 - j];
                    mat[l- 1 - i][l - 1 - j] = mat[j][l- 1 - i];
                    mat[j][l - 1 - i] = temp;
                }
            }
            System.out.println("-------" + way + "---------");
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < l; j++) {
                    System.out.print(mat[i][j] + " ");
                }
                System.out.println();
            }
            count = 0;
            for (int i = 0; i < l; i++) {
                for (int j = 0; j < l; j++) {
                    if (mat[i][j] == target[i][j])
                        count++;
                }
            }
            if (count == l * l) {
                flag = true;
                break;
            }
            way++;
        }
        return flag;
    }

}
