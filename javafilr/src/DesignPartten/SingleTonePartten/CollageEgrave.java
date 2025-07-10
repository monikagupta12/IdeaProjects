package DesignPartten.SingleTonePartten;

import java.time.LocalDate;

public class CollageEgrave {
    private static CollageEgrave col=new CollageEgrave();
    private String name;
    private LocalDate startDate;
    private CollageEgrave(){
        if(col!=null){
            throw new RuntimeException("Object already Created");
        }

    }
    public static CollageEgrave createObject(String name, LocalDate date){
        col.name=name;
        col.startDate=date;
        return col;
    }
    public String toString(){
        return "Collage[ Name: "+name+" ,StartDate: "+startDate+" ]";
    }
}
