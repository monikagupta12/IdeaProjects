package DesignPartten.DecorateDesignPattern;

public class PepperionTopping implements Topping{
    Pizza p1;

    public PepperionTopping(Pizza p1) {
        this.p1 = p1;
    }

    @Override
    public int price() {
        System.out.println("Pepperion topping price 50");
        return p1.price()+extraPize+50;
    }
}
