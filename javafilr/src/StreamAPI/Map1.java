package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Map1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,10,15,35,20);
        list.forEach(System.out::println);
        List<Integer> output=list.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(output);
        list.stream().map(i->i*2).forEach(System.out::println);
    }
}
