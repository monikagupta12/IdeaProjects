package InputOutpurStream;

import java.io.*;

public class FileOutPutStremClass {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\write.txt");
        FileOutputStream fos=new FileOutputStream(file,true);
        String s="this is java";
        System.out.println(" ");
        byte[] ch=s.getBytes();
        fos.write(ch);
        for(int i=0; i<s.length(); i++){
            fos.write(s.charAt(i));
        }
        System.out.println("---done---");
    }
}
