package LearnMultithreading;

public class Test4 {
    public static void main(String[] args) {
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<5; i++) {
                    System.out.println("Current thread=" + Thread.currentThread().getName());
                }
            }
        };
        Thread t1=new Thread(r1);
        t1.setName("R2");
        t1.start();
        for(int i=0; i<5; i++) {
            System.out.println("Current thread=" + Thread.currentThread().getName());
        }
        System.out.println("end");
    }
}
