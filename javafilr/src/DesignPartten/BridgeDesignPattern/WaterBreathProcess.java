package DesignPartten.BridgeDesignPattern;

public class WaterBreathProcess implements BreathProcess{
    @Override
    public void breath() {
        System.out.println("breath from grill");
        System.out.println("inhel water o2");
        System.out.println("exhel co2");
    }
}
