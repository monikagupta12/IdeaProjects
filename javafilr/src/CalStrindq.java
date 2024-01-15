import java.util.Scanner;

public class CalStrindq {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        System.out.println("my name is " + name1);

        //CONCATENATION
        String namef = "Monika";
        String namel = "Gupta";
        String fname = "My name is " + namef + " " + namel;
        System.out.println(fname);

        //STRING LENGTH
        System.out.println("STRING LENGHT=" + fname.length());

        // CHARACTER ACCESS
        System.out.println("STRING CHARACTER ARE");
        for (int i = 0; i < fname.length(); i++) {
            System.out.println(fname.charAt(i));
        }

        //COMPAIR 2 STRING
        if (name1.compareTo(name2) == 0)
            System.out.println("String are equal");
        else if (name1.compareTo(name2) > 0)
            System.out.println("Name1 is grater then name2");
        else {
            System.out.println("Name2 is grater then name1");
        }
        // here string use as class
        if (new String("TONY") == new String("Tony"))
            System.out.println("String are equal");
        else
            System.out.println("Not equal");


        //SUBSTRING OF A STRING
        System.out.println(fname.substring(18));
        System.out.println(fname.substring(3,7));




    }




}
