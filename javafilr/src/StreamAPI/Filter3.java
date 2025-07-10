package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter3 {
    public static void main(String[] args) {
        List<?> list= Arrays.asList("12",null,"abc",3,null,5,true);
        list.forEach(System.out::println);
        List<?> listF=list.stream().filter(i->i!=null).collect(Collectors.toList());
        System.out.println(listF);
        list.stream().filter(i->i!=null).forEach(i-> System.out.println(i));
    }
}
