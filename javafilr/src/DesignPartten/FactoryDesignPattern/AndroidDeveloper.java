package DesignPartten.FactoryDesignPattern;

public class AndroidDeveloper implements Employee{
    @Override
    public int salary() {
        System.out.println("ANDROID DEVELOPER");
        return 50000;
    }
}
