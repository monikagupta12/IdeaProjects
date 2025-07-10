package SerializationCode;

import java.io.*;

class AddressField  {
    private String city;
    private int pincode;
    public AddressField(){
        System.out.println("Address Constructor");
    }
    public AddressField(String city, int pincode) {
        this.city = city;
        this.pincode = pincode;
    }
    public String getCity() {
        return city;
    }

    public int getPincode() {
        return pincode;
    }
}
class StudentInfo implements Serializable {
    private String name;
    private AddressField address;

    public StudentInfo(String name, AddressField address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public AddressField getAddress() {
        return address;
    }
}
public class NoSeriazableErrorInParentClass {
    public static void main(String[] args) throws IOException {
        AddressField ad = new AddressField("alwar", 301404);
        StudentInfo s1 = new StudentInfo("Ritu", ad);
        System.out.println("Seiralization Start");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("error.ser");
            oos = new ObjectOutputStream(fos);
            System.out.println(s1.getName()+"--"+ad.getCity()+"--"+ad.getPincode());
            oos.writeObject(s1);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            fos.close();
            oos.close();
        }
        System.out.println("Seiralization Completerd");
        System.out.println("---------------------");


        System.out.println("Desiralization Start");

        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream("error.ser");
            ois = new ObjectInputStream(fis);
            StudentInfo stu=(StudentInfo)ois.readObject();
            String name= stu.getName();
            AddressField add=stu.getAddress();
            System.out.println(name+"--"+add.getCity()+"--"+add.getPincode());
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            fis.close();
            ois.close();
        }
        System.out.println("Desiralization Completed");


    }
}
