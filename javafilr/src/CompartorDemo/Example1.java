package CompartorDemo;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<Student> stu= Arrays.asList(new Student("Davis", 30),
                new Student("Martia", 50),
                new Student("Alice", 23),
                new Student("Martia", 25),
                new Student("Barry", 34),
                new Student("Martia", 35),
                new Student("James", 45)
        );
        System.out.println(stu);
        //1 Class Inhertance

        Collections.sort(stu,new StudentSort());
        System.out.println(stu);


//        //2 AnaynomousClass
//        Comparator<Student> c=new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        } ;
//        Collections.sort(stu,c);



//        //3 lambdaFunction
//        Collections.sort(stu,(a,b)->a.getName().compareTo(b.getName()));
//        System.out.println(stu);



//        //4 list class;
//        stu.sort((a,b)->a.getName().compareTo(b.getName()));
//        System.out.println(stu);


//        //5 ComparingMethod
//        Collections.sort(stu,Comparator.comparing(Student::getName));
//        System.out.println(stu);


//        //6 case insensitive class
//        Collections.sort(stu,Comparator.comparing(Student::getName, String.CASE_INSENSITIVE_ORDER));
//        System.out.println(stu);

//        //7.thenComparingMethod
//        Collections.sort(stu,Comparator.comparing(Student::getName).thenComparingInt(Student::getAge));
//        System.out.println(stu);


//        //8.Stream API
//        List<String> res=stu.stream().sorted(Comparator.comparing(Student::getName)).map(s->s.getName()).collect(Collectors.toUnmodifiableList());
//        System.out.println(res);

//        //9.reverseOrder
//        List<String>res=stu.stream().map(s->s.getName()).sorted(Comparator.reverseOrder()).collect(Collectors.toUnmodifiableList());
//        System.out.println(res);

        //10 Nullsort nullFirst,nullLast;

        List<Student> s= Arrays.asList(new Student("Davis", 30),
                new Student("Martia", 50),
                new Student("Alice", 23),
                new Student(null, 25),
                new Student("Barry", 34),
                new Student(null, 35),
                new Student(null, 45)
        );
//        //nullFIRST
//        System.out.println(s);
//        Collections.sort(s,Comparator.comparing(Student::getName,Comparator.nullsFirst(String::compareTo)));
//        System.out.println(s);

        //nullLast
        System.out.println(s);
        Collections.sort(s,Comparator.comparing(Student::getName,Comparator.nullsLast((a,b)->b.compareTo(a))));
        System.out.println(s);

        //reverseOrder,NaturalOrder
        List<Integer>arr= Arrays.asList(2,1,5,4,8,9,3);
        System.out.println(arr);
        Collections.sort(arr,Comparator.reverseOrder());
        System.out.println(arr);
        Collections.sort(arr,Comparator.naturalOrder());
        System.out.println(arr);

        arr= Arrays.asList(2,null,5,4,null,9,null);
        Collections.sort(arr,Comparator.nullsLast((a,b)->Integer.compare(b,a)));
        System.out.println(arr);


        //11 RrversedMethod
        arr= Arrays.asList(2,1,5,4,8,9,3);
        Comparator<Integer> cc=(a,b)->Integer.compare(a,b);
        Collections.sort(arr,cc.reversed());
        System.out.println(arr);

        stu= Arrays.asList(new Student("Davis", 30),
                new Student("Martia", 50),
                new Student("Alice", 23),
                new Student("Martia", 25),
                new Student("Barry", 34),
                new Student("Martia", 35),
                new Student("James", 45)
        );
//        Comparator<Student> ce=Comparator.comparing(Student::getName).thenComparing(Student::getAge);
//        System.out.println(stu);
//        Collections.sort(stu,ce);
//        System.out.println(stu);
//        Collections.sort(stu,ce.reversed());
//        System.out.println(stu);
        Map<String, Student> xx=stu.stream()
                .collect(Collectors.groupingBy(Student::getName,
                        Collectors.reducing(new Student("xxx",200),
                                BinaryOperator.maxBy(Comparator
                                        .comparing(Student::getAge)))));
        System.out.println(xx);









    }
}
