package LearnMultithreading;
class function extends Thread{
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Current thread=" + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Test1 {
    public static void main(String[] args) {
        Test t1=new Test();
        t1.setName("B");
        t1.start();
        for(int i=0; i<5; i++) {
            System.out.println("Current thread=" + Thread.currentThread().getName());
        }

    }
}
