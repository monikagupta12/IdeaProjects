package StreamAPI;

import java.util.List;
import java.util.stream.Stream;

public class concateMethod {
    public static void main(String[] args) {
        List<String> animals=List.of("Dog","Cat","Elephant");
        List<?> birds=List.of("peacock","parrot","Crow",1);
        Stream<String> s1=animals.stream();
        Stream<?> s2=birds.stream();
        List<?> result=Stream.concat(s1,s2).toList();
        System.out.println(result);
    }
}
