package LearnMultithreading;
class Test9 extends Thread{
    public void run(){
        if(Thread.currentThread().isInterrupted()){
            System.out.println(" Parllel Interrpted thread");
        }
        else{
            System.out.println("thread Not Interrpted ");
        }
        for (int i=1; i<6; i++) {
            System.out.println("Parallel Thread" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Interrpation in parllel");
            }
        }
    }
}
public class Test8 extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.interrupted());
        System.out.println(Thread.interrupted());
        for (int i=1; i<6; i++){
            System.out.println("child Thread"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Test8 t1=new Test8();
        t1.start();
        t1.interrupt();
        Test9 t2=new Test9();
        t2.start();
        t2.interrupt();
        for (int i=1; i<6; i++){
            System.out.println("Main Thread"+i);
        }

    }
}
