package LearnMultithreading.ConcurrentPackage;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class readonWriteArrayListDemo{
    public static void main(String[] args) throws InterruptedException {
        List<Integer> list= new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        Thread read= new Thread(()->{
            System.out.println("Itrating Value");
            for(int s: list){
                System.out.println(s);
            }
        });
        Thread write= new Thread(()->{
            System.out.println("modify Value");
            list.add(6);
        });

        read.start();
        write.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        write.join();
        System.out.println("Update Itrate Element"+Thread.currentThread().getName());
        for(int i:list){
            System.out.println(i);
        }

    }
}
