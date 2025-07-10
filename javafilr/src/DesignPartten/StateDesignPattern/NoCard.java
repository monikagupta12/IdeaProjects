package DesignPartten.StateDesignPattern;

public class NoCard implements Card{
    @Override
    public void currentDiscount() {
        System.out.println(" no discount Available");
    }
}
