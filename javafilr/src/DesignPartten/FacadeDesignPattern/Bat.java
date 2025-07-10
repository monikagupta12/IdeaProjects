package DesignPartten.FacadeDesignPattern;

public class Bat {
    String bat;
    int cost;

    public Bat(int cost) {
        bat="Bat";
        this.cost = cost;
    }
    public String toString() {
        return "[ Name="+bat+", Cost="+ cost+"]";
    }
}
