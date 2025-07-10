package DesignPartten.PoxyDesignPattern;

public class CompanyServer implements EmployeeDataBase{
    @Override
    public void AddRow(String name, Employee newEmployee) {
        System.out.println("Add Data of newEmolyoee in Employee DataBase");
    }

    @Override
    public void deleteRow(String name, int Id) {
        System.out.println("Delete Data of Emolyoee ID" +Id+" DataBase");
    }

    @Override
    public Employee getData(String name, int Id) {
        System.out.println("Get Data of Emolyoee ID" +Id+" DataBase");
        return new Employee();
    }
}
