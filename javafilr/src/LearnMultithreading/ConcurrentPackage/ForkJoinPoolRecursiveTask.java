package LearnMultithreading.ConcurrentPackage;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinPoolRecursiveTask {
    public static void main(String[] args) {
        ForkJoinPool pool=new ForkJoinPool();
        int[] num=new int[1000];
        for (int i=0; i<num.length; i++){
            num[i]=i;
        }
        Sum task=new Sum(0,num.length,num);
        double ans=pool.invoke(task);
        System.out.println("SqureRoot Ans is="+ans);

    }
}
class Sum extends RecursiveTask<Double>{
    int[] num;
    int si;
    int ei;
    int thresold=10;
    Sum(int si, int ei, int[] num){
        this.si=si;
        this.ei=ei;
        this.num=num;
    }
    @Override
    protected Double compute() {
        double sum=0;
        if(ei-si<thresold){
            System.out.println("CURRENT THREAD="+ Thread.currentThread().getName());
            for (int i=si; i<ei; i++){
                sum+=Math.sqrt(num[i]);
            }
        }
        else{
            int mid=(si+ei)/2;
            Sum s1=new Sum(si,mid,num);
            Sum s2=new Sum(mid,ei,num);
            s1.fork();
            s2.fork();
            sum=s1.join()+s2.join();
        }
        return sum;
    }
}
