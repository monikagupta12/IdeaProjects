package LearnMultithreading.ConcurrentPackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String> exchange=new Exchanger<>();
        ExecutorService ex=Executors.newFixedThreadPool(4);
        ex.submit(()->{
            tranfer(exchange,"Thread-ABC","ABC");
        });
        ex.submit(()->{
            tranfer(exchange,"Thread-XYZ","XYZ");
        });
        ex.shutdown();
    }
    public static void tranfer(Exchanger exch, String originalData, String transferData){
        try {
            System.out.println("OriginalData="+originalData+" TransferData="+transferData);
            String reciverdData= (String) exch.exchange(transferData);
            System.out.println("OriginalData="+originalData+" ReciverdData="+reciverdData);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
