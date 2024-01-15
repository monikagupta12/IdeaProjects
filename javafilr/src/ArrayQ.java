import java.util.Scanner;

public class ArrayQ {
    public static void main(String []args){
       /* int p[] = {1, 2, 3, 4};
        int []b=new int[4];
        int n=4;
        int []c=new int[4];
        c[0]=5;
        c[1]=6;
        c[2]=7;
        c[3]=8;

        Scanner sc=new Scanner(System.in);
        for(int i=0; i<n;i++){
           b[i]= sc.nextInt();
        }
        for (int i=0; i<4; i++){
            System.out.println(p[i]);
        }
        for (int i=0; i< 4; i++){
            System.out.println(b[i]);
        }
        for (int i=0; i<4; i++){
            System.out.println(c[i]);
        }
        */
         // ARRAY OF NAMES
        Scanner sc=new Scanner(System.in);
        System.out.println("ARRAY SIZE");
        int n= sc.nextInt();
        String name[]=new String[n];
        System.out.println("ENTER ARRAY NAME");
        for(int i=0; i<n; i++){
            name[i]= sc.next();
        }
        System.out.println(" ARRAY IS ");
        for(int i=0; i< name.length; i++){
            System.out.print( name[i] +" ");
        }
    }
}
