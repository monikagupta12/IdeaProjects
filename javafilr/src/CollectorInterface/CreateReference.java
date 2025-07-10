package CollectorInterface;
interface UseFunction{
    public double useMe(int a,int b);
}
interface UseConstructor{
    public Option useMe();
}

class Option{
    public static int add(int a,int b){
        System.out.println("Addtion");
        return a+b;
    }
    public int mul(int a, int b){
        System.out.println("Multipicatin");
        return a*b;
    }
    public Option(){
        System.out.println("Consturctor created");
    }
}

public class CreateReference {
    public static void main(String[] args) {
        int a=5;
        int b=7;
        // static Method Reference
        UseFunction u1=Option::add;
        System.out.println(u1.useMe(a,b));

        // Constructor Reference
        UseConstructor up =Option::new;
        Option op=up.useMe();

        //non Static Method Reference
        UseFunction u2=op::mul;
        System.out.println(u2.useMe(a,b));



    }
}
