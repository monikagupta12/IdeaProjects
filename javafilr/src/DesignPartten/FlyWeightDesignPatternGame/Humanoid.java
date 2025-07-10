package DesignPartten.FlyWeightDesignPatternGame;

public class Humanoid implements Roobat{
    String name;
    Cartoon cartoon;
    public Humanoid(String name, Cartoon cartoon) {
        this.name = name;
        this.cartoon = cartoon;
    }
    @Override
    public void display(int x, int y) {
        System.out.println(name+" roobat is display "+x+" and "+y);
    }
}
