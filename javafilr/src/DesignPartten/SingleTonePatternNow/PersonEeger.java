package DesignPartten.SingleTonePatternNow;

import java.io.Serializable;

public class PersonEeger implements Cloneable, Serializable {
    private static PersonEeger p1=new PersonEeger();
    private PersonEeger(){
        if(p1!=null){
            //to control Relfection API break // create enum class
            throw new RuntimeException("Try to break SingleTonePattern by Relfection API ");
        }
    }
    public static PersonEeger getPerson(){
        return p1;
    }
    // to control Deseralization  break
    public Object readResolve(){
        return p1;
    }
    // to control cloneable  break
    public PersonEeger clone(){
        return p1;
    }
}
