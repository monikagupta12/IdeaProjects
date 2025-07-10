package Fileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFileReader {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\Users\\degup\\OneDrive - Microsoft\\Desktop\\write.txt");
        Scanner sc=new Scanner(file);
        /*String st =sc.useDelimiter("//Z").next();
        System.out.println(st);*/

        while(sc.hasNextLine()){
            String st=sc.nextLine();
            System.out.println(st);
        }
        sc.close();



    }
}
