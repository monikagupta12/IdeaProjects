package Fileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.CharBuffer;

public class ReaderClass {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\abc.txt");
        FileReader fr=new FileReader(file);
        long length=file.length();
        System.out.println(length);
        /*char[] store=new char[(int) length];
        int read=-1;
        CharBuffer cb= CharBuffer.wrap("file1");
        if(fr.ready()){
            read=fr.read(store);
        }
        System.out.println("read="+read);
        for( int i=0; i<length; i++){
            System.out.print(store[i]);
        }*/

        int i ;
        while((i=fr.read())!=-1){
            System.out.print((char)i);

        }
        fr.close();

    }
}

