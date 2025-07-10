package DesignPartten.AbsertFactoryDesignPattern;

public class Designer implements Employee{
    @Override
    public int salary() {
        return 10000;
    }

    @Override
    public String name() {
        return "Designer";
    }
}
