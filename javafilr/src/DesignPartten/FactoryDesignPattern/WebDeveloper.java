package DesignPartten.FactoryDesignPattern;

public class WebDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("WEB DEVELOPER");
        return 40000;
    }
}
