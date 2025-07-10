package DesignPartten.StrategyDesginPattern;

public class SpecialDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Drive Fast and Large vechial");
    }
}
