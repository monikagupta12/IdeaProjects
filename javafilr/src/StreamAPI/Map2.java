package StreamAPI;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Map2 {
    public static void main(String[] args) {
        List<String> vehicle= Arrays.asList("bus","car","bicycle","flight","train");
        vehicle.forEach(System.out::println);
        List<String> upper=vehicle.stream().map(str->str.toUpperCase()).collect(Collectors.toList());
        System.out.println(upper);
        vehicle.stream().map(str->str.toUpperCase()).forEach(i-> System.out.println(i));
        List<Integer> len=vehicle.stream().map(str->str.length()).collect(Collectors.toUnmodifiableList());
        System.out.println(len);
        vehicle.stream().map(str->str.length()).forEach(System.out::println);

    }
}
