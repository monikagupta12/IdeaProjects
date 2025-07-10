package SerializationCode;

import java.io.*;
import java.util.Base64;

import static java.util.Base64.*;

class Login implements Serializable {
    private String username;
    private transient String password;

    Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
    private void writeObject(ObjectOutputStream oos) throws IOException {
        oos.defaultWriteObject();
        String encPassword=  Base64.getEncoder().encodeToString(password.getBytes());
        System.out.println("EncryptPassword Sender"+encPassword);
        oos.writeObject(encPassword);
    }
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
        String ePassword=(String)ois.readObject();
        System.out.println("EncryptPassword Reciver"+ePassword);
        password=new String(Base64.getDecoder().decode(ePassword));
    }
}


public class CostimizedSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Serialization Start");
        Login lg=new Login("helloword","myword");
        FileOutputStream fos=new FileOutputStream("check.mdr");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(lg);
        fos.close();
        oos.close();
        System.out.println("Serialization Complete");
        //----------------------------------
        System.out.println("Deserialization Start");
        FileInputStream fis=new FileInputStream("check.mdr");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Login lg1=(Login)ois.readObject();
        System.out.println(lg1.getUsername()+"---"+lg1.getPassword());
        fos.close();
        oos.close();
        System.out.println("Deserialization Complete");

    }
}
