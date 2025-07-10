package DesignPartten.AdepterDesignPattern;

import javax.crypto.spec.PSource;

public class Main {
    public static void main(String[] args) {
        IphoneChager i1=new IphoneChargerCompany1();
        i1.iphoneCharing();
        AndroidCharger a1=new AndroidChargerCompany1();
        a1.androidCharing();
        System.out.println();
        System.out.println(" if iPhone charger not work");
        IphoneChager i2=new Adepter(a1);
        i2.iphoneCharing();
    }
}
