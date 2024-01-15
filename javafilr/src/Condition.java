import java.util.Scanner;

public class Condition {
    public static void main ( String[] args){
      /* 1. System.out.println( "Enter age");
        Scanner sc= new Scanner( System.in);
        int age= sc.nextInt();
        if(age>=18)
            System.out.println("audlt");
        else
            System.out.println( "child");*/



       /* 2  System.out.println("enter a number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if ( num%2==0)
            System.out.println("even no");
        else
            System.out.println("odd no");*/

       /* Scanner sc= new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        if(a==b)
            System.out.println("a equal to b");
        else if(a>b)
            System.out.println("a grater then b");
        else
            System.out.println("a less than b");*/


        //SWITCH STATEMENT
      /*  System.out.println("enter a day");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        switch( num){
        case 1: System.out.println( "sunday");
        break;
        case 2: System.out.println("monday");
        break;
        case 3: System.out.println("tuesday");
        break;
        case 4: System.out.println( "wednesday");
        break;
        case 5: System.out.println("thrusday");
        break;
        case 6: System.out.println("friday");
        break;
        default: System.out.println("weekned");

        }*/
        Scanner sc =new Scanner(System.in);
        System.out.println("press 1 to continue 0r press 0 to stop");
        int countp=0;
        int countn=0;
        int countz=0;
        int input= sc.nextInt();
        while(input==1) {
            int num = sc.nextInt();
            if (num < 0) {
                countn = countn + 1;
            } else if (num == 0) {
                countz = countz + 1;
            } else {
                countp = countp + 1;
            }
            System.out.println("press 1 to continue 0r press 0 to stop");
            input = sc.nextInt();
            System.out.println("POSITIVE=" + countp);
            System.out.println("NAGETIVE=" + countn);
            System.out.println("ZEROS=" + countz);
        }







    }

}
