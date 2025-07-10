package CollectorInterface;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Example1 {


    public static void main(String[] args) {
        List<String> str=List.of("One","Two","Three","Four","Five","Six","Seven","Ten","Twenty");
        //toList
        List<String> res1=str.stream().collect(toList());
        System.out.print(res1);
        System.out.println();

        //toSet
        Set<String> res2=str.stream().collect(toSet());
        System.out.print(res2);
        System.out.println();

        //toMap1
        Map<String,Integer> res3=str.stream().collect(Collectors.toMap(x->x,String::length));
        System.out.print(res3);
        System.out.println();

        //toMap2
        Map<Integer,String>res4=str.stream().collect(Collectors.toMap(String::length,x->x,(value,oldvalue)->oldvalue+":"+value));
        System.out.print(res4);
        System.out.println();

        //toMap3
        Map<Integer,String>res5=str.stream().collect(Collectors.toMap(String::length,x->x,(value,oldvalue)->oldvalue+":"+value, HashMap::new));
        System.out.print(res5);
        System.out.println();

        //toCollection
        TreeSet<String> res6=str.stream().collect(Collectors.toCollection(TreeSet::new));
        System.out.print(res6);
        System.out.println();

        //Couting
        long res7=str.stream().filter(x->x.length()>3).collect(Collectors.counting());
        System.out.println(res7);

        //Joining1
        String res8=str.stream().collect(Collectors.joining());
        System.out.println(res8);

        //joining2
        String res9=str.stream().collect(Collectors.joining("=>"));
        System.out.println(res9);

        //joining3
        String res10= str.stream().collect(Collectors.joining("=>","[","]"));
        System.out.println(res10);
        System.out.println("----------");

        //Mapping
        long res11=str.stream().collect(Collectors.mapping(String::length, Collectors.summingInt(x->x)));
        System.out.print(res11);
        System.out.println();

        //PartitionBy1
        Map<Boolean,List<String>> res12=str.stream().collect(Collectors.partitioningBy(i->i.length()>3));
        System.out.println(res12);

        //PartitionBy2
        Map<Boolean,Long>res13=str.stream().collect(Collectors.partitioningBy(i->i.length()>3,Collectors.counting()));
        System.out.println(res13);

        //GroupingBy1
        Map<Integer,List<String>>res14=str.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(res14);

        //GroupingBy2
        Map<Integer,String>res15=str.stream().collect(Collectors.groupingBy(String::length,Collectors.joining("=>")));
        System.out.println(res15);
        Map<Integer,Long>res=str.stream().collect(Collectors.groupingBy(String::length,Collectors.counting()));
        System.out.println(res);
        Map<Integer,List<String>>res0=str.stream().collect(Collectors.groupingBy(String::length,HashMap::new,Collectors.mapping(x->x.toUpperCase(),Collectors.toList())));
        System.out.println(res0);


        //GroupingBy3
        Map<Integer,Long>res16=str.stream().collect(Collectors.groupingBy(String::length,HashMap::new,Collectors.counting()));
        System.out.println(res16);

        int[] arr={1,2,3,4,5,6};
        Integer[] arr1={1,2,3,4,5,6};

        //SummarizingInt
        IntSummaryStatistics res17=Arrays.stream(arr).boxed().collect(Collectors.summarizingInt(x->x));
        IntSummaryStatistics res18=Arrays.stream(arr1).collect(Collectors.summarizingInt(x->2*x));
        System.out.println("Max="+res17.getMax());
        System.out.println("Max="+res18.getMax());

        System.out.println("Min="+res17.getMin());
        System.out.println("Min="+res18.getMin());


        System.out.println("Sum="+res17.getSum());
        System.out.println("Sum="+res18.getSum());

        System.out.println("Avrage="+res17.getAverage());
        System.out.println("Avrage="+res18.getAverage());

        System.out.println("Count="+res17.getCount());
        System.out.println("Count="+res18.getCount());

        System.out.println("Class="+res17.getClass());
        System.out.println("Class="+res18.getClass());

        //maxBy
        Optional<Integer> max=Arrays.stream(arr).boxed().collect(Collectors.maxBy(Comparator.comparingInt(x->x)));
        max.ifPresent(System.out::println);

        //minBy
        Optional<Integer>min=Arrays.stream(arr).boxed().collect(Collectors.minBy(Comparator.reverseOrder()));
        min.ifPresent(System.out::println);


        //summing
        long sum=Arrays.stream(arr).boxed().collect(Collectors.summingInt(x->2*x));
        System.out.println(sum);

        //AvaringInt
        double avg=Arrays.stream(arr).boxed().collect(Collectors.averagingInt(x->x));
        System.out.println(avg);

        System.out.println("---------");
        //reducing
        Map<Integer,Optional<String>> xx=str.stream().collect(Collectors
                .groupingBy(String::length,Collectors.
                        reducing(BinaryOperator.maxBy(String::compareTo))));
        System.out.println(xx);

        Map<Boolean,Optional<String>> xx1=str.stream()
                .collect(Collectors.partitioningBy(x->"one".equals(x),
                        Collectors.reducing(
                                BinaryOperator.maxBy(Comparator
                                        .comparing(String::length)))));
        System.out.println(xx1);

        Map<Boolean,String> xx2=str.stream()
                .collect(Collectors.partitioningBy(x->"one".equals(x),
                        Collectors.reducing("zzzzzzz",
                                BinaryOperator.maxBy(Comparator
                                        .comparing(String::length)))));
        System.out.println(xx2);


        int largest=str.stream().collect(Collectors.reducing(0,String::length,BinaryOperator.minBy(Comparator.comparing(i->i))));
        System.out.println(largest);
        Optional<Integer> larg=str.stream().collect(Collectors.mapping(x->x.length(),Collectors.maxBy(Comparator.comparing(x->x))));
        System.out.println(larg.get());







    }
}
