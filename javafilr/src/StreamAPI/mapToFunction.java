package StreamAPI;

import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class mapToFunction {


    public static void main(String[] args) {
        //mapToObj
        //mapToInt
        //mapToDouble
        //mapToLong
        int[] arr={10,24,34,80,50};
        Stream<Object> trs = Arrays.stream(arr).
                mapToObj(x->Math.sqrt(x));
        trs.forEach(System.out::print);


        System.out.println();

        System.out.println("----------------");
        double[] out1=IntStream.of(arr).mapToDouble(x->Math.sqrt(x)).toArray();
        for(double i:out1){
            System.out.print(i+" ");
        }


        System.out.println();
        LongStream resl =IntStream.of(arr).mapToLong(x->x*x*x);
        resl.forEach(System.out::print);


        System.out.println();
        double[] arr2={2.5,3.4,5.8};
        IntStream res=  DoubleStream.of(arr2).mapToInt(x->(int)(x*10));
        res.forEach(System.out::print);

        String sentence = "Hello Duke";
        List<Character> letters =
                sentence.chars()
                        .mapToObj(codePoint -> (char)codePoint)
                        .collect(Collectors.toList());
        System.out.println("letters = " + letters);

        Optional<String> rev= sentence.chars().
                mapToObj(x->String.valueOf((char)x)).
                reduce((value, oldVlalue)-> oldVlalue+value);
        System.out.println(rev);


        String str="005892300104";
//        Optional<String> zero=str.chars().mapToObj(x->String.valueOf((char)x)).filter(x->x.equals("0")).reduce((a,b)->a+b);
//        Optional<String> nonZero=str.chars().mapToObj(x->String.valueOf((char)x)).filter(x->!x.equals("0")).reduce((a,b)->a+b);
//        System.out.println(zero);
//        System.out.println(nonZero);
//        String result= zero.orElse("")+nonZero.orElse("");

        Map<Boolean,String> map=str.chars()
                .mapToObj(x->String.valueOf((char)x))
                .collect(Collectors
                        .partitioningBy(x->x.equals("0"),Collectors.joining()));
        System.out.println(map);
        String result=map.get(true)+map.get(false);
        System.out.println(result);
        Stream<String> iterated = Stream.iterate("+", s -> s.length() <= 5, s -> s + "+");
        iterated.forEach(System.out::println);

        String qus="gainjavaKnowalge";
        LinkedHashMap<Character,Long> map1=qus.chars()
                .mapToObj(x->(char)x)
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println(map1);
         Optional<Character> first= map1.entrySet().stream().filter(x->(x.getValue() ==1)).map(x->x.getKey()).findFirst();
        System.out.println(first);


    }
}
