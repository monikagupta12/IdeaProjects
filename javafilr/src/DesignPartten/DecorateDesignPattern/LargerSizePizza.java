package DesignPartten.DecorateDesignPattern;

public class LargerSizePizza implements Pizza{

    @Override
    public int price() {
        System.out.println("LARGER size piza price 150");
        return 150;
    }
}
