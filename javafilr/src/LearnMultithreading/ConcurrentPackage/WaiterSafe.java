package LearnMultithreading.ConcurrentPackage;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
class Restaurant{
    boolean isPrepared=false;
    ReentrantLock l;
    Condition con;
    Restaurant(ReentrantLock l,Condition con){
        this.l=l;
        this.con=con;
    }
    public void waiter(){
        l.lock();
        if(!isPrepared){
            System.out.println("dish can not served");
            try {
                con.await();
                System.out.println("dish can  served");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        l.unlock();
    }
    public void safe(){
        l.lock();
        System.out.println("Dish Prepared");
        isPrepared=true;
        con.signal();
        l.unlock();
    }
}
public class WaiterSafe {
    public static void main(String[] args) {
        ReentrantLock l = new ReentrantLock(true);
        Condition con = l.newCondition();
        Restaurant r=new Restaurant(l,con);
        new Thread(()->r.waiter()).start();
        new Thread(()->r.safe()).start();
    }




}
