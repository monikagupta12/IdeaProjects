package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap2 {
    public static void main(String[] args) {
        List<List<String>>list= Arrays.asList(Arrays.asList("scott","Davvid","John"),
                Arrays.asList("Mary","Luna","tom"),
                Arrays.asList("kem","jony","kitty")
        );
        list.forEach(System.out::println);
        List<String>name=list.stream().flatMap(x->x.stream()).collect(Collectors.toList());
        System.out.println(name);
    }


}
