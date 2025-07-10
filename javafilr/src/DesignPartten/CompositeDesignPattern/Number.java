package DesignPartten.CompositeDesignPattern;

public class Number implements Expression {
    int num;

    public Number(int num) {
        this.num = num;
    }

    @Override
    public int evaluate() {
        return num;
    }
}
