package DesignPartten.FacadeDesignPattern;

public class EmployeeFasade {
    EmployeeDataBaseOperation emp;
    ProductCollection p1;
    public EmployeeFasade() {
        p1=new ProductCollection();
        emp = new EmployeeDataBaseOperation();
    }
    void insert(Employee e){
        emp.AddRow(e);
    }
    void remove(int id){
        emp.deleteRow(id);
    }
    Employee get(int id){
        return emp.getData(id);
    }
    void addProduct(){
        p1.addProduct();
    }
}
