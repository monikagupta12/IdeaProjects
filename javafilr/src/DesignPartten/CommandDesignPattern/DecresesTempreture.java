package DesignPartten.CommandDesignPattern;

public class DecresesTempreture implements Command{
    @Override
    public void execute() {
        System.out.println("Decreses Tempreature with -1");
    }
}
