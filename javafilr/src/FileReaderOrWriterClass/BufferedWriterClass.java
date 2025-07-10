package FileReaderOrWriterClass;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterClass {
    public static void main(String[] args) {
        File file=null;
        BufferedWriter bw = null;
        FileWriter fw = null;
        try {
            file= new File("C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\write.txt");
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            String str = "i love my my india. ";
            int num = 134;
            bw.newLine();
            char[] ch={'a','b','c','d'};
            bw.write(ch);
            bw.newLine();
            bw.write(str);
            bw.newLine();
            bw.write(str);
            bw.newLine();
            bw.write(String.valueOf(num));
            bw.newLine();
            System.out.println("new line");
            System.out.println(file.canWrite());
            for(int i=0; i< str.length(); i++){
                bw.write(str.charAt(i));
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("----done----");
    }
}
