package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter2 {
    public static void main(String[] args) {
        List<String> list= Arrays.asList("Melisandre","sansa","jon","Daenery","joffery");
        List<String>filterList=list.stream().filter(str->str.length()>2 && str.length()<8).collect(Collectors.toList());
        System.out.println(filterList);

        list.stream().filter(str->str.length()>2 && str.length()<8).forEach(str-> System.out.println(str));
        System.out.println("---NewWay---");
        list.stream().filter(str->str.length()>2 && str.length()<8).forEach(System.out::println);

    }
}
