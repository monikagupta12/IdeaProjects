package DesignPartten.CompositeDesignPattern;

public class Operation implements Expression{
    Expression lt;
    Expression rt;
    String op;
    public Operation(Expression lt, Expression rt, String op) {
        this.lt = lt;
        this.rt = rt;
        this.op = op;
    }

    @Override
    public int evaluate() {
        if(op.equalsIgnoreCase("+")){
            return lt.evaluate()+ rt.evaluate();
        }
        return  lt.evaluate()* rt.evaluate();
    }
}
