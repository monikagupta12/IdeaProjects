package LearnMultithreading;
class Count implements Runnable{
    int n;
    static int sum;
    Count(int n){
        this.n=n;
    }
    @Override
    public void run() {
        synchronized (this) {
            for (int i = 0; i < n; i++) {
                sum += i;
            }
            notify();
        }
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) {
        Count c1=new Count(6);
        Thread t1=new Thread(c1);
        t1.start();
        synchronized (t1) {
            try {
                t1.wait();
                System.out.println("totalSum=" + Count.sum);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
