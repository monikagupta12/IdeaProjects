package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TerminalOpreation {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(12,49,35,67,8);
        long count=list.stream().filter(i->i>=35).count();
        System.out.println(count);

        List<String> vechical=List.of("bus","car","bycle","car","car","bike");
        vechical.forEach(System.out::println);
        System.out.println(vechical);
        List<String> distinct=vechical.stream().distinct().limit(3).collect(Collectors.toList());
        vechical.stream().distinct().forEach(System.out::println);
        System.out.println("limit 3="+distinct);
        long c1=vechical.stream().distinct().count();
        System.out.println(c1);
    }
}
