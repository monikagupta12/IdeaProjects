package StreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {


    public static void main(String[] args) {
        List<Integer> list =Arrays.asList(5,10,10,15,30,15,35,20,30);
        List<Integer> even=list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(even);
        list.stream().filter(i->i%2==0).forEach(i-> System.out.println(i));
        System.out.println("---NewWay---");
        list.stream().filter(i->i%2==0).forEach(System.out::println);
        List<Integer> unique=list.stream().filter(x-> Collections.frequency(list,x)<=1).toList();
        System.out.println(unique);
        String s="12345";
        int sum=s.chars().map(x->x-'0').sum();
        double avg =s.chars().map(x->x-'0').average().getAsDouble();
        System.out.println(sum);
        System.out.println(avg);

    }


}
