package LearnMultithreading.ConcurrentPackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) throws InterruptedException {
        ReentrantLock l=new ReentrantLock(true);
        Action a=new Action();
        Booking b1=new Booking(l,"A",a);
        Booking b2=new Booking(l,"B",a);
        b1.start();
        b2.start();
        Thread.sleep(1000);
        Booking b3=new Booking(l,"C",a);
        b3.start();
    }
}
class Action{

    void wish(ReentrantLock l,String name) throws Exception {
        System.out.println(name+"Enter in site");

        if (l.tryLock(2,TimeUnit.MILLISECONDS)) {
            System.out.println(name + " get lock");
            for (int i = 1; i < 5; i++) {
                System.out.println("hello " + name);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(name+" your seat is book");
            l.unlock();
        }
        else{
            System.out.println(name+" Sorry site Busy try Again");
        }


    }
}
class Booking extends Thread{
    ReentrantLock l;
    Action a;
    String name;
    Booking(ReentrantLock l,String name, Action a){
        this.l=l;
        this.a=a;
        this.name=name;
    }
    @Override
    public void run(){

        try {
            a.wish(l,name);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}


