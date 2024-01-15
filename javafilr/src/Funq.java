import java.util.Scanner;

public class Funq {

    public static void main(String args[]) {
       /* Scanner sc= new Scanner(System.in);
        System.out.println("enter your name");
        String na= sc.nextLine();
        printMyName(na);*/

        /* Scanner sc=new Scanner(System.in);
         int i= sc.nextInt();
         int j= sc.nextInt();
         int s=sum(i,j);
         int m=mul(i,j);
        System.out.println("sum of two number");
        System.out.println(s);
        System.out.println("Multiply of two number");
        System.out.println(m);*/
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no");
        int i = sc.nextInt();

       /* System.out.println("factorial of number");
        calFact(i);*/

        calPrime(i);
        calEvenOdd(i);
        calTable(i);


    }

    public static void printMyName(String a) {
        System.out.println("My name is " + a);
        return;

    }

    public static int sum(int a, int b) {
        int s = a + b;
        return s;

    }

    public static int mul(int a, int b) {
        int s = a * b;
        return s;

    }

    public static void calFact(int a) {
        if (a < 0) {
            System.out.println("invaild number");
            return;
        } else if (a == 0) {
            System.out.println("factoriai=1");
            return;
        } else if (a == 1) {
            System.out.println("factoriai=1");
            return;
        } else {
            for (int i = a - 1; i >= 1; i--) {
                a = a * i;
            }
        }
        System.out.println("factorial=" + a);
        return;

    }

    public static void calPrime(int a) {
        if (a == 1) {
            System.out.println("not a prime number");
            return;
        } else if (a == 2) {
            System.out.println("prime number");
            return;
        } else {
            for (int i = a - 1; i > 1; i--) {
                if (a % i == 0) {
                    System.out.println("not a prime number");
                    return;
                }
            }
            System.out.println("prime number");
            return;
        }
    }
    public static void calEvenOdd( int a){
        if (a%2==0){
            System.out.println("EVEN NUMBER");
            return;
        }
        else{
            System.out.println("ODD NUMBER");
            return;
        }
    }
    public static void calTable( int a){
        System.out.println("Table of number="+ a);
        int ta=1;
        for(int i=1;i<=10;i++){
            ta=a*i;
            System.out.println(ta);

        }
        return;
    }
}








