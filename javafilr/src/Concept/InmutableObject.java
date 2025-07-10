package Concept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class Collage{
    private final String name;
    private final List<Integer> depart;
    private final int empolyee;

    Collage(String name, List<Integer> temp,  int empolyee) {
        this.name = name;
        this.empolyee = empolyee;
        depart=new ArrayList<>();
        for(int num:temp){
            depart.add(num);
        }
    }

    public String getName() {
        return name;
    }

    public List<Integer> getDepart() {
        List<Integer> temp=new ArrayList<>();
        for(int num:depart){
            temp.add(num);
        }
        return temp;
    }

    public int getempolyee() {
        return empolyee;
    }

    public String valString(){
            return "["+name+"--"+depart+"--"+empolyee+"]";
    }
}
public class InmutableObject {
    public static void main(String[] args) {
        List<Integer> depart_id= Arrays.asList(112,114,115,234);
        Collage c1=new Collage("XYZ",depart_id,12);
        Collage c2=new Collage("XYZ",depart_id,12);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c1.valString());
        System.out.println(c2.valString());

    }
}
