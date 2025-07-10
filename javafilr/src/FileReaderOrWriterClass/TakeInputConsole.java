package FileReaderOrWriterClass;

public class TakeInputConsole {
    public static void main(String[] args) {
        System.out.println("enter name");
        String name=System.console().readLine();
        System.out.println("enter age");
        int age= Integer.parseInt(System.console().readLine());
        System.out.println("enter gender");
        String gender= System.console().readLine();
        System.out.println( name+" "+age+" "+gender);
    }
}
