package DesignPartten.SingleTonePartten;

import java.time.LocalDate;

public class Main1 {
    public static void main(String[] args) {
        CollageLazy collage1=CollageLazy.createObject("Nit Srinage", LocalDate.of(1982,8,02));
        System.out.println(collage1.hashCode());
        System.out.println(collage1);

        CollageLazy collage2=CollageLazy.createObject("Mnit Jaipur", LocalDate.of(2000,2,02));
        System.out.println(collage2.hashCode());
        System.out.println(collage2);

        CollageEgrave collage3=CollageEgrave.createObject("Nit Srinage", LocalDate.of(1982,8,02));
        System.out.println(collage3.hashCode());
        System.out.println(collage3);

        CollageEgrave collage4=CollageEgrave.createObject("Mnit Jaipur", LocalDate.of(2000,2,02));
        System.out.println(collage4.hashCode());
        System.out.println(collage4);



    }
}
