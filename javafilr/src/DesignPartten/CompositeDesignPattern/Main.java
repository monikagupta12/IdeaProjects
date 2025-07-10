package DesignPartten.CompositeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Operation op1=new Operation(new Number(5),new Number(6),"*");
        Operation op2=new Operation(new Number(4),op1,"+");
        int ans=op2.evaluate();
        System.out.println(ans);
    }
}
