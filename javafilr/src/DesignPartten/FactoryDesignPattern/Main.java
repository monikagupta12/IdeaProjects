package DesignPartten.FactoryDesignPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter Employee Type");
        Scanner sc=new Scanner(System.in);
        String emptype=sc.nextLine();
        Employee emp=EmployeeFactory.getEmployee(emptype);
        if(emp==null){
            System.out.println("this type of enployee not exit");
        }
        else {
            int salary=emp.salary();
            System.out.println(salary);
        }

    }
}
