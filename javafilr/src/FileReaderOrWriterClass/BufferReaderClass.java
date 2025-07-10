package FileReaderOrWriterClass;

import java.io.*;

public class BufferReaderClass {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\write.txt");
        FileReader fr=new FileReader(file);
        int length= (int) file.length();
        System.out.println(length);
        char[] store=new char[length];
        BufferedReader br=new BufferedReader(fr);
        /*int read=br.read(store);
       *//* for (char ch:store){
            System.out.print(ch);
        }
        System.out.println(read);*//*
        */
        String str;
        while((str=br.readLine())!=null){
            System.out.print(str);
        }
        fr.close();
        br.close();
    }
}
