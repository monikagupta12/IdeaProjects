package FileReaderOrWriterClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamClass {

    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\write.txt");
//            int i;
//            while ((i = fis.read()) != -1) {
//                System.out.print((char) i);
//            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            ;
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("--------done----------");
    }
}
