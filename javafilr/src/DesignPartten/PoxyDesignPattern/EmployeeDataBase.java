package DesignPartten.PoxyDesignPattern;


public interface EmployeeDataBase {
    void AddRow(String name, Employee emp);
    void deleteRow(String name, int Id);
    Employee getData(String name , int Id);
}
