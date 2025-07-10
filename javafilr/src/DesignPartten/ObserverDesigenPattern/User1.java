package DesignPartten.ObserverDesigenPattern;

public class User1 extends Observer{


    public User1(String name, String id) {
       super( name,id);
    }

    @Override
    public void noftification(String message) {
        System.out.println("Hello "+this.name+", video on "+ message);
    }
}
