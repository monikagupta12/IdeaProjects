package FileReaderOrWriterClass;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamClass {


    public static void main(String args[]) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\strem.txt");
            String s = "hello java";
            byte[] by = s.getBytes();
            fos.write(by);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("---done----");
    }
}
