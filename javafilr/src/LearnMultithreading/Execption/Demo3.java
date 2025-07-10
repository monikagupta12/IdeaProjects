package LearnMultithreading.Execption;

public class Demo3 {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try {
            int c=divide(a,b);
            System.out.println("answer"+c);
        }
        catch (Exception e){
            e.printStackTrace();

        }
        finally {
            System.out.println("finally block");
        }
        System.out.println("---end---");
    }
    public static int divide(int a, int b){
        int c=a/b;
        return c;
    }
}
