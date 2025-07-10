package DesignPartten.TemplateDesignPattern;

public class Main {
    public static void main(String[] args) {
        Shopping s1=new OnlineShopping(true);
        Shopping s2=new StoreShopping(false);
        s1.process();
        System.out.println();
        s2.process();
    }

}
