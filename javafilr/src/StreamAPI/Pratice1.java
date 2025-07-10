package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Pratice1 {
    public static void main(String[] args) {
        List<Integer>marks= Arrays.asList(35,12,7,40,90,25);
        List<Integer> pass=marks.stream().filter(i->i>=35).collect(Collectors.toList());
        System.out.println(pass);
        List<Integer>grase=marks.stream().filter(i-> i<35).map(i->i+5).collect(Collectors.toUnmodifiableList());
        System.out.println(grase);
    }
}
