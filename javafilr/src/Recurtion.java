import java.util.Scanner;

public class Recurtion {
    public static void printN(int n ){
        if(n==0){
            return;
        }
        System.out.println(n);
        printN(n-1);
    }
    public static void printNum( int n){
        if(n==6){
            return ;
        }
        System.out.println(n);
        printNum(n+1);
    }
    public static void sumNeturalNum(int n , int sum){
        if(n==0) {
            System.out.println(sum);
            return;
        }
        sum = sum + n;
        sumNeturalNum(n - 1, sum);
    }
    public static int factorialNum(int n ){
        if (n == 0) {
            return 1;
        }
        return n*factorialNum(n-1);
    }
    public static int powerN (int x,int n){
        if(n==0) {
            return 1;
        }
        if(x==0) {
            return 0;
        }
        return x*powerN(x,n-1);

    }
    public static void facobinalSequence(int a,int b ,int n){
        if (n==0){
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        facobinalSequence(b,c,n-1);

    }

    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printN(n);
        System.out.println("num are");
        printNum(0);
        System.out.println("sum of n is");
        sumNeturalNum(n,0);
        System.out.println("factorial of num");
       int fact= factorialNum(n);
        System.out.println(fact);
        int a= 0;
        int b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        facobinalSequence(a,b,n-2);
        System.out.println();
        System.out.println("enter x");
        int x= sc.nextInt();
        int power=powerN(x,n);
        System.out.println("x^n=");
        System.out.println(power);
    }
}
