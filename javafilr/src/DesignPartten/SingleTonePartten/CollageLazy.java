package DesignPartten.SingleTonePartten;

import LearnMultithreading.Synchronization;

import java.io.Serializable;
import java.time.LocalDate;

public class CollageLazy implements Serializable,Cloneable {
    private static CollageLazy col;
    private String name;
    private LocalDate startDate;
    private CollageLazy(){
        // to avoid the relfection API breaking
        if(col!=null){
            throw new RuntimeException("Object already Created");
        }
    }
    public static CollageLazy createObject(String name, LocalDate date){
        if(col==null){
            col = new CollageLazy();
        }
        col.name=name;
        col.startDate=date;
        return col;
    }
    @Override
    public String toString(){
        return "Collage[ Name: "+name+" ,StartDate: "+startDate+" ]";
    }
    //to avoid serialization breaking
    public Object readResolve(){
        return col;
    }
    @Override
    public CollageLazy clone() throws CloneNotSupportedException {
        //to avoid Cloning
        //return (CollageLazy) super.clone();
        return col;
    }
}
