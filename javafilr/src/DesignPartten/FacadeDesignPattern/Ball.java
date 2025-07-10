package DesignPartten.FacadeDesignPattern;

public class Ball {
    String name;
    int cost;

    public Ball(int size) {
        name="Ball";
        this.cost = size;
    }

    @Override
    public String toString() {
        return "[ Name="+name+", Cost="+ cost+"]";
    }
}
