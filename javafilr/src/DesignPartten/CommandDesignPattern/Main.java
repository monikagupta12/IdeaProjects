package DesignPartten.CommandDesignPattern;

public class Main {
    public static void main(String[] args) {
        Invoker i1=new Invoker(new FunctionTrunOn());
        i1.press();
        Invoker i2=new Invoker(new DecresesTempreture());
        i2.press();
        Invoker i3=new Invoker(new IncresesTempreture());
        i3.press();
        Invoker i4=new Invoker(new FunctionTrunOff());
        i4.press();
    }
}
