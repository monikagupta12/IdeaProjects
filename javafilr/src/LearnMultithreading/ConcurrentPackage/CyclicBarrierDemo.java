package LearnMultithreading.ConcurrentPackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cy=new CyclicBarrier(4,()->{
            System.out.println("----Level is Complete----");
        });
        ExecutorService ex=Executors.newFixedThreadPool(4);
        System.out.println("----Starting 1st Level----");
        ex.submit(()->{
            try {
                Noth.action(cy,"A");
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        ex.submit(()->{
            try {
                East.action(cy,"B");
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        ex.submit(()->{
            try {
                West.action(cy,"C");
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        ex.submit(()->{
            try {
                Soth.action(cy,"D");
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        ex.submit(()->{
            try {
                Noth.action(cy,"A");
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        ex.submit(()->{
            try {
                East.action(cy,"B");
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        ex.submit(()->{
            try {
                West.action(cy,"C");
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        ex.submit(()->{
            try {
                Soth.action(cy,"D");
            } catch (BrokenBarrierException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });


        ex.shutdown();
    }
    class Noth{
        public static void action(CyclicBarrier cy, String name) throws BrokenBarrierException, InterruptedException {
            System.out.println(name+" CollectGold in North");
            cy.await();
        }
    }

    class East{
        public static void action(CyclicBarrier cy, String name) throws BrokenBarrierException, InterruptedException {
            System.out.println(name+" CollectGold in East ");
            cy.await();
        }
    }
    class West{
        public static void action(CyclicBarrier cy, String name) throws BrokenBarrierException, InterruptedException {
            System.out.println(name+" CollectGold in West");
            cy.await();
        }
    }
    class Soth{
        public static void action(CyclicBarrier cy, String name) throws BrokenBarrierException, InterruptedException {
            System.out.println(name+" CollectGold in South");
            cy.await();
        }
    }
}
