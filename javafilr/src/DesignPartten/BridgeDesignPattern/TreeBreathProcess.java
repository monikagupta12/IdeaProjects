package DesignPartten.BridgeDesignPattern;

public class TreeBreathProcess implements BreathProcess{
    @Override
    public void breath() {
        System.out.println("breath from leaves");
        System.out.println("inhel co2");
        System.out.println("exhel o2");
    }
}
