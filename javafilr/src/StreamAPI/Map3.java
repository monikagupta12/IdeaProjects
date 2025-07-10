package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    int id;
    String name;
    int salary;
    Employee(int id,String name,int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}
public class Map3 {
    public static void main(String[] args) {
        List<Employee> em= Arrays.asList(new Employee(101,"Alex",10000),
                new Employee(102,"Brian",20000),
                new Employee(103,"Charles",30000),
                new Employee(104,"David",40000),
                new Employee(105,"Edward",50000)
        );
        List<Integer>salary=em.stream().filter(e->e.salary>20000).map(i->i.salary).collect(Collectors.toList());
        System.out.println(salary);
    }
}
