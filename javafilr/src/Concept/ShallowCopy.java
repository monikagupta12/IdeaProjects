package Concept;
class Temp1 implements Cloneable{
    int val;
    Temp1 (int val){
        this.val=val;
    }
}
class Employee implements Cloneable{
    int val;
    String name;
    Temp1 t;
    @Override
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }
    public String toString(){
        return "["+val+"-"+name+"-"+t+"]";
    }

}
public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e1=new Employee();
        e1.val=10;
        e1.name="xyz";
        e1.t=new Temp1(110);
        System.out.println(e1);
        Employee e2=e1.clone();
        System.out.println(e2);
    }
}
