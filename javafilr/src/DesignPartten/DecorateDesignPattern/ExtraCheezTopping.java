package DesignPartten.DecorateDesignPattern;

public class ExtraCheezTopping implements Topping{
    Pizza p1;
    public ExtraCheezTopping(Pizza p1) {
        this.p1 = p1;
    }
    @Override
    public int price() {
        System.out.println("extra cheez topping price 20");
        return p1.price()+extraPize+20;
    }
}
