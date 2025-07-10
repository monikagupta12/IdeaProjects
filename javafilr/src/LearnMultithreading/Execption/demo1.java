package LearnMultithreading.Execption;
class NegtiveAgeException extends RuntimeException{
    NegtiveAgeException(String msg){
        super(msg);
    }
}
class YoungerAgeException extends RuntimeException{
    YoungerAgeException(String msg){
        super(msg);
    }
}
public class demo1 {
    public static void main(String[] args) {
        int age=25;
        try {
            if (age < 0) {
                throw new NegtiveAgeException("Not a Vaild Age");
            }
            else if(age<18){
                throw new YoungerAgeException("you cant not vote");
            }
            else {
                System.out.println("you can vote");
            }
        }
        catch (NegtiveAgeException ne){
            ne.printStackTrace();
        }
        catch (YoungerAgeException ye){
            ye.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("finally block");
        }
        System.out.println("---end---");
    }
}
