package LearnMultithreading.ConcurrentPackage;
import java.rmi.AccessException;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class sharedPrinter {
    public static void main(String[] args) {
        Semaphore s=new Semaphore(2,true);
        ExecutorService ex= Executors.newFixedThreadPool(3);
        for(int i=1; i<=5; i++){
            ex.execute((Runnable) new AccessTask(i,s));
        }
        ex.shutdown();
    }
}

class AccessTask implements Runnable{
    int i;
    Semaphore s;
    AccessTask(int i,Semaphore s){
        this.i=i;
        this.s=s;
    }

    @Override
    public void run() {
        System.out.println(i+" Q- Page is Available For Print");
        try {
            Thread.sleep(5000);
            s.acquire();
            System.out.println(i+" Page Print by Printer"+Thread.currentThread().getName());
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println( i+" Page printing Complete");
        s.release();
    }
}
