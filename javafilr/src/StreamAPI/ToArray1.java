package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ToArray1 {
    public static void main(String[] args) {

        //to.Array()
        List<String> str=Arrays.asList("A","B","C","1","2","3");
        Object[] result= str.stream().toArray();
        for(Object i:result){
            System.out.print(i+" ");
        }
        System.out.println();

        //Arrays.stream();
        Integer[] arr={10,5,20,35,50};
        Object[] out= Arrays.stream(arr).
                filter(i->i%2==0).
                toArray();
        for(Object i:out){
            System.out.print(i+" ");
        }
        System.out.println();

        //Stream.of()
       Stream<?>item=Stream.of(9,88,777,"a","c");
       Object[] out2=item.toArray();
        for(Object i:out2){
            System.out.print(i+" ");
        }
        System.out.println();

        List<?> mix=Arrays.asList("A","B",12,true,"C",25,false);
        Object[] array = mix.stream().toArray();
        for(Object i:array){
            System.out.print(i+" ");
        }
        System.out.println();




    }
}
