package DesignPartten.SingleTonePatternNow;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Person p1=Person.getPerson();
        Person p2=Person.getPerson();
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        //Reflection API
        Constructor<Person> con=Person.class.getDeclaredConstructor();
        con.setAccessible(true);
        try {
            Person p3 = con.newInstance();
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
            Person p4=(Person) ois.readObject();
            System.out.println(p4.hashCode());
        }
        catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
        //Cloneable

        Person p5=p1.clone();
        System.out.println(p5.hashCode());


    }
}
