package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMethod {
    public static void main(String[] args) {
        List<String> str= Arrays.asList("one","two","three","one");
        Optional<String> out=str.stream().findAny();
        out.ifPresent(System.out::println);

        Optional<String> out1=str.stream().findFirst();
        out1.ifPresent(System.out::println);

    }
}
