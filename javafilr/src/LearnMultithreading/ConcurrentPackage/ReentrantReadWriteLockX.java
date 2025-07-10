package LearnMultithreading.ConcurrentPackage;

import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

class Results{
    String message="a";
    ReentrantReadWriteLock.ReadLock rl;
    ReentrantReadWriteLock.WriteLock wl;
    public Results(ReentrantReadWriteLock.ReadLock rl, ReentrantReadWriteLock.WriteLock wl) {
        this.rl = rl;
        this.wl = wl;
    }

    public void read(){
        for(int i=0; i<5; i++){
            rl.lock();
            System.out.println(Thread.currentThread().getName()+" read value ="+message);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            int ct=wl.getHoldCount();
            System.out.println(Thread.currentThread().getName()+" waiting hold count "+ct);
            rl.unlock();
        }
    }
    public void write(String str){
        wl.lock();
        System.out.println(Thread.currentThread().getName()+" update message");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        message=message+str;
        System.out.println("updated Message is: "+message);
        wl.unlock();

    }
}

public class ReentrantReadWriteLockX {
    public static void main(String[] args) {
        ReentrantReadWriteLock l=new ReentrantReadWriteLock();
        ReentrantReadWriteLock.ReadLock rl=l.readLock();
        ReentrantReadWriteLock.WriteLock wl=l.writeLock();
        Results rt=new Results(rl,wl);
        Thread r1=new Thread("A"){
            @Override
            public void run() {
                rt.read();
            }
        };
        Thread r2=new Thread("B"){
            @Override
            public void run() {
                rt.read();
            }
        };
        Thread w1=new Thread("C"){
            @Override
            public void run() {
                rt.write("abc");
            }
        };
        Thread w2=new Thread("D"){
            @Override
            public void run() {
                rt.write("abc");
            }
        }; Thread w3=new Thread("F"){
            @Override
            public void run() {
                rt.write("abc");
            }
        };
        r1.start();
        r2.start();
        w1.start();
        w2.start();
        w3.start();


    }

}
