package DesignPartten.NullObjectDesignPattern;

public class Main {
    public static void main(String[] args) {
        Employee emp1=EmployeeFactory.getEmployee("web developer");
        emp1.Name();
        emp1.salary();
        System.out.println();
        Employee emp2=EmployeeFactory.getEmployee("acd");
        emp2.Name();
        emp2.salary();
    }
}
