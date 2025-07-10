package FileReaderOrWriterClass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) {
        File file = null;
        FileWriter fw = null;
        try {
            file = new File("C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\abc.txt");
            fw = new FileWriter(file);
            String text = "i love india.";
            fw.write(text);
            fw.write(text);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println(" ----done-----");
    }
}
