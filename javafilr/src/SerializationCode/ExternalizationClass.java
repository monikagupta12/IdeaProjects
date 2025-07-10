package SerializationCode;

import java.io.*;

class PersonClass implements Externalizable{
    private String name;
    private int age;
    private String gender;

    public PersonClass(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public PersonClass(){
        System.out.println("PersonConstructor called");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
         out.writeObject(name);
         out.writeInt(age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name=(String)in.readObject();
        age=in.readInt();
    }
}

public class ExternalizationClass {
    public static void main(String[] args) {
        PersonClass pc=new PersonClass("neetu",32,"femae");
        System.out.println("Serialization Start");
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("ExternalizationClass.ser"))){
            System.out.println("Name="+pc.getName()+" Age="+pc.getAge()+" Gender="+pc.getGender());
            oos.writeObject(pc);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Serialization Complete");
        //----------------------------------
        System.out.println("Deserialization Start");
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("ExternalizationClass.ser"))){
            PersonClass pt=(PersonClass) ois.readObject();
            System.out.println("Name="+pt.getName()+" Age="+pt.getAge()+" Gender="+pt.getGender());
        }
        catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Deserialization Completed");

    }
}
