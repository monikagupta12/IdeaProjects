package LearnMultithreading.ConcurrentPackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayedBlockingQueue {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<MyDelay> b1=new DelayQueue<>();
        b1.put(new MyDelay(700,7));
        b1.put(new MyDelay(100,1));
        b1.put(new MyDelay(500,5));
        b1.put(new MyDelay(200,2));
        b1.put(new MyDelay(400,4));

        while (!b1.isEmpty()){
            MyDelay temp=b1.take();
            System.out.println(temp.data);
        }

    }
}
class MyDelay implements Delayed{
    int data;
    long time;
    MyDelay(int data, int delalyTime){
        this.data=data;
        this.time= System.currentTimeMillis() + delalyTime;
    }
    @Override
    public long getDelay(TimeUnit unit) {
        long diff=time-System.currentTimeMillis();
        return diff ;
    }

    @Override
    public int compareTo(Delayed o) {
        if( this.time<((MyDelay)o).time){
            return -1;
        }
        else if(this.time>((MyDelay)o).time){
            return 1;
        }
        return 0;
    }
}
