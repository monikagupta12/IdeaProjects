package LearnMultithreading.ConcurrentPackage;

import java.util.concurrent.atomic.AtomicInteger;

public class BankAtomicInteger {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger call=new AtomicInteger(0);
        //accessOneApI
        for(int i=0; i<5; i++){
            Thread t1=new Thread(()->{
                System.out.println(Thread.currentThread().getName() +" B Decrement");
                int num= call.decrementAndGet();
                System.out.println( Thread.currentThread().getName() +" Total="+num);
            });
            t1.start();
        }
        for(int i=0; i<3; i++){
            Thread t2=new Thread(()->{
                System.out.println(Thread.currentThread().getName() +" A Increment");
                int num= call.incrementAndGet();
                System.out.println( Thread.currentThread().getName() +" Total="+num);
            });
            t2.start();
        }
        Thread.sleep(5000);
        System.out.println("final Value=");
        System.out.println(call.get());
    }
}

