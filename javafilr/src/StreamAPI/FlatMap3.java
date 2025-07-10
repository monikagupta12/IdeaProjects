package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student{
    String name;
    int id;
    char grade;
    Student(String name,int id,char grade){
        this.name=name;
        this.id=id;
        this.grade=grade;
    }
}
public class FlatMap3 {
    public static void main(String[] args) {
//        List<MarksCalculation> list1= Arrays.asList(new MarksCalculation("Smith",101,'A'),
//                new MarksCalculation("John",102,'B'),
//                new MarksCalculation("Kenedy",103,'C')
//        );
//        List<MarksCalculation> list2= Arrays.asList(new MarksCalculation("Scott",104,'A'),
//                new MarksCalculation("Marry",105,'B'),
//                new MarksCalculation("Kenedy",106,'C')
//        );
//        Stream<MarksCalculation> s1= list1.stream();
//        Stream<MarksCalculation> s2=list2.stream();
//        List<String> name=Stream.concat(s1,s2).map(i->i.name).limit(4).collect(Collectors.toUnmodifiableList());
//        System.out.println(name);
//
//        List<List<MarksCalculation>> students=new ArrayList<>();
//        students.add(list1);
//        students.add(list2);
//        List<String> nm=students.stream().flatMap(x->x.stream()).map(x->x.name).distinct().collect(Collectors.toUnmodifiableList());
//        System.out.println(nm);
    }
}
