package DesignPartten.SingleTonePartten;

import java.time.LocalDate;

public class Breaking3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //by create clone Object
        CollageLazy collage1=CollageLazy.createObject("Mnit Jaipur", LocalDate.of(2000,2,02));
        System.out.println(collage1.hashCode());
        System.out.println(collage1);
        CollageLazy collage2=collage1.clone();
        System.out.println(collage2.hashCode());
        System.out.println(collage2);
    }
}
