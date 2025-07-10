package DesignPartten.CommandDesignPattern;

public class FunctionTrunOff implements Command{
    @Override
    public void execute() {
        System.out.println("Trun OFF AC");
    }
}
