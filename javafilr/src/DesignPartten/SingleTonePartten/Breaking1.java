package DesignPartten.SingleTonePartten;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.time.LocalDate;

public class Breaking1 {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //by create relfected API
//        CollageLazy collage1=CollageLazy.createObject("Mnit Jaipur", LocalDate.of(2000,2,02));
//        System.out.println(collage1.hashCode());
//
//        Constructor<CollageLazy> constructor=CollageLazy.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        CollageLazy collage2= (CollageLazy) constructor.newInstance();
//        System.out.println(collage2.hashCode());
//
//        System.out.println(collage1);
//        System.out.println(collage2);
//        System.out.println("------");

        //solution
        //1 if object exit throw run time execption in constructor
        //2 use enum inplace or class
        CollageEnum col1=CollageEnum.COLLAGE;
        System.out.println(col1.hashCode());

        Constructor<CollageEnum> collageEnumConstructor=CollageEnum.class.getDeclaredConstructor();
        CollageEnum col2=collageEnumConstructor.newInstance();
        System.out.println(col2.hashCode());



    }
}
