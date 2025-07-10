package LearnMultithreading.ConcurrentPackage;


import java.util.function.IntBinaryOperator;

public class visiblityProblem {
    public static void main(String[] args) throws InterruptedException {
        MyAccount a1=new MyAccount();
        for (int i=0; i<5; i++){
            Thread t1=new Thread("A"+i){
                public void run(){
                    System.out.println(Thread.currentThread().getName()+" start");
                    a1.Inccrement();
                }
            };
            t1.start();
        }
        for (int i=0; i<2; i++){
            Thread t2=new Thread("B"+i){
                public void run(){
                    System.out.println(Thread.currentThread().getName()+" start");
                    a1.decrement();
                }
            };
            t2.start();
        }
        Thread t2=new Thread("AB"){
            public void run(){
                System.out.println(Thread.currentThread().getName()+" start");
                a1.decrement();
            }
        };
        t2.start();
        Thread.sleep( 5000);
        System.out.println(a1.amount);
    }


}
class MyAccount{
    volatile int amount=10;
    public void Inccrement(){
        amount=amount+10;
        System.out.println(Thread.currentThread().getName()+" Inccrement value=" + amount );
    }
    public void decrement(){
        amount=amount-5;
        System.out.println(Thread.currentThread().getName()+" decrement value=" + amount );
    }
}
