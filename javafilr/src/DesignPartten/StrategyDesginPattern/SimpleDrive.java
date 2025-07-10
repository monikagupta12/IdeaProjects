package DesignPartten.StrategyDesginPattern;

public class SimpleDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("we have to drive only small vechial");
    }
}
