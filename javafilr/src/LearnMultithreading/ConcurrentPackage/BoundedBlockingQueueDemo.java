package LearnMultithreading.ConcurrentPackage;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BoundedBlockingQueueDemo {
    public static void main(String[] args) {
        int capacity=5;
        BlockingQueue bq=new ArrayBlockingQueue(capacity);
        for(int i=0; i<3; i++) {
            Thread t1 = new Thread(() -> {
                System.out.println("Thread A start");
                while (true) {
                    int num=(int)(Math.random()*10);
                    Producer.product(bq, num);
                }

            });
            t1.start();
        }

        Thread t2= new Thread(()->{
            System.out.println("Thread B start");
           while(true){
                Consumer.consume(bq);
           }
        });
        t2.start();

    }


}
class Producer{
    public static void product(BlockingQueue bq, int num) {
        try {
            bq.put(num);
            num++;
            System.out.println(bq);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(bq);
    }
}
class Consumer{
    public static int consume(BlockingQueue bq)  {
        int num= 0;
        try {
            num = (int) bq.take();
            System.out.println("Remove="+ num);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return num;
    }
}
