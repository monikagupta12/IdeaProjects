package LearnMultithreading.ConcurrentPackage;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
class TaskCondition {
    int i=10;
    int val=10;
    ReentrantLock l;
    Condition con;
    TaskCondition(ReentrantLock l,Condition con){
        this.l=l;
        this.con=con;
    }
    public void updateValue(){
        l.lock();
        System.out.println(Thread.currentThread().getName()+" try to change value");
        if (i==16){
            try {
                val=1000;
                con.await();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        l.unlock();
    }
    public void setValue(){
        l.lock();
        System.out.println(Thread.currentThread().getName()+" update i value");
        i++;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        con.signal();
        l.unlock();
    }
}
public class LockWithCondition {
    public static void main(String[] args) {
        ReentrantLock l = new ReentrantLock(true);
        Condition con = l.newCondition();
        TaskCondition t = new TaskCondition(l,con);
        Thread t1=new Thread("Ram"){
            @Override
            public void run() {
                t.updateValue();
            }
        };
        t1.start();
        for (int i=0; i<5; i++) {
            Thread t2 = new Thread("shyam") {
                @Override
                public void run() {
                    t.setValue();
                }
            };
            t2.start();
        }
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t.val);
    }
}
