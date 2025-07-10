package StreamAPI;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamQus {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        List<Integer>common=list1.stream().filter(x->list2.contains(x)).toList();
        System.out.println(common);

        String s="i like the world";
        String rev=s.chars()
                .mapToObj(x->String.valueOf((char)x))
                .reduce((oldval,val)->val+oldval).get();
        System.out.println(rev);
        String[] str=s.split(" ");
        String rev1=Arrays.stream(str)
                .reduce((oldVal,val)->val+" "+oldVal).get();
        System.out.println(rev1);
        String rev2=Arrays.stream(str)
                .map(x->new StringBuilder(x).reverse().toString())
                .reduce((oldVal,val)->oldVal+" "+val).get();
        System.out.println(rev2);

        //sum of natural num range
        int sum= IntStream.iterate(1,v->v<11, v->v+1).sum();
        System.out.println(sum);
        int sum2=IntStream.range(1,11).sum();
        System.out.println(sum2);

        //sum or firt 10 even num
       IntStream.range(1,11).map(x->2*x).forEach(x-> System.out.print(x+" "));
        System.out.println();

        //reverse array
        int[] arr={5, 1, 7, 3, 9, 6};
        int[]res=IntStream.rangeClosed(1, arr.length).map(x->arr[arr.length-x]).toArray();
        for(int n:res){
            System.out.print(n+" ");
        }
        System.out.println();

        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");

        Map<String, Long> elementCountMap = listOfStrings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map.Entry<String, Long> entry =elementCountMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(entry);

        String str1 = "ROTATOR";
        int l=str1.length();
        boolean check=IntStream.range(0,l/2).allMatch(x->str1.charAt(x)==str1.charAt(l-x-1));
        System.out.println(check);

        List<String> listStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        listStrings.stream().filter(x->Character.isDigit(x.charAt(0))).forEach(System.out::println);

        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        List<Integer>dup=listOfIntegers.stream().filter(x-> Collections.frequency(listOfIntegers,x)>1).distinct().toList();
        System.out.println(dup);
        HashSet<Integer>set=new HashSet<>();
        List<Integer>dup1=listOfIntegers.stream().filter(x->!set.add(x)).distinct().toList();
        System.out.println(dup1);

        String inputString = "Java Concept Of The Day";
        HashSet<Character> finalSet = new HashSet<>();;
        List<Character> list=inputString.chars()
                .mapToObj(x->(char)x)
                .map(x->Character.toLowerCase(x))
                .filter(x-> !finalSet.add(x))
                .filter(x->!x.equals(' ')).distinct().toList();
        System.out.println(list);


        LinkedHashMap<Character,Long> nonRepet=inputString.chars()
                .mapToObj(x->(char)x)
                .map(x->Character.toLowerCase(x))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println(nonRepet);
        nonRepet.entrySet().stream().filter(x->x.getValue()==1).limit(1).map(x-> x.getKey()).forEach(System.out::println);

        LocalDate birthDay = LocalDate.of(1985, 01, 23);
        LocalDate today = LocalDate.now();
        Period p=Period.between(birthDay,today);
        System.out.println(p);
        System.out.println(p.getYears());
        long diff= ChronoUnit.YEARS.between(birthDay,today);
        System.out.println(diff);

        //febonicc series;
        Stream.iterate(new int[]{0,1},f->new int[]{f[1],f[0]+f[1]}).map(f->f[0]).limit(10).forEach(x-> System.out.print(x+" "));
        System.out.println();
        //odd num
        Stream.iterate(new int[]{1,2},f->new int[]{f[0]+2,f[1]}).map(f->f[0]).limit(10).forEach(x-> System.out.print(x+" "));
        System.out.println();
        int xx=Integer.parseInt("12");
        System.out.println(xx);

        int num=23485;
        String s1=String.valueOf(num);
        String[] sx=s1.split("");
        int sumx=Arrays.stream(sx).collect(Collectors.summingInt(x->Integer.parseInt(x)));
        int sumy=Arrays.stream(sx).mapToInt(x->Integer.parseInt(x)).sum();
        System.out.println(sumx +"  "+sumy);

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sump=numbers.stream().mapToInt(x->x).sum();
        int sumq=numbers.stream().reduce((x,y)->x+y).get();
        int sumr=numbers.stream().collect(Collectors.summingInt(x->x));
        System.out.println( sumq +" "+sumq+" "+sumr);

        List<String> strings = List.of("apple", "banana", "cherry");
        long yy=strings.stream().flatMapToInt(x->x.chars()).mapToObj(y->(char)y).filter(x->x=='a').count();
        System.out.println(yy);

        int fac= IntStream.rangeClosed(1, 5).reduce((x, y)->x*y).getAsInt();
        System.out.println(fac);

        List<String> strings1 = List.of("apple", "banana", "cherry", "grapefruit");
        Optional<String> longest = strings1.stream().max(Comparator.comparingInt(String::length));
        System.out.println(longest);
        List<String>sorted=strings1.stream().sorted(String::compareTo).toList();
        System.out.println(sorted);

        String result=numbers.stream().map(x->String.valueOf(x)).collect(Collectors.joining(","));
        System.out.println(result);
        String xyz=numbers.stream().map(x->String.valueOf(x)).reduce((o,v)->o+","+v).get();
        System.out.println(xyz);
        Optional<Integer> op=numbers.stream().reduce((o,v)->v);
        System.out.println(op);

        List<String> words = List.of("apple banana apple", "banana cherry", "apple banana cherry");
        Map<String, Long> frequencyMap =  words.stream()
                .flatMap(x-> Arrays.stream(x.split(" ")))
                .collect(Collectors.groupingBy(String::toLowerCase,Collectors.counting()));
        System.out.println(frequencyMap);
        List<Integer> numb = List.of(123, 456, 789);
        String[] st=String.valueOf(123).split("");

         int sumcc=numb.stream()
                .flatMap(x->Arrays.stream(String.valueOf(x).split("")))
                 .mapToInt(x->Integer.parseInt(x)).sum();
        System.out.println(sumcc);

        List<String> stringp = List.of("apple", "banana", "cherry");
        Set<Character> distinctChars = stringp.stream().
                flatMapToInt(x->x.chars())
                .mapToObj(x->(char)x)
                .collect(Collectors.toSet());
        System.out.println(distinctChars);

        List<Integer> numx = Arrays.asList(223, 234, 145, 367, 289, 2001, 2289);
        List<Integer>integers=numx.stream().map(x->String.valueOf(x)).filter(x->x.startsWith("2")).map(x->Integer.parseInt(x)).toList();
        System.out.println(integers);

        String str3 = "listen";
        String str2 = "silent";
        Optional<String> ch1=str2.chars().mapToObj(x->Character.toLowerCase((char)x)).map(x->String.valueOf(x)).sorted().reduce((o,v)->o+v);
        Optional<String> ch2=str3.chars().mapToObj(x->Character.toLowerCase((char)x)).map(x->String.valueOf(x)).sorted().reduce((o,v)->o+v);

        boolean val=ch1.equals(ch2);
        System.out.println(val);
        int number = 1234;
        String sxx=String.valueOf(number);
        int sumpp=Arrays.stream(sxx.split("")) // Convert number to string and split into individual digits
                .mapToInt(x->Integer.valueOf(x)) // Map each digit to an integer
                .sum(); // Sum all the digits
        System.out.println(sumpp);

        int len =sxx.length();
        int sumxx=Arrays.stream(sxx.split(""))
                .mapToInt(x->Integer.valueOf(x))
                .map(x->(int)Math.pow(x,len))
                .sum();
     System.out.println(sumxx);
     System.out.println(Math.pow(2,4)+Math.pow(3,4)+Math.pow(4,4)+1);

     int sumyy=sxx.chars()
             .map(x->(int)Math.pow((x-'0'),len))
             .sum();
     System.out.println(sumyy);

     int arr1[] = { 2, 3, 1, 22, 11, 33, 5 };
     int max=Arrays.stream(arr1).boxed().reduce(0,(o,v)->o>v?o:v);
     System.out.println(max);
    int min=Arrays.stream(arr1).boxed().reduce(Integer.MAX_VALUE,(old,value)->old<value?old:value);
     System.out.println(min);

     int majorityArray[] = { 5, 3, 2, 1, 2, 4, 3, 2, 2, 6, 2, 3, 2, 2, 2 };
     int major=Arrays.stream(majorityArray)
             .boxed()
             .collect(Collectors
                     .groupingBy(x->x,Collectors
                             .counting()))
             .entrySet()
             .stream()
             .filter(x->x.getValue()>majorityArray.length/2)
             .map(x->x.getKey())
             .findFirst().get();

     System.out.println(major);
     String[] strings2={"A","B","C"};
     Stream.iterate(0,x->x+1).map(x->(char)(x+'A')+"_X").limit(3).forEach(x-> System.out.println(x+" "));


     List<String> names = Arrays.asList("Java", "Spring", "JPA", "Java", "Cloud", "JPA");
     Map<String,Long>longMap=names.stream()
             .filter(x->Collections.frequency(names,x)>1)
             .collect(Collectors
                     .groupingBy(x->x,Collectors.counting()));

     System.out.println(longMap);






    }
}
