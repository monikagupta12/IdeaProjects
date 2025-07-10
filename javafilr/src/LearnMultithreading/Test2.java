package LearnMultithreading;
class function1 implements Runnable{
    public void run() {
        for(int i=0; i<5; i++) {
            System.out.println("Current thread=" + Thread.currentThread().getName());
        }
    }
}

public class Test2 {
    public static void main(String[] args) {
        Test t1=new Test();
        t1.setName("R");
        t1.start();
        for(int i=0; i<5; i++) {
            System.out.println("Current thread=" + Thread.currentThread().getName());
        }
        System.out.println("end");
    }
}


