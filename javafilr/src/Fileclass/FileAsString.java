package Fileclass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileAsString {


    public static void main(String[] args) throws IOException {
        String fileName="C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\write.txt";
        String data="";
        data=new String(Files.readAllBytes(Path.of(fileName)));
        System.out.println(data);
    }
}
