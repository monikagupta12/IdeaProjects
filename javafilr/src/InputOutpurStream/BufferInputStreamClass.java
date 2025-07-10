package InputOutpurStream;

import java.io.*;

public class BufferInputStreamClass {



    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\write.txt");
        FileInputStream fis=new FileInputStream(file);
        BufferedInputStream bf=new BufferedInputStream(fis);
        System.out.println(bf.available());
        bf.skip(2);
        System.out.println((char)bf.read());
        bf.mark(6);
        System.out.println((char)bf.read());
        System.out.println(bf.markSupported());
        if(bf.markSupported()){
            bf.reset();
        }
        byte[]store=new byte[bf.available()];
        bf.read(store);
        for (byte b:store){
            System.out.print((char)b);
        }
        bf.read(store);
        bf.close();

    }
}
