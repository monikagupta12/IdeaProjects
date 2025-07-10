package Fileclass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterClass {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\abc.txt");
        FileWriter fw = new FileWriter(file,true);
        String text = "xyz.";
        fw.write(text);
        char[]ch={'a','b','c'};
        fw.write(ch);
        for(int i=0; i<text.length(); i++){
            fw.write(text.charAt(i));
        }

        fw.close();
        System.out.println("done");
    }
}

