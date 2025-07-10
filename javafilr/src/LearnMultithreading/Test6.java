package LearnMultithreading;
class Test7 extends Thread{
    public void run(){
        for (int i=1; i<5; i++){
            System.out.println("Parallel Thread"+i);
        }
    }
}
public class Test6 extends Thread{
    static Thread m1;
    public void run(){
        try {
            m1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i=1; i<5; i++){
            System.out.println("child Thread"+i);
        }
    }

    public static void main(String[] args)throws Exception {
       m1= Thread.currentThread();
        Test6 t1=new Test6();
        t1.start();
        Test7 t2=new Test7();
        t2.start();
        for (int i=1; i<5; i++){
            System.out.println("Main Thread"+i);
        }

    }
}
