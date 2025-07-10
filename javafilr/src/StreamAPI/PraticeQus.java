package StreamAPI;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

class EmployeeInfo{
    private String name;
    private double salary;
    private String gender;
    private Date joiningDate;
    EmployeeInfo(String name, double salary,Date joiningDate,String gender){
        this.name=name;
        this.salary=salary;
        this.gender=gender;
        this.joiningDate=joiningDate;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public String getGender(){
        return gender;
    }
    public void setGender(String gender){
        this.gender=gender;
    }
    public Date getJoiningDate(){
        return joiningDate;
    }
    public void setJoiningDate(Date joiningDate){
        this.joiningDate=joiningDate;
    }

    @Override
    public String toString(){
        return "["+name+"/"+ salary+"/"+gender+"/"+joiningDate+"]";
    }

}
public class PraticeQus {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-mm-yyyy");
        Date jdr=dateFormat.parse("01-01-2000");
        Date jds=dateFormat.parse("15-05-1995");
        Date jdv=dateFormat.parse("10-12-1998");
        Date jdm=dateFormat.parse("20-03-1990");


        List<EmployeeInfo> emp= Arrays.asList(
                new EmployeeInfo("Ram",50000,jdr,"M"),
                new EmployeeInfo("Sita",40000,jds,"F"),
                new EmployeeInfo("Vishnu",20000,jdv,"M"),
                new EmployeeInfo("Mahesh",70000,jdm,"M")

        );

        Optional<EmployeeInfo> maxSalary=emp.stream().max((a, b)->Double.compare(a.getSalary(),b.getSalary()));
        System.out.println("MAX SALARY");
        maxSalary.ifPresent(System.out::println);

        Optional<EmployeeInfo> maxSalary1=emp.stream().max(Comparator.comparing(EmployeeInfo::getSalary));
        maxSalary1.ifPresent(System.out::println);

        System.out.println("SECOND Max Salary");
        Optional<EmployeeInfo> secMax=emp.stream().sorted((a, b)->Double.compare(b.getSalary(),a.getSalary())).skip(1).findFirst();
        secMax.ifPresent(System.out::println);
        System.out.println("Senior Employee");
        Optional<EmployeeInfo> senior=emp.stream().min((a, b)->a.getJoiningDate().compareTo(b.getJoiningDate()));
        Optional<EmployeeInfo> old=emp.stream().min(Comparator.comparing(EmployeeInfo::getJoiningDate));
        old.ifPresent(System.out::println);
        senior.ifPresent(System.out::println);
        System.out.println("Gender Group");
        Map<String, Long> group=emp.stream().collect(Collectors.groupingBy(EmployeeInfo::getGender,Collectors.counting()));
        System.out.println(group);




    }
}
