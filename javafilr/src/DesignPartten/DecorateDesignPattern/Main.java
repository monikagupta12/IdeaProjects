package DesignPartten.DecorateDesignPattern;

public class Main {
    public static void main(String[] args){
        Pizza p1=new SmallSizePizza();
        System.out.println("TOTAL Price="+p1.price());
        Pizza p2=new PepperionTopping(new ExtraCheezTopping(new SmallSizePizza()));
        System.out.println("TOTAL Price="+p2.price());
    }
}
