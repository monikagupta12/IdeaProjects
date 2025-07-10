package DesignPartten.DecorateDesignPattern;

public class MashRoomTopping implements Topping{
    Pizza p1;

    public MashRoomTopping(Pizza p1) {
        this.p1 = p1;
    }

    @Override
    public int price() {
        System.out.println("extra cheez topping price 40");
        return p1.price()+extraPize+40;
    }
}
