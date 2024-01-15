import java.util.Scanner;

public class LeedcodeArray {
    public static void main(String[] args) {
       /* int num[] = {2, 4, 5, 6, 6,9};
         int target=9;
         int op[]=new int[2];
        int l=num.length;
         for (int i=0; i< l-1;i++){
             if(num[i]+num[i+1]==target){
               op[0]=i;
               op[1]=i+1;
             }
         }
        System.out.print(op[0] +" ");
        System.out.println(op[1]);
    }

        */

      /*  for (int i=0; i< num.length; i++){
        for (int j=i+1; j< num.length; j++){
            if(num[i]==num[j]){
                num=
            }

        }
        }*/


       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter target no");
        int target = sc.nextInt();
        int op = -1;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == target) {
                op = i;
            }
        }
        if (op < 0)
            System.out.println("Target inserted at=" + num.length);
        else {
            System.out.println("Target presented at=" + op);
        }

        */

      /*  Scanner sc=new Scanner(System.in);
        System.out.println("enter array length");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int b[][]=new int[n][n];
        System.out.println("enter array element");
        for (int i=0;i<n;i++){
            for( int j=0; j<n; j++){
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("ARRAY IS");
        for (int i=0;i<n;i++){
            for( int j=0; j<n; j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }

        //find an array in matrix
        System.out.println("enter element find in array");
         int target= sc.nextInt();
        boolean bool=false;
        for (int i=0;i<n;i++){
            for( int j=0; j<n; j++){
                if(a[i][j]==target) {
                    bool = true;
                }
            }
        }
        System.out.println("element in array");
        System.out.println(bool);

        int l=0;
        for (int i=0;i<n;i++){
            for( int j=0; j<n; j++){
               l=n-j-1;
               b[i][j]= a[l][i];
            }
        }
        System.out.println("ROTATED ARRAY IS");
        System.out.println();
        for (int i=0;i<n;i++){
            for( int j=0; j<n; j++){
                System.out.print(b[i][j]);
            }
            System.out.println();
        }

       */


    }
}

