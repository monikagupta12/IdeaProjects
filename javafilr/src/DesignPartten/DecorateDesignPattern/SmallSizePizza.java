package DesignPartten.DecorateDesignPattern;

public class SmallSizePizza implements Pizza{
    @Override
    public int price() {
        System.out.println("SMALL size piza price 100");
        return 100;
    }
}
