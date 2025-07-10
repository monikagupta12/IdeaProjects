package SerializationCode;

import java.io.*;

class Add implements Serializable {
    String city;
    int pincode;
    Add(){
        System.out.println("Add class Constructor");
    }

    public String getCity() {
        return city;
    }

    public int getPincode() {
        return pincode;
    }
}
class Child extends Add {
    String name;
    Add addres;
    public String getName() {
        return name;
    }

}
public class ParentClassSerialized {
    public static void main(String[] args) {
        Child c=new Child();
        c.name="monika";
        c.city="alwar";
        c.pincode=301404;
        System.out.println(c.getName()+" "+c.getCity()+" "+c.getPincode());
        System.out.println("Serialization Start");
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("ParentClassSerialized.mdr"))){
            oos.writeObject(c);
        } catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("Serialization Complete");
        //----------------------------------
        System.out.println("Deserialization Start");
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("ParentClassSerialized.mdr"))){
            Child ch=(Child)ois.readObject();
            System.out.println(ch.getName()+" "+ch.getCity()+" "+ch.getPincode());
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Deserialization Start");

    }
}
