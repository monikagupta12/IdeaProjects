package FileReaderOrWriterClass;

import java.io.File;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args)throws IOException {
        File file=new File("C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\helloword.txt");
        //1
        if(file.exists()){
            System.out.println("file Exists");
        }
        else{
            //2
            if(file.createNewFile()) {
                System.out.println("createFile");
            }
        }

        //3
        String name=file.getName();
        System.out.println("Name: "+name);
        //4
        String path=file.getPath();
        System.out.println("Path: "+path);

        //5
        long length= file.length();
        System.out.println("length: "+length);
        //6
        boolean read=file.canRead();
        System.out.println("ReadPermission: "+read);
        //7
        boolean write=file.canWrite();
        System.out.println("WritePermission: "+write);
        //8
        boolean dir=file.mkdir();
        System.out.println("Directory created: "+dir);
        try {
            for (String s : file.list()) {
                System.out.print(s);

            }
        }
        catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
       //10
        if(file.delete()) {
            System.out.println("file Deleted " );
        }
        else {
            System.out.println("not deleted");
        }

        //9
        File change=new File("C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\testRead1.txt");
        boolean newName=file.renameTo(change);
        if(newName) {
            System.out.println("file rename");
        }
        else{
            System.out.println("file can not rename");
        }





    }
}
