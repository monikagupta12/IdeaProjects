package LearnMultithreading.ConcurrentPackage;

import java.util.LinkedList;
import java.util.Queue;

public class produserConsumerProblem {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        int size=5;
        PC p1=new PC(q,size);
        for(int i=0; i<3; i++) {
            Thread t1 = new Thread(() -> {
                try {

                    p1.product();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
            t1.start();
        }
        Thread t2=new Thread(()->{
            try {
                p1.Consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t2.start();


    }
}
class PC{
    Queue<Integer> q;
    int size;
    PC(Queue<Integer> q,int size){
        this.q=q;
        this.size=size;
    }
    public void product() throws InterruptedException {
        while (true){
            synchronized (this) {
                while (q.size() == size) {
                    wait();
                }
                int num=(int)(Math.random()*100);
                q.add(num);
                System.out.println(q);
                Thread.sleep(1000);
                notify();
            }
        }
    }
    public void Consume() throws InterruptedException {
        while (true){
            synchronized (this) {
                while (q.size() == 0) {
                    wait();
                }
                int num=q.remove();
                System.out.println("remove="+num);
                Thread.sleep(1000);
                notify();
            }
        }
    }
}



