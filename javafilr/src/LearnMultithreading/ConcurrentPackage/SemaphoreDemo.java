package LearnMultithreading.ConcurrentPackage;
import java.util.concurrent.Semaphore;
public class SemaphoreDemo {
    public static void main(String[] args) {
        Semaphore s=new Semaphore(1);
        new Increment(s,"A");
        new Decrement(s,"B");
    }

}
class SharedResource{
    static int count=0;
}
class Increment {
    String name;
    Semaphore s;
    Increment(Semaphore s,String name){
        this.s=s;
        this.name=name;
        new Thread(r1).start();
    }
    Runnable r1=()->{
        System.out.println(name+" is waiting for Permit");
        try {
            s.acquire();
            System.out.println(name+"get Permit");
            for (int i=0; i<5; i++){
                SharedResource.count++;
                System.out.println(SharedResource.count);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name+" released Permit");
        s.release();
    };
}
class Decrement {
    String name;
    Semaphore s;
    Decrement(Semaphore s,String name){
        this.s=s;
        this.name=name;
        new Thread(r2).start();
    }
    Runnable r2=()->{
        System.out.println(name+" is waiting for Permit");
        try {
            s.acquire();
            System.out.println(name+"get Permit");
            for (int i=0; i<5; i++){
                SharedResource.count--;
                System.out.println(SharedResource.count);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name+" released Permit");
        s.release();
    };
}
