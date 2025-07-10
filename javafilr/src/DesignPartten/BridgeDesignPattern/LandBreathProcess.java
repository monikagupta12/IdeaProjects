package DesignPartten.BridgeDesignPattern;

public class LandBreathProcess implements BreathProcess{
    @Override
    public void breath() {
        System.out.println("breath from nose");
        System.out.println("inhel o2");
        System.out.println("exhel co2");
    }
}
