package LearnMultithreading.ConcurrentPackage;

import java.util.concurrent.Phaser;

public class PhaseWithDiffrentTask {
    public static void main(String[] args) {
        Phaser p=new Phaser(0);
        p.register();
        new Thread(()->{
            Task1.Action(p,"A");
        }).start();
        p.register();
        new Thread(() -> {
            Task1.Action(p, "B");
        }).start();
        p.register();
        new Thread(()->{
            Task2.Action(p,"C");
        }).start();
        p.register();
        new Thread(() -> {
            Task2.Action(p, "D");
        }).start();

        p.register();
        new Thread(() -> {
            Task3.Action(p, "X");
        }).start();


        if(p.isTerminated()){
            System.out.println("All Task terminate;");
        }


    }
}
class Task1{
    public static void Action(Phaser p, String name){
        int phase=p.getPhase();
        System.out.println(name+" Thread Start phase" +phase);
        p.arriveAndAwaitAdvance();
        phase=p.getPhase();
        System.out.println(name+" Thread Start phase" +phase);
        p.arriveAndAwaitAdvance();
        phase=p.getPhase();
        System.out.println(name+" Thread Start phase" +phase);
        p.arriveAndDeregister();

        if(p.isTerminated()){
            System.out.println("All Task terminate;");
        }
    }
}
class Task2 {
    public static void Action(Phaser p, String name) {
        int phase = p.getPhase();
        System.out.println(name + " Thread Start phase" + phase);
        p.arriveAndAwaitAdvance();
        phase = p.getPhase();
        System.out.println(name + " Thread Start phase" + phase);
        p.arriveAndDeregister();

        if (p.isTerminated()) {
            System.out.println("All Task terminate;");
        }
    }
}

    class Task3 {
        public static void Action(Phaser p, String name) {
            int phase = p.getPhase();
            System.out.println(name + " Thread Start phase" + phase);
            p.arriveAndDeregister();
            if (p.isTerminated()) {
                System.out.println("All Task terminate;");
            }
        }
    }
