package InputOutpurStream;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ByteArrayInputStreamClass {
    public static void main(String[] args) throws IOException {
        String s=new String(Files.readAllBytes(Path.of("C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\write.txt")));
        byte[] arr=s.getBytes();
        ByteArrayInputStream is= new ByteArrayInputStream(arr);
        int size=is.available();
        System.out.println(size);
        System.out.println((char)is.read());
        System.out.println((char)is.read());
        System.out.println((char)is.read());
        is.mark(1);
        is.skip(2);
        System.out.println((char)is.read());
        System.out.println((char)is.read());
        System.out.println((char)is.read());
        byte[] store= new byte[size];
        if(is.markSupported()){
            is.reset();
            is.read(store);
        }
        else{
            System.out.println("not mark supported");
        }
        System.out.println();
        for(byte st:store){
            System.out.print((char)st);
        }

    }
}
