package DesignPartten.TemplateDesignPattern;

public class StoreShopping extends Shopping{
    public StoreShopping(boolean gift) {
        super(gift);
    }

    @Override
    public void getProduct() {
        System.out.println("Select Product and in Basket");
    }

    @Override
    public void makePayment() {
        System.out.println("Payment done by cash");
    }

    @Override
    public void deliver() {
        System.out.println("Product deliver in hand");

    }
}
