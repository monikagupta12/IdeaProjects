package SerializationCode;

import java.io.*;

class Address{
    String city;
    int pincode;
    Address(){
        System.out.println("Address class Constructor");
    }

    public String getCity() {
        return city;
    }

    public int getPincode() {
        return pincode;
    }
}
class Person extends Address implements Serializable {
    String name;
    Address add;
    public String getName() {
        return name;
    }
}

public class ParentClassNotSerialization {
    public static void main(String[] args) throws FileNotFoundException {
        Person p=new Person();
        p.name="monika";
        p.city="alwar";
        p.pincode=301404;
        System.out.println(p.getName()+" "+p.getCity()+" " +p.getPincode());

        System.out.println("Serialization Start");
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("ParentClassNotSerializationError.mdr"))){
            oos.writeObject(p);
        }
        catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Serialization Complete");
        //----------------------------------
        System.out.println("Deserialization Start");
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("ParentClassNotSerializationError.mdr"))){
            Person per=(Person)ois.readObject();
            System.out.println(per.getName()+" "+per.getCity()+" " +per.getPincode());
        }
        catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Deserialization Complete");
    }
}
