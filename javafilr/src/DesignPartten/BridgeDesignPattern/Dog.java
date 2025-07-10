package DesignPartten.BridgeDesignPattern;

public class Dog extends LivingThing{
    public Dog(BreathProcess b1) {
        super(b1);
    }
    @Override
    public void breath() {
        b1.breath();
    }
}
