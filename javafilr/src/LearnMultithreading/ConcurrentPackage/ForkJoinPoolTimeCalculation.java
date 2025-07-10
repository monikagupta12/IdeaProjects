package LearnMultithreading.ConcurrentPackage;

import java.util.Map;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinPoolTimeCalculation {
    public static void main(String[] args) {
        int pLevel;
        int thresold;
        if(args.length!=2){
            System.out.println("Parallesim or Threshold not define");
            return;
        }

        pLevel=Integer.parseInt(args[0]);
        thresold=Integer.parseInt(args[1]);
        ForkJoinPool pool=new ForkJoinPool(pLevel);
        double[] num=new double[1000000];
         for (int i=0; i<num.length; i++){
             num[i]=i;
         }
         Calculatiion task=new Calculatiion(0,num.length,num,thresold);

        int starTime= (int) System.currentTimeMillis();
         pool.invoke(task);
        int endTime= (int) System.currentTimeMillis();
        int totalTime=endTime-starTime;
        System.out.println("Start Time="+starTime+"ms");
        System.out.println("End Time="+endTime+"ms");
        System.out.println("Totao Execution Time=" +totalTime+"ms");
    }
}
class Calculatiion extends RecursiveAction{
    int si;
    int ei;
    int threshold;
    double[] num;
    Calculatiion(int si, int ei, double[] num, int threshold){
        this.si=si;
        this.ei=ei;
        this.num=num;
        this.threshold=threshold;
    }
    protected void compute(){
        if(ei-si<threshold) {
            for (int i = si; i <ei; i++) {
                if (num[i] % 2 == 0) {
                    num[i] = Math.sqrt(num[i]);
                } else {
                    num[i] = Math.cbrt(num[i]);
                }
            }
        }
        else{
            int mid=(si+ei)/2;
            invokeAll(new Calculatiion(si,mid,num,threshold),new Calculatiion(mid,ei,num,threshold));
        }

    }
}
