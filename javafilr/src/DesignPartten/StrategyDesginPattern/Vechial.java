package DesignPartten.StrategyDesginPattern;

public  class Vechial {
    DriveStrategy d1;
    public Vechial(DriveStrategy d1) {
        this.d1 = d1;
    }
    public void setD1(DriveStrategy d1) {
        this.d1 = d1;
    }
    public void drive(){
        d1.drive();
    }
}
