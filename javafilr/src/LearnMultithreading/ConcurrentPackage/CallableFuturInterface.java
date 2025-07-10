package LearnMultithreading.ConcurrentPackage;

import java.util.concurrent.*;

public class CallableFuturInterface {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex= Executors.newFixedThreadPool(2);
        Future<Integer>add=ex.submit(new Addition(5));
        Future<Double>sroot=ex.submit(new SquareRoot(5));
        Future<Long>fact=ex.submit(new Factorial(5));
        System.out.println("All Caculation done seairally show output");
        System.out.println("Addition="+add.get());
        System.out.println("SquareRoot="+sroot.get());
        System.out.println("Factorial="+fact.get());
        System.out.println("calculation printed");
        ex.shutdown();

    }
}
class Addition implements Callable<Integer> {
    int n;
    int sum=0;
    Addition(int n){
        this.n=n;
    }
    @Override
    public Integer call() throws Exception {
        System.out.println("Addtion done by "+Thread.currentThread().getName());
        for (int i=1; i<=n; i++){
            sum+=i;
        }
        return sum;
    }
}
class SquareRoot implements Callable<Double>{
    int n;
    SquareRoot(int n){
        this.n=n;
    }
    @Override
    public Double call() throws Exception {
        System.out.println("SquareRoot done by "+Thread.currentThread().getName());
        return Math.sqrt(n);
    }
}
class Factorial implements Callable<Long>{
    int n;
    long fact=1L;
    Factorial(int n){
        this.n=n;
    }
    @Override
    public Long call() throws Exception {
        System.out.println("Factorial done by "+Thread.currentThread().getName());
        for (int i=2; i<=n; i++){
            fact*=i;
        }
        return fact;
    }
}
