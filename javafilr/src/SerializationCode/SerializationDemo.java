package SerializationCode;
import java.io.*;
class Student implements Serializable{
    private String name;
    private transient static int age;
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public String toString(){
        return name+"-"+age;
    }
}
public class SerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Serialization Start");
        FileOutputStream fos=new FileOutputStream("createSeralizationFile.mdr");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        Student s=new Student("rekha",22);
        oos.writeObject(s);
        fos.close();
        oos.close();
        System.out.println("Serialization Complete");
        //----------------------------------
        System.out.println("Deserialization Start");

        FileInputStream fis=new FileInputStream("createSeralizationFile.mdr");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student stu=(Student) ois.readObject();
        System.out.println(stu);
        System.out.println("Deserialization Completed");
        fos.close();
        oos.close();






    }
}
