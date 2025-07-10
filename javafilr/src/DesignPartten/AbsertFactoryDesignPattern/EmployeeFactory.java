package DesignPartten.AbsertFactoryDesignPattern;

public class EmployeeFactory {
    public static Employee getEmployee(EmplyoeeAbsertFactory factoy){
        return factoy.createEmployee();
    }
}
