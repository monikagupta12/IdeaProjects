package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class StudentInfo{
    String name;
    int score;
    StudentInfo(String name, int score){
        this.name=name;
        this.score=score;
    }
    public String getName(){
        return name;
    }
    public int getScore(){
        return score;
    }
}

public class ParallelStream {
    public static void main(String[] args) {
        List<StudentInfo> students= Arrays.asList(new StudentInfo("David",82),
                new StudentInfo("Bob",90),
                new StudentInfo("John",65),
                new StudentInfo("Canedy",55),
                new StudentInfo("Eric",85),
                new StudentInfo("Smith",88),
                new StudentInfo("Scott",50)
        );
        // sequantial Stream
        students.stream().filter(stu->stu.score>80).limit(3).forEach(stu-> System.out.println(stu.getName()+"-"+stu.score));

        System.out.println();
        // parallel Stream
        students.parallelStream().filter(stu->stu.score>80).limit(3).forEach(stu-> System.out.println(stu.getName()+"-"+stu.score));

        System.out.println();
        //Sequuantial-Parallel Stream
        students.stream().parallel().filter(stu->stu.score>80).limit(3).forEach(stu-> System.out.println(stu.getName()+"-"+stu.score));

    }
}
