import java.util.Scanner;

public class ArrayProblem {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ROWS OR COLUMES OF ARRAY");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];

        System.out.println("ENTER ARRAY ELEMENT IN SPILT ORDER");
        int ri = 0;
        int re = n - 1;
        int ci = 0;
        int ce = m - 1;

        System.out.println("SPILT MATRIX IS");
        while (ri <= re && ci <= ce) {
            for (int j = ci; j <= ce; j++) {
                a[ri][j]= sc.nextInt();
            }
            ri++;
            for (int i = ri; i <= re; i++) {
                a[i][ce] = sc.nextInt();
            }
            ce--;

            for (int j = ce; j >= ci; j--) {
                a[re][j] = sc.nextInt();
            }
            re--;


            for (int i = re; i >= ri; i--) {
                a[i][ci] = sc.nextInt();
            }
            ci++;

        }
        System.out.println("2D MATRIX ELEMENT");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }

    }
}
