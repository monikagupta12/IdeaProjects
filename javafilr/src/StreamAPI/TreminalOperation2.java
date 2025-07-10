package StreamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class TreminalOperation2 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,5,6,7,8,9,10,3,4);
        List<Integer> res=list.stream().peek(System.out::print).skip(2).toList();
        System.out.println(res);
        //count;
        long count=list.stream().filter(i->i%2==0).count();
        System.out.println(count);
        //min & max
        Optional<Integer> max=list.stream().max((a,b)->Integer.compare(a,b));//1,2,3,4,5,6,7,8,9,10
        max.ifPresent(System.out::println);
        Optional<Integer> min=list.stream().min(Comparator.reverseOrder());//10,9,8,7,6,5,4,3,2,1
        System.out.println(min.get());
        Optional<Integer> max3=list.stream().max((a,b)->-a.compareTo(b));//10,9,8,7,6,5,4,3,2,1
        System.out.println(max3.get());
        // reduce
        Optional<Integer> c2=list.stream().reduce((value,combineValue)->combineValue+value);
        c2.ifPresent(System.out::println);
        List<String> combine= List.of("a","b","c","1","2","3");
        Optional<String> com=combine.stream().reduce((value,combined)->combined+value);
        com.ifPresent(System.out::println);
        System.out.println("---end----");
    }
}
