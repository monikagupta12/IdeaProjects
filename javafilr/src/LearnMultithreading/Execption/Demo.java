package LearnMultithreading.Execption;
import java.lang.*;
public class Demo {
    public static void main(String[] args) {
        int a=50;
        int b=0;
        try{
            int c=a/b;
            System.out.println("Anaswer="+c);
        }
        catch(ArithmeticException ae){
            ae.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("finally Blocked");
        }
        System.out.println("end of Prog");
    }


}
