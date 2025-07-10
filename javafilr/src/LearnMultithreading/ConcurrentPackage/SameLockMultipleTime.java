package LearnMultithreading.ConcurrentPackage;


import java.util.concurrent.locks.ReentrantLock;
class Room{
    ReentrantLock l;
    Room(ReentrantLock l){
        this.l=l;
    }
    public void enter(){
        l.lock();
        System.out.println(Thread.currentThread().getName()+" enter room");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName()+" leave room");
        l.unlock();
    }
}
class Home{
    ReentrantLock l;
    Room r;

    public Home(ReentrantLock l, Room r) {
        this.l = l;
        this.r = r;
    }
    public void enter(){
        System.out.println(Thread.currentThread().getName()+" waiting for lock");
        if(l.tryLock()) {
            System.out.println(Thread.currentThread().getName() + " enter home");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            r.enter();
            System.out.println(Thread.currentThread().getName() + " leave home");
            l.unlock();
        }
        else{
            System.out.println(Thread.currentThread().getName()+ " try Again");
        }
    }
}

public class SameLockMultipleTime {
    public static void main(String[] args) {
        ReentrantLock l=new ReentrantLock(true);
        Room r =new Room(l);
        Home h=new Home(l,r);
        Thread t1=new Thread("Ram"){
            @Override
            public void run() {
                h.enter();
            }
        };
        Thread t2=new Thread("shyam"){
            @Override
            public void run() {
                h.enter();
            }
        };
        t1.start();
        t2.start();
    }
}
