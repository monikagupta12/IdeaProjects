package DesignPartten.FactoryDesignPattern;

public class EmployeeFactory {
    public static Employee getEmployee(String empType){
        String emp=empType.trim();
        if(emp.equalsIgnoreCase("Android Developer")){
            return new AndroidDeveloper();
        }
        else if(emp.equalsIgnoreCase("Web Developer")){
            return new WebDeveloper();
        }
        return null;
    }
}
