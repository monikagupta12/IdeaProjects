package StreamAPI;

import java.util.*;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        //1 list.stream()
        List<?> list = Arrays.asList("abc", 1, true, 'd', "false", 123);
        list.stream().forEach(x-> System.out.print(" "+x));
        System.out.println();

        //2 Arrays.stream(arr)
        Integer[]arr={3,5,6,3,8,9};
        Arrays.stream(arr).forEach(x-> System.out.print(" "+x));
        System.out.println();
        int[] arr1={3,5,6,3,8,9};
        Arrays.stream(arr1).forEach(x-> System.out.print(" "+x));//int stream

        Arrays.stream(arr1).boxed().forEach(x-> System.out.print(" "+x));//IntegerStream
        System.out.println();
        //3 Stream.of();
        Stream<?> s=Stream.of("abc", 1, true, 'd', "false", 123);
        s.forEach(x-> System.out.print(" "+x));
        System.out.println();

        //4 StreamBuilder<>()
        Stream.Builder<String>sm=Stream.builder();
        sm.add("abc").add("def").add("ghi");
        Stream<String>st=sm.build();
        st.forEach(x-> System.out.print(" "+x));
        System.out.println();

        Stream.Builder<Integer>builder=Stream.builder();
        builder.add(1200).add(1800).add(8900);
        Stream <Integer> sInterger=builder.build();
        sInterger.forEach(x-> System.out.print(" "+x));
        System.out.println();

        //5 itrator()
        Stream<Integer> str=Stream.iterate(100,x->x+10).limit(4);
        str.forEach(x-> System.out.print(" "+x));
        System.out.println();

        //6.genrator() :togenrate randomString
        Stream<Integer> stream=Stream.generate((new Random()::nextInt)).limit(4);
        stream.forEach(x-> System.out.print(" "+x));
        System.out.println();
        System.out.println("---------------");

        Stream<Double> dou=Stream.generate(new Random()::nextDouble).limit(4);
        dou.forEach(x-> System.out.print(" "+x));
        System.out.println();

    }
}
