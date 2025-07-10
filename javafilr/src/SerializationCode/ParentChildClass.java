package SerializationCode;

import java.io.*;

class Parent {
    int i=10;
    private String name="abc";
    public Parent(){
        System.out.println("Parent Constructor");
    }
    public String getName() {
        return name;
    }
}
class ChildClass extends Parent implements Serializable{
    int j;
}

public class ParentChildClass {

    public static void main(String[] args) {
        ChildClass c=new ChildClass();
        c.i=100;
        c.j=150;
        System.out.println("Seiralization Start");
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("xyx.ser"))){
            oos.writeObject(c);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Seiralization Completerd");
        System.out.println("---------------------");


        System.out.println("Desiralization Start");
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("xyx.ser"))){
            ChildClass ch=(ChildClass)ois.readObject();
            System.out.println("i="+ch.i+"j="+ch.j+"name="+ch.getName());
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Desiralization completed");
    }

}
