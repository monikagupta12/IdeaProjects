package FileReaderOrWriterClass;

import java.util.Scanner;

public class TakeInputScannarClass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter name");
        String name=s.nextLine();
        System.out.println("enter age");
        int age= s.nextInt();
        System.out.println("enter gender");
        String gender= s.next();
        System.out.println( name+" "+age+" "+gender);
    }
}
