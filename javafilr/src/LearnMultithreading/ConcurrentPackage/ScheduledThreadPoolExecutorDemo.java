package LearnMultithreading.ConcurrentPackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorDemo {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor ex= new ScheduledThreadPoolExecutor(3);
        ex.scheduleAtFixedRate(new Work(),0,1, TimeUnit.DAYS);

        //System.out.println( "is continue program forcefully Shutdown");
    }
}
class Work implements Runnable{
    @Override
    public void run() {

            System.out.println("Alaram");
            for (int i=0; i<5; i++){
                System.out.println("zz....");
            }
    }
}
