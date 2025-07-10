package DesignPartten.ObserverDesigenPattern;

public abstract class Observer {
    String id;
    String name;

    public Observer( String name,String id) {
        this.id = id;
        this.name = name;
    }

    abstract void noftification(String message);
}