package DesignPartten.BridgeDesignPattern;

public class Main {
    public static void main(String[] args) {
        LivingThing d1=new Dog(new LandBreathProcess());
        System.out.println("Dog");
        d1.breath();
        LivingThing t2=new Tree(new TreeBreathProcess());
        System.out.println("Tree");
        t2.breath();
        LivingThing l2=new Fish(new WaterBreathProcess());
        System.out.println("Fish");
        l2.breath();
    }
}
