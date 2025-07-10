package LearnMultithreading.ConcurrentPackage;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinPoolRecursiveAction {
    public static void main(String[] args) {
        ForkJoinPool pool=new ForkJoinPool();
        int[] num=new int[1000];
        for(int i=0; i< num.length; i++){
            num[i]=i;
        }
        for(int i=0; i<=10; i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        Square task=new Square(0,num.length,num);
        pool.invoke(task);
        for(int i=0; i<=10; i++){
            System.out.print(num[i]+" ");
        }
    }
}
class Square extends RecursiveAction{
    int threshold=10;
    int si;
    int ei;
    int[] num;
    Square(int si, int ei, int[] num){
        this.si=si;
        this.ei=ei;
        this.num=num;
    }
    @Override
    protected void compute() {
        if(ei-si<threshold){
            System.out.println("current Thread"+Thread.currentThread().getName());
            for(int i=si; i<ei; i++){
                num[i]=num[i]*num[i];
            }
        }
        else{
            int mid=(si+ei)/2;
            invokeAll(new Square(si,mid,num),new Square(mid,ei,num));
        }
    }
}