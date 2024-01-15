import java.util.Scanner;

public class Loopq {
    public static void main( String[] args){
    /* 1. sum of n natural no
        System.out.println("enter the number");
    Scanner sc= new Scanner(System.in);
    int num= sc.nextInt();
    int sum=0;
    for(int i=1; i<=num; i++){
        sum=i+sum;

    }
        System.out.println("sum of natural num");
        System.out.println(sum);*/

        /* 2 table of a no
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        int ta = 0;
        int num= sc.nextInt();
        for( int i=1; i<=10; i++){
            ta=num*i;
            System.out.println(ta);
        }*/
        /*3 print all even no
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        for( int i=1; i<=num; i++) {
            if (i % 2 == 0)
                System.out.print(i +" ");
        }*/

       /*4 infinte loop
        for ( ; ;){
            System.out.println("MONIKA");

        }*/

        /*5 PRIME NUMBER
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        int num= sc.nextInt();
        if ( num==1)
            System.out.println("not prime number");
        else if (num==2)
            System.out.println("prime number");
        else {
            for (int i = 2; i < num; i++) {

                if (num % i != 0)
                    System.out.println("prime number");
                else
                    System.out.println("not prime number");
                break;
            }
        }*/
        /* 5 marks division
        System.out.println("enter the number 0 or 1");
        Scanner sc= new Scanner(System.in);

        int num= sc.hasNextInt();
        switch (num){
        case 0:
            break;
        case 1:{
        System.out.println("enter marks out of 100");
            int score = sc.nextInt();
            if(score>=90)
                System.out.println("this is good");
            else if (89 >= score >=60)
                System.out.println("this is also good");
            else
                System.out.println("this is good as well");
            }
            break;
            default:
                System.out.println("not a vaild input");

        }*/


    }
}
