package LearnMultithreading.ConcurrentPackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExecutor {
    public static void main(String[] args) {
        ExecutorService ex=Executors.newFixedThreadPool(3);
        for(int i=1; i<=10; i++){
            ex.submit(new Task(i));
        }
        ex.shutdown();
    }
}
class Task implements Runnable{
    int i;
    Task(int i){
        this.i=i;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println( i+" Task is completed by "+Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
