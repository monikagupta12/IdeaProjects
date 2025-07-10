package DesignPartten.SingleTonePatternNow;

import java.io.Serializable;

public class Person implements Cloneable, Serializable {
    private static Person p1=null;
    private Person(){
        if(p1!=null){
            //to control Relfection API break // create enum class
            throw new RuntimeException("Try to break SingleTonePattern by Relfection API ");
        }
    }
    public static Person getPerson(){
        if(p1==null){
            //for multithread Enivorment
            synchronized (Person.class){
                if(p1==null){
                    p1=new Person();
                }
            }
        }
        return p1;
    }
    // to control Deseralization  break
    public Object readResolve(){
        return p1;
    }
    // to control cloneable  break
    public Person clone(){
        return p1;
    }
}
