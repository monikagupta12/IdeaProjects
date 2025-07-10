package DesignPartten.FlyWeightDesignPatternGame;

public class Main {
    public static void main(String[] args) {
        Roobat roobat1=RoobatFactory.createRoobot("Humanoid");
        Roobat roobat2=RoobatFactory.createRoobot("Humanoid");
        System.out.println(roobat2);
        roobat2.display(2,2);
        System.out.println(roobat1);
        roobat1.display(1,1);
        Roobat roobat3=RoobatFactory.createRoobot("Dog");
        Roobat roobat4=RoobatFactory.createRoobot("Dog");
        System.out.println(roobat3);
        roobat3.display(2,2);
        System.out.println(roobat4);
        roobat4.display(1,1);

    }
}
