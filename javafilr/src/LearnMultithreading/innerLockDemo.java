package LearnMultithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class innerLockDemo {
    public static void main(String[] args) {
        ReentrantLock l=new ReentrantLock();
        ExecutorService ex= Executors.newFixedThreadPool(3);
        ex.execute(()->{
            try {
                Home.enter(l,"Thief");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        ex.execute(()->{
            try {
                Home.enter(l,"Person");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        ex.execute(()->{
            try {
                Home.enter(l,"Police");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });
        ex.shutdown();

    }
}
class Home {
    static public void enter(ReentrantLock l,String name)throws Exception{
        System.out.println(name+" Enter in house");

        if(l.tryLock(1, TimeUnit.MILLISECONDS)){
            Thread.sleep(1000);
            System.out.println(name+ " has House lock");
            Room.enter(l,name);
            l.unlock();
        }
        else {
            System.out.println(name + " Already SomeOne in House");
        }
    }
}
class Room {
    static public void enter(ReentrantLock l,String name) throws Exception{

        if(l.tryLock(10, TimeUnit.SECONDS)){
            System.out.println(name+ "Enter in Room");
            l.unlock();
        }
        else{
            System.out.println(name +"Already SomeOne in Room");
        }

    }
}