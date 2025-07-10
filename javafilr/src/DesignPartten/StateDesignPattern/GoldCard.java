package DesignPartten.StateDesignPattern;

public class GoldCard implements Card{
    @Override
    public void currentDiscount() {
        System.out.println("40% on product");
        System.out.println("30% on eletronics");
        System.out.println("20% on gold");
    }
}
