package DesignPartten.PoxyDesignPattern;

public class Main {
    public static void main(String[] args) {
        EmployeeDataBase emp=new PoxyServer();
        try {
            emp.AddRow("User",new Employee());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        try {
            emp.deleteRow("Admin",123);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }


}
