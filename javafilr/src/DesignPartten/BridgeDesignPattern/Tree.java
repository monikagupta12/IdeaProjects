package DesignPartten.BridgeDesignPattern;

public class Tree extends LivingThing{
    public Tree(BreathProcess b1) {
        super(b1);
    }

    @Override
    public void breath() {
        b1.breath();
    }
}
