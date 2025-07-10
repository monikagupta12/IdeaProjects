package DesignPartten.StateDesignPattern;

public class SiliverCard implements Card {
    @Override
    public void currentDiscount() {
        System.out.println("10% on product");
        System.out.println("20% on eletronics");
    }
}
