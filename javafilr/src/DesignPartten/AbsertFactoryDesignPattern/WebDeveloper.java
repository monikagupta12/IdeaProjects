package DesignPartten.AbsertFactoryDesignPattern;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        return 40000;
    }

    @Override
    public String name() {
        return "Web Developer";
    }
}
