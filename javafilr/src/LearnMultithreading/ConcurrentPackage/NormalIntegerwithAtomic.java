package LearnMultithreading.ConcurrentPackage;

import java.util.concurrent.atomic.AtomicInteger;

public class NormalIntegerwithAtomic {
    public static void main(String[] args) throws InterruptedException {
        AtomicInteger call=new AtomicInteger(0);
        CallCount1 c1=new CallCount1(call);
        for(int i=0; i<50; i++){
            Thread t1=new Thread(()->{
                c1.increment1();
            });
            t1.start();
        }
        for(int i=0; i<50; i++){
            Thread t2=new Thread(()->{
               c1.increment1();
            });
            t2.start();
        }
        Thread.sleep(5000);
        System.out.println("final Value=");
        System.out.println(call);
    }
}
class CallCount1{
    AtomicInteger call;
    CallCount1(AtomicInteger  call){
        this.call=call;
    }
    public void increment1(){
        System.out.println(" Welcome to API 1");
        int num =call.incrementAndGet();
        System.out.println( "API 1 is called  time with thred "+ Thread.currentThread().getName());
        System.out.println( "Total="+num);
        System.out.println(" Exit to API 1");
    }
    public void increment2(){
        System.out.println(" Welcome to API 2");
        int num =call.incrementAndGet();
        System.out.println( "API 2 is called  time with thred "+ Thread.currentThread().getName());
        System.out.println( "Total="+num);
        System.out.println(" Exit to API 1");
    }

}


