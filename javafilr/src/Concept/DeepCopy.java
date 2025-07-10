package Concept;

class Temp implements Cloneable
{
    int temp;
    Temp(int v){
        this.temp=v;
    }

    @Override
    public Temp clone() throws CloneNotSupportedException {
        return (Temp) super.clone();
    }

}
class Student implements Cloneable{
    int val;
    String name;
    Temp t;
    Student(){
    }
    @Override
    public Student clone() throws CloneNotSupportedException {
        Student s=(Student) super.clone();
        s.t=t.clone();
        return s;
    }
    @Override
    public String toString(){
        return "["+val+"-"+name+"-"+t+"]";
    }
}

public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1=new Student();
        s1.val=10;
        s1.name="abc";
        s1.t=new Temp(110);
        System.out.println(s1);
        Student s2=s1.clone();
        System.out.println(s2);
    }
}
