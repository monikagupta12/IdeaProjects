package StreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BoooleanMatch {
    public static void main(String[] args) {
        Set<String> fruites=new HashSet<>();
        fruites.add("One apple");
        fruites.add("One mango");
        fruites.add("Two apples");
        fruites.add("More grapes");
        fruites.add("Two guava");

        boolean anyMatch=fruites.stream().anyMatch(value->value.startsWith("One"));
        System.out.println(anyMatch);

        boolean allMatch=fruites.stream().allMatch(value->value.startsWith("One"));
        System.out.println(allMatch);

        boolean noneMatch=fruites.stream().noneMatch(value->value.startsWith("One"));
        System.out.println(noneMatch);

        List<Integer> list= Arrays.asList(3,15,23,21);
        anyMatch=list.stream().anyMatch(i->(i%2==0));
        System.out.println(anyMatch);

         allMatch=list.stream().allMatch(i->(i%2==0));
        System.out.println(allMatch);

        noneMatch=list.stream().noneMatch(i->(i%2==0));
        System.out.println(noneMatch);


    }
}
