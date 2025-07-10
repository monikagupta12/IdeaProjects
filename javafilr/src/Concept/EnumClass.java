package Concept;

import StreamAPI.Sorted1;
import com.sun.jdi.Value;

import static Concept.Direcation.*;

enum Direcation{
    EAST(5,"One"),
    WEST(10,"Two"),
    SOUTH(15,"Three"),
    NORTH(20,"Four");
    int values;
    String name;
    Direcation(int values,String name){
        System.out.println("EnumConstructor");
        this.values=values;
        this.name=name;
    }
    public static int addtion(Direcation a, Direcation b){
        return a.values+b.values;
    }
    public int doubleValue(){
        this.values=2*this.values;
        return this.values;
    }
}
public class EnumClass {


    public static void main(String[] args) {
        Direcation d1 = EAST;
        Direcation d2=Direcation.WEST;
        Direcation d3=Direcation.SOUTH;
        Direcation d4=Direcation.NORTH;
        int add=Direcation.addtion(d1,d2);
        System.out.println(add);
        int valueNew=d4.doubleValue();
        System.out.println(valueNew);
        System.out.println(d3.name);
        System.out.println(d4.values);
        Direcation[] message=Direcation.values();
        for(Direcation x:Direcation.values()){
            System.out.println(x);
        }
        for (int i=0; i<message.length; i++){
            System.out.println(message[i].values);
        }
        System.out.println("East value: "+ Direcation.valueOf("EAST"));
        System.out.println("North Index: "+d4.ordinal());
        System.out.println(Direcation.valueOf("WEST").doubleValue());


        switch(d3){
            case  EAST:{
                System.out.println("East index= "+ EAST.ordinal());
                System.out.println(EAST.values);
                break;
            }
            case  WEST:{
                System.out.println("West index= "+ WEST.ordinal());
                System.out.println(WEST.values);
                break;
            }
            case  SOUTH:{
                System.out.println("South index= "+ SOUTH.ordinal());
                System.out.println(SOUTH.values);
                break;
            }
            case NORTH:{
                System.out.println("North index= "+NORTH.ordinal());
                System.out.println(NORTH.values);
            }
            default:{
                System.out.println(" not a enum constant");
            }


        }
        System.out.println("----end-----");

    }
}
