package DesignPartten.AbsertFactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        Employee e1=EmployeeFactory.getEmployee(new WebDeveloperFactory());
        System.out.println(e1.name());
        System.out.println(e1.salary());
        Employee e2=EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        System.out.println(e2.name());
        System.out.println(e2.salary());
        Employee e3=EmployeeFactory.getEmployee(new DesignerFactroy());
        System.out.println(e3.name());
        System.out.println(e3.salary());
    }
}
