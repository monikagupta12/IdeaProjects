package DesignPartten.SingleTonePartten;


import java.io.*;
import java.time.LocalDate;

public class Breaking2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //2 Serialization or deserialization
        CollageLazy collage1=CollageLazy.createObject("Mnit Jaipur", LocalDate.of(2000,2,02));
        System.out.println(collage1.hashCode());
        System.out.println(collage1);
        FileOutputStream fos=new FileOutputStream("sngleTone.ser");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(collage1);
        oos.close();
        fos.close();
        System.out.println("-----deseralization------");
        FileInputStream fis=new FileInputStream("sngleTone.ser");
        ObjectInputStream ois=new ObjectInputStream(fis);
        CollageLazy collage2=(CollageLazy)ois.readObject();
        System.out.println(collage2.hashCode());
        System.out.println(collage2);

    }
}
