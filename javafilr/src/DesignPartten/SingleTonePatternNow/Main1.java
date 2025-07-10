package DesignPartten.SingleTonePatternNow;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main1 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        PersonEnum p1=PersonEnum.INSTANCE;
        PersonEnum p2=PersonEnum.INSTANCE;
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        //Reflection API
        try {
            Constructor<PersonEnum> con=PersonEnum.class.getDeclaredConstructor();
            con.setAccessible(true);
            PersonEnum p3 = con.newInstance();
            System.out.println(p3.hashCode());
        }
        catch (Exception e){
            System.out.println(e);
        }
        //Serilazation Process
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("abc.server"))) {
            oos.writeObject(p1);
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.server"))) {
            PersonEnum p4=(PersonEnum) ois.readObject();
            System.out.println(p4.hashCode());
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }


    }
}
