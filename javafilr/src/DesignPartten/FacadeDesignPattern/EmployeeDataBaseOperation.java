package DesignPartten.FacadeDesignPattern;

public class EmployeeDataBaseOperation {
    public void AddRow( Employee newEmployee) {
        System.out.println("Add Data of newEmolyoee in Employee DataBase");
    }
    public void deleteRow(int Id) {
        System.out.println("Delete Data of Emolyoee ID" +Id+" DataBase");
    }

    public Employee getData(int Id) {
        System.out.println("Get Data of Emolyoee ID" +Id+" DataBase");
        return new Employee();
    }
}
