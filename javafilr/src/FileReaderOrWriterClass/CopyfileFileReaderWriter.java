package FileReaderOrWriterClass;

import java.io.*;

public class CopyfileFileReaderWriter {
    public static void main(String[] args) {
        FileWriter fw = null;
        FileReader fr = null;
        try {
            fr = new FileReader("C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\write.txt");
            fw = new FileWriter("C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\COPY.txt");
            int take;
            while ((take = fr.read()) != -1) {
                fw.write((char) take);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fr.close();
                fw.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("-----done------");
    }
}
