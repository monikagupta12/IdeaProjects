package FileReaderOrWriterClass;

import java.io.DataInputStream;
import java.io.IOException;

public class TakeInputDataStream {
    public static void main(String[] args) throws IOException {
        DataInputStream data=new DataInputStream(System.in);
        System.out.println("enter name");
        String name=data.readLine();
        System.out.println("enter age");
        int age= Integer.parseInt(data.readLine());
        System.out.println("enter gender");
        char gender= (char) data.read();
        System.out.println( name+" "+age+" "+gender);
    }
}
