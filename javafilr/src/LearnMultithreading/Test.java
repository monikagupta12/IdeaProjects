package LearnMultithreading;

public class Test extends Thread{
    @Override
    public void run() {
        Thread.currentThread().setName("T1");
        for(int i=0; i<5; i++) {
            System.out.println("Current thread=" + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {
        Test t1=new Test();
        t1.start();
        Thread.currentThread().setName("A");
        for(int i=0; i<5; i++) {
            System.out.println("Current thread=" + Thread.currentThread().getName());
        }
        Thread.currentThread().setName("B");
        System.out.println("Current thread" + Thread.currentThread().getName());
        System.out.println("main="+Thread.currentThread().isAlive());
        System.out.println("t1="+t1.isAlive());
    }
}
