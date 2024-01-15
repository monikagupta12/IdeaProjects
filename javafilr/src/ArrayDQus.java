import java.util.Scanner;

public class ArrayDQus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ROWS OR COLUMES OF ARRAY");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int[n][m];
       /* System.out.println("ENTER ARRAY ELEMENT");
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]= sc.nextInt();
            }
        }

        System.out.println("2D MATRIX IS");
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int ia[][]=new int[n][m];
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                ia[i][j]=a[j][i];
            }
        }
        System.out.println("INVERS OF 2D MATRIX");
        for (int i=0;i<n;i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(ia[i][j] + " ");
            }
            System.out.println();
        }*/
        System.out.println("ENTER ARRAY ELEMENT IN SPILT ORDER");
        int ri = 0;
        int re = n - 1;
        int ci = 0;
        int ce = m - 1;
        System.out.println("2D MATRIX ELEMENT");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("SPILT MATRIX IS");
        while (ri <= re && ci <= ce) {
            for (int j = ci; j <= ce; j++) {
                System.out.print(a[ri][j] + " ");
            }
            ri++;
            System.out.println();
            for (int i = ri; i <= re; i++) {
                System.out.print(a[i][ce] + " ");
            }
            ce--;

            for (int j = ce; j >= ci; j--) {
                System.out.print(a[re][j] + " ");
            }
            re--;
            System.out.println();

            for (int i = re; i >= ri; i--) {
                System.out.print(a[i][ci] + " ");
            }
            ci++;
            System.out.println();

        }


    }
}

