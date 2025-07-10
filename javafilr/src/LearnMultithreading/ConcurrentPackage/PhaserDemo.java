package LearnMultithreading.ConcurrentPackage;

import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser p1=new Phaser(1);
        new MyThread(p1,"A");
        new MyThread(p1,"B");
        new MyThread(p1,"C");

        int currentPhase=p1.getPhase();
        p1.arriveAndAwaitAdvance();
        System.out.println("Phase "+currentPhase+" is Complete");

        currentPhase=p1.getPhase();
        p1.arriveAndAwaitAdvance();
        System.out.println("Phase "+currentPhase+" is Complete");

        currentPhase=p1.getPhase();
        p1.arriveAndAwaitAdvance();
        System.out.println("Phase "+currentPhase+" is Complete");

        p1.arriveAndDeregister();
        if(p1.isTerminated()){
            System.out.println("Phase is Complete");
        }

    }
}
class MyThread {
    Phaser p;
    String name;
    MyThread(Phaser p,String name){
        this.p=p;
        this.name=name;
        p.register();
        new Thread(r).start();
    }
    Runnable r=()->{
        System.out.println(name+" Thread Begining the Phaser");
        p.arriveAndAwaitAdvance();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name+" Thread Phaser one");
        p.arriveAndAwaitAdvance();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name+" Thread Phaser two");
        p.arriveAndDeregister();

    };


}
