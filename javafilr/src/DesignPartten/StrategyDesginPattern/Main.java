package DesignPartten.StrategyDesginPattern;

public class Main {
    public static void main(String[] args) {
        Vechial v1=new Vechial(new SimpleDrive());
        v1.drive();
        System.out.println();
        System.out.println("change the vichal drivring stargery");
        v1.setD1(new SpecialDrive());
        v1.drive();
    }


}
