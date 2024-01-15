import java.util.Scanner;

public class Looppattern {
    public static void main(String[] args) {
        /*1 SOILD RECTANGLE
        for(int i=1; i<6; i++){
            for(int j=1; j<5; j++){
                System.out.printf("*");
            }
            System.out.println();
        }*/
        /*2 HOLLOW RECTANGLE
        Scanner sc= new Scanner(System.in);
        System.out.println("enter width of rectangle");
        int n= sc.nextInt();
        System.out.println("enter length of rectangle");
        int m= sc.nextInt();
        for ( int i=1; i<=n; i++ ){
            for  (int j=1; j<=m ;j++){
                if( i==1 || i==n || j==1 || j==m){
                    System.out.printf("*");
                }
                else
                System.out.printf(" ");

            }
            System.out.println();
        }*/

        /*3 HALF RIGHT TRIANGLE
        for( int i=1; i<=5; i++){
            for( int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*4 INVERED TRIANGLE
        for(int i=1; i<=5; i++){
            for(int j=1; j<=(5-i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=5; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.printf("*");
            }
            System.out.println();
        }*/

        /* 5 HALF LEFT TRIANGLE
        for(int i=1; i<=8; i++){
            for(int j=1; j<=8; j++){
                if(j<=(8-i))
                System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<=5; i++){
            for(int j=1; j<=(5-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /* 6
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }*/

        /* 7
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }*/


        /*8
        int n=5;
        int count=0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                count=count+1;
                System.out.print(count +" ");
            }
            System.out.println();
        }*/


        /*9
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print("0" + " ");
                else
                    System.out.print("1" + " ");
            }
            System.out.println();
        }
        */

        /* 10 SOILD RHOMBUS
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(10-1); j++){
                if(j<=4)
                    System.out.print(" ");
                else
                    System.out.print("*");

            }
            System.out.println();
        }*/
        /*int n=5;
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= (2*n-1); j++) {
                if (j <= (n - i))
                    System.out.print(" ");
                else if(j> (n-i) && j<(2*n-i))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
         }*/


       /* int n=5;
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }

            System.out.println();
        }*/

        /* 11 NUMBER PYRAMID
        int n=5, t=1;
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(' ');
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(t +" ");
            }

            t = t + 1;
            System.out.println();
        }*/

        /*13
        int n = 5;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }


            System.out.println();
        }*/

        /* 14 DIAMOND PATTERN
        int n=4;
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
                for (int j = 1; j<= (2*i-1); j++) {
                    System.out.print("*");
                }

            System.out.println();
        }
        for(int i=n; i>=1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j<= (2*i-1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }*/

        /* BUTTERFLY PATTEN
        int n=4;
        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j<= (2*(n-i)); j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            System.out.println();
        }
        for(int i=n; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }*/










    }

}


