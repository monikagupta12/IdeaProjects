package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class StudentMarks{
    String subject;
    int marks;

    public StudentMarks(String subject, int marks) {
        this.subject = subject;
        this.marks = marks;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}
interface Opreation{
    public void add();
}
interface Addtion{
      int sum(int a, int b);
}

public class MarksCalculation {
    public static void main(String[] args) {
        List<StudentMarks> student= Arrays.asList(new StudentMarks("English",45),
                new StudentMarks("English",45),
                new StudentMarks("Hindi",60),
                new StudentMarks("Hindi",90),

                new StudentMarks("Math",90)
        );
        Map<String,Double> map=student.stream().collect(Collectors
                .groupingBy(StudentMarks::getSubject,Collectors
                        .averagingInt(StudentMarks::getMarks)));
        map.forEach((key,value)-> System.out.println(key+"="+value));



        Opreation op2=()-> System.out.println("this is interface");
        Addtion add=(a,b)->a+b;
        System.out.println(add.sum(10,20));

    }


}
