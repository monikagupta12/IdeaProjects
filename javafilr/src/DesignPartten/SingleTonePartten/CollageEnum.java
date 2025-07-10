package DesignPartten.SingleTonePartten;

import java.io.Serializable;
import java.time.LocalDate;

public enum CollageEnum implements Cloneable, Serializable {
    COLLAGE("Nit srinager",LocalDate.of(2000,2,02));
    private  String name;
    private  LocalDate startDate;
    CollageEnum(String s, LocalDate of) {
        this.name=s;
        this.startDate=of;
    }
}
