package StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted1 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,4,5,6,7,8,9,10,3,4);
        List<Integer> asc=list.stream().sorted().toList();
        System.out.println(asc);
        //1
        List<Integer> desc=list.stream().sorted(Comparator.comparingInt(x->-x)).toList();
        System.out.println(desc);
        //2
        List<Integer> desc1=list.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(desc1);
        //3
        Comparator<Integer> c=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
               return Integer.compare(o2,o1);
            }
        };
        List<Integer> desc2=list.stream().sorted(c).toList();
        System.out.println(desc2);

        //4
        List<Integer> desc3=list.stream().sorted((a,b)->b.compareTo(a)).toList();
        System.out.println(desc3);

        //5
        List<Integer> desc4=list.stream().sorted((a,b)->-a.compareTo(b)).toList();
        System.out.println(desc4);
        //1
       List<String> str=Arrays.asList("a","aaa","bb","bbbbb","aaaa","aaaaa");
       List<String>out=str.stream().sorted((a,b)->Integer.compare(a.length(),b.length())).collect(Collectors.toUnmodifiableList());
       System.out.println(out);

       //2
        List<String>out2=str.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toUnmodifiableList());
        System.out.println(out2);

        //3
        List<String>out3=str.stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int l1= o1.length();
                int l2=o2.length();
                if(l1==l2){
                    return o1.compareTo(o2);
                }
                return Integer.compare(l1,l2);
            }
        }).collect(Collectors.toUnmodifiableList());
        System.out.println(out3);

        //4
        List<String>out4=str.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toUnmodifiableList());
        System.out.println(out4);
        //5
        List<String>out5=str.stream().sorted().collect(Collectors.toUnmodifiableList());
        System.out.println(out5);

    }
}
