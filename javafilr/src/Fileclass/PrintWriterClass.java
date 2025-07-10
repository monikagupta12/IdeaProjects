package Fileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class PrintWriterClass {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        File file=new File("C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\TWT.txt");
        PrintWriter pt=new PrintWriter(file);
        String s="i love india";
        int num=123;
        pt.write(s);
        pt.flush();
        pt.write(String.valueOf(123));
        pt.flush();
        pt.close();
        System.out.println("--done--");
    }
}
