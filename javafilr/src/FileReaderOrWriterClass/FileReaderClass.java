package FileReaderOrWriterClass;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) {
        File file=null;
        FileReader fr=null;
        try{
            file=new File("C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\write.txt");
            fr=new FileReader(file);
            int ch;
            while((ch= fr.read())!=-1){
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("----done------");
    }
}
