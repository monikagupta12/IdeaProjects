package LearnMultithreading.ConcurrentPackage;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapDemo {
    public static void main(String[] args) {
        Map<String ,Integer> map=new ConcurrentHashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.put("four",4);
        Thread read= new Thread(()->{
            System.out.println("Itrating Value");
            for(String s: map.keySet()){
                int val=map.get(s);
                System.out.println("key="+s+" value="+val);
            }
        });
        Thread write= new Thread(()->{
            System.out.println("modify Value");
            map.put("five",5);
        });

        read.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        write.start();
        try {
            write.join();
            System.out.println("update Itrating Value");
            for(String s: map.keySet()){
                int val=map.get(s);
                System.out.println("key="+s+" value="+val);
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
