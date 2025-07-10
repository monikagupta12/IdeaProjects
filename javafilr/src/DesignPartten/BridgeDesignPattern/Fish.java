package DesignPartten.BridgeDesignPattern;

public class Fish extends LivingThing {
    public Fish(BreathProcess b1) {
        super(b1);
    }

    @Override
    public void breath() {
        b1.breath();
    }
}
