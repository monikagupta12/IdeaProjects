package DesignPartten.ObserverDesigenPattern;

public interface Subject {
    void suscribe(Observer ob);
    void unSuscribe(String ID);
    void notifyObserver(String mesaage);
}
