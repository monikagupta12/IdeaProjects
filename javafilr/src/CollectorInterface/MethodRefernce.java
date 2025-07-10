package CollectorInterface;
interface Opration {
    public double option (int a, int b);
    public default Action create (){
        return new Action();
    }

}
class Action{
    public static int square(int val1, int val2) {
        return val1*val2;
    }

    public  int add(int a, int b){
        return a+b;
    }
    public  int mul(int a, int b){
        return a*b;
    }

}
public class MethodRefernce {
    public static void main(String[] args) {
        Opration op1=Action::square;
        Action a1=new Action();
        Opration op2=a1::add;
        Opration op3=a1::mul;
        System.out.println(op1.option(8,8));
        System.out.println(op2.option(2,8));;
        System.out.println(op3.option(2,8));;
    }
}
