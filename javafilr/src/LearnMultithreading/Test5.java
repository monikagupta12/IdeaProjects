package LearnMultithreading;

class Function2 extends Thread{
    @Override
    public void run() {
        Thread.currentThread().setName("B");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"is="+Thread.currentThread().getPriority());
        for(int i=0; i<5; i++) {
            if(Thread.currentThread().isDaemon()) {
                System.out.println("DemonThread");
            }
            else{
                System.out.println("CurrentThread is="+Thread.currentThread().getName()+"---"+i);
                try {
                    Thread.sleep(2000);
                }
                catch(Exception e){
                    e.printStackTrace();
                }

            }

        }

    }
}
class Function3 extends Thread{
    @Override
    public void run() {
        Thread.currentThread().setName("C");
        Thread.currentThread().setPriority(8);
        System.out.println(Thread.currentThread().getName()+"is="+Thread.currentThread().getPriority());
        for(int i=0; i<5; i++) {
            if(Thread.currentThread().isDaemon()) {
                System.out.println("DemonThread");
            }
            else{
                System.out.println("CurrentThread is="+Thread.currentThread().getName()+"---"+i);
                try {
                    Thread.sleep(2000);
                }
                catch(Exception e){
                    e.printStackTrace();
                }

            }

        }

    }
}
public class Test5 {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()+"is"+Thread.currentThread().getPriority());
        Function2 f2=new Function2();
        f2.setPriority(1);
        f2.start();
        Function3 f3=new Function3();
        f3.start();
        for(int i=0; i<5; i++) {
            System.out.println("MainThread---"+i);
            try {
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
