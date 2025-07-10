package LearnMultithreading;
class Addition extends Thread{
    int a; int b;
    Addition(int a, int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public void run() {
        int c=a+b;
        System.out.println("Addition of two Number="+ c);
    }
}
class Subraction extends Thread{
    int a; int b;
    Subraction(int a, int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public void run() {
        int c=a-b;
        System.out.println("Subraction of two Number="+ c);
    }
}
class Multiplication extends Thread{
    int a; int b;
    Multiplication(int a, int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public void run() {
        int c=a*b;
        System.out.println("Multiplication of two Number="+ c);
    }
}
class Divsion extends Exception implements Runnable {
    int a; int b;
    Divsion(int a, int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public void run() {
        try {
            int c = a / b;
            System.out.println("Divsion of two Number=" + c);
        }
        catch (Exception e){
            System.out.println("not divide");
            //e.printStackTrace();
        }

    }
}


public class MultiTasksMultipleThreads {
    public static void main(String[] args)throws ArithmeticException {
        int a=50;
        int b=0;
        Addition t1=new Addition(a,b);
        t1.start();
        Subraction t2=new Subraction(a,b);
        t2.start();
        Multiplication t3=new Multiplication(a,b);
        t3.start();
        Divsion d1=new Divsion(a,b);
        Thread t4=new Thread(d1);
        t4.start();
        System.out.println("num1="+a +" num2"+ b);
        System.out.println("different Opration");

    }

}
