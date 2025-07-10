package DesignPartten.DecorateDesignPattern;

public class MediemSizePizza implements Pizza{

    @Override
    public int price() {
        System.out.println("MEDIEM size piza price 120");
        return 120;
    }
}
