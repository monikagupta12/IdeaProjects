package DesignPartten.NullObjectDesignPattern;

public class NullObject implements Employee{
    @Override
    public void salary() {
        System.out.println("0");
    }

    @Override
    public void Name() {
        System.out.println("No Company Employee");
    }
}
