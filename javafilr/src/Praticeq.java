import java.util.Scanner;

public class Praticeq {
    public static void main(String[]args){
       /* Scanner sc= new Scanner(System.in);
        System.out.println("1ST NUMBER");
        int i= sc.nextInt();
        System.out.println("2ND NUMBER");
        int j= sc.nextInt();
        System.out.println("3RD NUMBER");
        int k= sc.nextInt();
        calAvrage(i,j,k);
        System.out.println(" ENTER THE n NUMBER");
        int n= sc.nextInt();
        sumAllOdds(n);
        System.out.println("Grater number");
        int num=graterNum(i,j);
        System.out.println(num);*/

       /* System.out.println("ENTER THE RADIUS OF CIRCLE");
        Scanner sc=new Scanner(System.in);
        double r= sc.nextFloat();
        double cir= getCircleRadius(r);
        System.out.println("CIRCUMFERENCE OF CIRCLE");
        System.out.println(cir);*/

       /* Scanner sc=new Scanner(System.in);
        System.out.println("ENTER YOUR AGE");
        int age= sc.nextInt();
        System.out.println(ageEligible(age));*/


        // calculate x^n
      /*  Scanner sc=new Scanner(System.in);
        System.out.println("enter value of X");
        int x= sc.nextInt();
        System.out.println("enter value of N");
        int n= sc.nextInt();
        int cal= calPower(x,n);
        System.out.println("ANSWER= " + cal);*/


       /* Scanner sc=new Scanner(System.in);
        System.out.println("enter value of n");
        int n= sc.nextInt();
        fibonacciSeries(n);*/


        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of a");
        int a= sc.nextInt();
        System.out.println("enter value of b");
        int b= sc.nextInt();
        greatestCommonDivisor(a,b);
    }
   /* static public void calAvrage(int a, int b, int c){
        int avg =(a+b+c)/3;
        System.out.println("AVRAGE OF 3 NUMBER =" +avg);
    }
    static public void sumAllOdds(int a){
        int sum=0;
        for(int i=1; i<=a; i++){
            if(i%2 !=0) {
                sum = i + sum;
            }
        }
        System.out.println("SUM OF ALL ODD NUMBER=" +sum);
    }
    static public int graterNum( int a, int b){
        if(a>b)
            return a;
        else
            return b;

    }*/
  /* public static double getCircleRadius(double a){

        return 2*3.14*a;
    }*/
  /*  public static boolean ageEligible(int a){
        if(a>=18)
            return true;
        else
            return false;
    }
    public static int calPower( int a ,int b){
        int ans=1;
        for(int i=b; i>=1; i--){
            ans=ans*a;
        }
        return ans;
    }*/
   /* public static void fibonacciSeries( int n){
        int s1=0;
        int s2=1;
        int c=0;
        System.out.print(s1 + " ");
        System.out.print(s2 + " ");
        for(int i=3; i<=n; i++){
            c=s1;
            s1=s2;
            s2=c+s2;
            System.out.print(s2 +" ");
        }
    }*/
    public static void greatestCommonDivisor( int a ,int b){
        int gcd=1;
        for(int i=1; i<=a; i++){
            if((a%i==0)&&(b%i==0)){
              gcd=i;
            }
        }
        System.out.println("GREATEST COMMON DIVISOR IS=" + gcd);
    }

}


