package DesignPartten.CommandDesignPattern;

public class IncresesTempreture implements Command{
    @Override
    public void execute() {
        System.out.println("Increses Tempreature with +1");
    }
}
