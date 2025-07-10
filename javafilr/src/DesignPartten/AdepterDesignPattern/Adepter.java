package DesignPartten.AdepterDesignPattern;

public class Adepter implements IphoneChager {
    AndroidCharger ac;
    Adepter(AndroidCharger ac){
        this.ac=ac;
    }

    @Override
    public void iphoneCharing() {
        System.out.println("iphine charege by using Adpeter with");
        ac.androidCharing();
    }
}
