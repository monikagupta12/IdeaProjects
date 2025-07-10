package LearnMultithreading.ConcurrentPackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CountDownLatechDemo {
    public static void main(String[] args)  {
        ExecutorService ex= Executors.newFixedThreadPool(3) ;
        CountDownLatch l1=new CountDownLatch(3);
        ex.execute(()->{
            MedicalDepartment.test(l1,"A");
        });
        ex.execute(()->{
            Bank.test(l1,"B");
        });
        ex.execute(()->{
            AcadmicaDepartment.test(l1,"C");
        });
        try {
            if(l1.await(1000,TimeUnit.MILLISECONDS)) {
                ex.execute(() -> {
                    Addimision.test();
                });
            }
            else{
                System.out.println("----Verification Faild----");
                ex.shutdown();
            }
        }
        catch(Exception e){
            throw new AdmissionFaildEecption("Verification is Not Compled");
        }
        ex.shutdown();
    }
}
class AdmissionFaildEecption extends RuntimeException{
    AdmissionFaildEecption(String message){
        super(message);
    }
}
class MedicalDepartment{
    static void test( CountDownLatch l1,String name){
        try {
            System.out.println(name +" Thread Started Medical");
            for (int i=1; i<3; i++){
                System.out.println("Medical Part "+i+" Started");
                Thread.sleep(10);
            }
            System.out.println(name +" thread Medical Report Completed");
            l1.countDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Bank{
    static void test( CountDownLatch l1,String name){
        try {
            System.out.println(name +" Thread Started BankWork");
            for (int i=1; i<3; i++){
                System.out.println("BankWork Part "+i+" Started");
                Thread.sleep(10);
            }
            System.out.println(name +" thead FeesDeposit Completed");
            l1.countDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
class AcadmicaDepartment{
    static void test( CountDownLatch l1,String name){
        try {
            System.out.println(name +" Thread Started Masks Verfication");
            for (int i=1; i<3; i++){
                System.out.println("Masks Verfication Part "+i+" Started");
                Thread.sleep(10);
            }
            System.out.println(name +" thead Masks Verfication completed");
            l1.countDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
class Addimision{
    static void test(){
        System.out.println(" Your verification isCompleted");
        System.out.println(" Welcome to OUR collage");
        System.out.println(" Start your classes");
    }
}
