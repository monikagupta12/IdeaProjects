package DesignPartten.CommandDesignPattern;

public class Invoker  {
    Command AC;
    public Invoker(Command AC) {
        this.AC = AC;
    }

    public void press(){
       AC.execute();
    }
}
