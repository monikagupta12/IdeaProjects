package Fileclass;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Iterator;
import java.util.List;



public class FileAsList {
    public static void main(String[] args) throws IOException {
        String fileName="C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\write.txt";
        List<String> list= Files.readAllLines(Path.of(fileName));
        Iterator<String>it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
