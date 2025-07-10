package LearnMultithreading;

public class Test3 {
    public static void main(String[] args) {
        Thread t1=new Thread(()->{
            for(int i=0; i<5; i++) {
                System.out.println("Current thread=" + Thread.currentThread().getName());
            }
        });
        t1.start();
        Thread t2=new Thread(()->{
            for(int i=0; i<5; i++) {
                System.out.println("Current thread=" + Thread.currentThread().getName());
            }
        });
        t2.start();
        for(int i=0; i<5; i++) {
            System.out.println("Current thread=" + Thread.currentThread().getName());
        }
        System.out.println("end");
    }
}
