package DesignPartten.PoxyDesignPattern;


public class PoxyServer implements EmployeeDataBase{
    CompanyServer c1;

    public PoxyServer() {
        c1=new CompanyServer();
    }

    @Override
    public void AddRow(String name, Employee emp) {
        if(name=="Admin"){
            System.out.println("Proxy Layer");
            c1.AddRow(name,emp);
            return;
        }
        throw new RuntimeException("Invail Access");
    }

    @Override
    public void deleteRow(String name, int Id) {
        if(name=="Admin"){
            System.out.println("Proxy Layer");
            c1.deleteRow(name,Id);
            return;
        }
        throw new RuntimeException("Invail Access");
    }

    @Override
    public Employee getData(String name, int Id) {
        if(name=="Admin"|| name=="User"){
            System.out.println("Proxy Layer");
            return c1.getData(name,Id);
        }
        throw new RuntimeException("Invail Access");
    }
}
