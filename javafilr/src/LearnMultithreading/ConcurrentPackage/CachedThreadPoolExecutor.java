package LearnMultithreading.ConcurrentPackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolExecutor {
    public static void main(String[] args) {
        ExecutorService ex= Executors.newCachedThreadPool();
        for(int i=1; i<=10; i++){
            ex.submit(new Task(i));
        }
        ex.shutdown();
    }
}
