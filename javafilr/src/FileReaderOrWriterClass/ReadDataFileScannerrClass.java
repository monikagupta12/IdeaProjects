package FileReaderOrWriterClass;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFileScannerrClass {
    public static void main(String[] args) {
        File file=null;
        Scanner s=null;
        try{
            file=new File("C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\write.txt");
            s=new Scanner(file);
            int ch;
            while(s.hasNextLine()){
                String i = s.nextLine();
                System.out.println(i);
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            s.close();
        }
        System.out.println("----done------");
    }
}
