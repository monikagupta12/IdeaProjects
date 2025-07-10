package DesignPartten.TemplateDesignPattern;

public class OnlineShopping extends Shopping{
    public OnlineShopping(boolean gift) {
        super(gift);
    }

    @Override
    public void getProduct() {
        System.out.println("Select product and in card");
    }

    @Override
    public void makePayment() {
        System.out.println("Online Payment done");
    }

    @Override
    public void deliver() {
        System.out.println("Deliver with in 7 day");
    }
}
