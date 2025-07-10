package FileReaderOrWriterClass;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TakeInputBufferReader {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter name");
        String name=br.readLine();
        System.out.println("enter age");
        int age= Integer.parseInt(br.readLine());
        System.out.println("enter gender");
        char gender= (char) br.read();
        System.out.println( name+" "+age+" "+gender);


    }
}
