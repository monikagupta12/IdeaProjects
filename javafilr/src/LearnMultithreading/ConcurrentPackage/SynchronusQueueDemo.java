package LearnMultithreading.ConcurrentPackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.SynchronousQueue;

public class SynchronusQueueDemo {
    public static void main(String[] args) {
        BlockingQueue b1=new SynchronousQueue();
        Thread producer=new Thread(()->{
            System.out.println("Producer 1st");
            while (true){
                try {
                    int num=(int)(Math.random()*100);
                    System.out.println("num="+num);
                    b1.put(num);
                    System.out.println("Producer ="+b1);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread consumer=new Thread(()->{
            System.out.println("Consumer 1st");
            while (true){
                try {
                    int num= (int) b1.take();
                    System.out.println("Consumer="+num);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        producer.start();
        consumer.start();
    }
}
