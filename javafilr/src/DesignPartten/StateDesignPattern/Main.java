package DesignPartten.StateDesignPattern;

public class Main {
    public static void main(String[] args) {
        Bank b1=new Bank();
        b1.addAmount(1000);
        System.out.println("Current Balance="+b1.amount);
        b1.dicount();
        System.out.println();
        b1.addAmount(10000);
        System.out.println("Current Balance="+b1.amount);
        b1.dicount();
        System.out.println();
        b1.decateAmount(2000);
        System.out.println("Current Balance="+b1.amount);
        b1.dicount();
        System.out.println();
        System.out.println("Current Balance="+b1.amount);
    }
}
