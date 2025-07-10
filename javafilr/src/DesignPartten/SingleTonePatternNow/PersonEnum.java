package DesignPartten.SingleTonePatternNow;

import java.io.Serializable;

public enum PersonEnum implements Cloneable, Serializable {
    INSTANCE;
    public Object readResolve(){
        return INSTANCE;
    }

}


