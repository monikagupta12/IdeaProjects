package LearnMultithreading.ConcurrentPackage;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class copyOnWriteSetDemo {
    public static void main(String[] args) throws InterruptedException {
        Set<Integer> set=new CopyOnWriteArraySet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        ExecutorService ex=Executors.newFixedThreadPool(2);
        Thread read= new Thread(()->{
            System.out.println("Itrating Value");
            for(int s: set){
                System.out.println(s);
            }
        });
        Thread write= new Thread(()->{
            System.out.println("modify Value");
            set.add(6);
        });
        read.start();
        write.start();
        write.join();
        System.out.println("Update Itrate Element "+Thread.currentThread().getName());
        for(Integer i:set){
            System.out.println(i);
        }

    }
}
