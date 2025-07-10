package DesignPartten.FacadeDesignPattern;

public class Main {

    public static void main(String[] args) {
        EmployeeFasade fasade=new EmployeeFasade();
        fasade.insert(new Employee());
        Employee emp=fasade.get(123);
        System.out.println(emp);
        fasade.addProduct();
    }
}
