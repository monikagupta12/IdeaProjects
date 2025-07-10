package DesignPartten.BridgeDesignPattern;

public abstract class LivingThing {
    BreathProcess b1;
    public LivingThing(BreathProcess b1) {
        this.b1 = b1;
    }
    abstract public void breath();
}
