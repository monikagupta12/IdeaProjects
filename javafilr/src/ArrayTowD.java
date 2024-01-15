import java.util.Scanner;

public class ArrayTowD {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ROWS OR COLUMES OF ARRAY");
        int n= sc.nextInt();
        int m= sc.nextInt();
        int a[][]=new int[n][m];
        System.out.println("ENTER ARRAY ELEMENT");
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
            a[i][j]= sc.nextInt();
            }
        }
        System.out.println("2D ARRAY is");
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.println();
        }


        //MAX NUMBER IN ARRAY
        int max=a[0][0];
        int min=a[0][0];
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]>max){
                max=a[i][j];
                }
            }
        }
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i][j]<min){
                    min=a[i][j];
                }
            }
        }
        System.out.println("MAX NUMBER IS=" +max);
        System.out.println("MIN NUMBER IS=" +min);

        //FIND AN ELEMENT IN 2D ARRAY
        System.out.println("ENTER SEARCH NUMBER");
        int s= sc.nextInt();
        int d=-1;
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++) {
                if (a[i][j] == s) {
                    d = i;
                    System.out.println("NUMBER " + s + " IS PRESENT ROW=" + i +  " POSITION IN ARRAY");
                    System.out.println("NUMBER " + s + " IS PRESENT COLUME=" + j +  " POSITION IN ARRAY");
                }
            }
        }
        if(d<0){
            System.out.println("NUMBER " +s +" IS NOT PRESENT IN ARRAY ");
        }


    }
}
