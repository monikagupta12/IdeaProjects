package InputOutpurStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamclass {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\write.txt");
        FileInputStream fis=new FileInputStream(file);
        String fileObject= fis.getChannel().toString();
        System.out.println(fileObject + "    "+file);
        String fileDis=fis.getFD().toString();
        System.out.println(fileDis);
        long length=file.length();
        int size=fis.available();
        System.out.println(length+" "+size+" ");

        /*int i;
        while((i=fis.read())!=-1){
            System.out.print((char)i);
        }*/
        System.out.println();
        fis.skip(4);
        byte[] store= new byte[size];
//        fis.read(store);

        fis.read(store,0,size);
        for(byte s:store){
            System.out.print((char)s);
        }
        System.out.println();
        System.out.println(fis.available());



    }
}
