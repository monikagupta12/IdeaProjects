package OptionalClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalClassMethod {
    public static void main(String[] args) throws Exception {

        Optional<Integer> marks=getNumger("raju");
        System.out.println(marks);
        Optional<Integer> marks1=getNumger("anjali");
        System.out.println(marks1);

        //isEmpty()
        if(marks1.isEmpty()){
            System.out.println("Student not give text");
        }


        //get
        Optional<Integer> marks2=getNumger("ram");
        System.out.println(marks2.get());

        //isPresent
        if(marks2.isPresent()){
            System.out.println("Student give test");
        }

        //Optional.of()
        //equal
        if(marks2.equals(Optional.of(95))){
            System.out.println("Student Presnet");
        }

        //ifPresent
        marks2.ifPresent(System.out::println);//consumer

        //ifPresentOrElse
        marks1.ifPresentOrElse(System.out::println,()-> inVaildBlock());

        //filter
        Optional<Integer>res=marks1.filter(x->x==95);
        res.ifPresentOrElse(System.out::println,()-> System.out.println("FilterEmpty"));

        //Map
        Optional<Integer> ans=marks2.map(x->x+10);
        System.out.println(ans);

        //flatMap
        Optional<Optional<Integer>>op1=Optional.of(Optional.of(1221));
        Optional<Integer> result=op1.flatMap(x->x.map(y->2*y));
        System.out.println("FlatMap="+result);

        // Or
        Optional<Integer> or = marks1.or(()->Optional.of(100));//default value add in or
        System.out.println(or);

        //OrElse
        Integer orElse = marks1.orElse(00);
        int xx=marks2.orElse(00);
        System.out.println(xx);
        System.out.println(orElse);

        //OrElseGet
        Integer r=marks1.orElseGet(()-> 200);
        System.out.println(r);

/*
        //OrElseThrow
        Integer rs=marks1.orElseThrow(IllegalArgumentException::new);
        System.out.println(rs);
*/

        //HashCode
        int code=marks1.hashCode();
        System.out.println(code);
        int code2=marks2.hashCode();
        System.out.println(code2);

        //toString
        String s=marks1.toString();
        System.out.println(s);



        //Stream
        Stream<?> stream=Stream.of(1,"abc",true);
        Optional<Stream<?>>out= Optional.ofNullable(stream.map(x -> "a" + 1));
        System.out.println(out);


    }
    public static void inVaildBlock(){
        System.out.println("inVaildBlock--Student Not present in Map=100");
    }

    public static Optional<Integer>getNumger(String name){
        Map<String,Integer> map=createMapStudent();
        if (!map.containsKey(name)) {
            //Optiona.Empty()
            return Optional.empty();
        }
        Integer num=map.get(name);
        //Optional.ofNullable
        return Optional.ofNullable(num);


    }

    private static Map<String, Integer> createMapStudent() {
        Map<String,Integer> map=new HashMap<>();
        map.put("sita",85);
        map.put("ram",95);
        map.put("shyam",60);
        map.put("geeta",72);
        map.put("suman",35);
        map.put("anjali",null);
        return map;
    }
}
