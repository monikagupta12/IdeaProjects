package LearnMultithreading.ConcurrentPackage;

import java.util.concurrent.locks.ReentrantLock;

public class DeadLockDemo {
    public static void main(String[] args) {
        ReentrantLock lock1=new ReentrantLock();
        ReentrantLock lock2=new ReentrantLock();
        Thread t1=new Thread(()->{
            try {
                AcquiesLock1.Action(lock1, lock2,"A");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();
        Thread t2=new Thread( ()->{
            try {
                AcquiesLock2.Action(lock1, lock2,"B");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        t2.start();
    }
}
class AcquiesLock1 extends Thread{

    public static void Action(ReentrantLock l1,ReentrantLock l2, String name)throws Exception {
        l1.lock();
        System.out.println(name+ " is doning some action acquirs l1 lock ");
        l2.lock();
        System.out.println(name+ " is doning some action acquirs l2 lock");

    }
}
class AcquiesLock2{
    public static void Action(ReentrantLock l1,ReentrantLock l2, String name)throws Exception {
        l2.lock();
        System.out.println(name+ " is doning some action acquirs l2 lock ");
        Thread.sleep(1000);
        l1.lock();
        System.out.println(name+ " is doning some action acquirs l1 lock");

    }
}
