package DesignPartten.NullObjectDesignPattern;

public class EmployeeFactory {
    public static Employee getEmployee(String emp){
        if(emp.equalsIgnoreCase("web developer")){
            return new WebDeveloper();
        }
        return new NullObject();
    }
}
