package LearnMultithreading.ConcurrentPackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

public class PriorityBlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> b1=new PriorityBlockingQueue<>(3);
        for (int i=0; i<3; i++) {
            Thread producer = new Thread(() -> {
                System.out.println("Producer 1st");
                while (true) {
                    try {
                        int num = (int) (Math.random() * 100);
                        b1.put(num);
                        System.out.println("Producer =" + b1);
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
            producer.start();
        }
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
        consumer.start();
    }
}
