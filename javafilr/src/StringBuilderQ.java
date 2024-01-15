import java.util.Scanner;

public class StringBuilderQ {
    public static void main( String []args){
        StringBuilder name= new StringBuilder("Monika gupta");
        System.out.println("String is ");
        System.out.println(name);
        System.out.println("string lenght="+ name.length());

      /*  // GET A CHARACTER
        System.out.println("char at 11 postion=" + name.charAt(11));
        System.out.println("char at 0 postion=" + name.charAt(0));
        System.out.println("char at 5 postion=" + name.charAt(5));
        System.out.println("char at 6 postion=" + name.charAt(6));

        //SET A CHARACTER(over right character)
        name.setCharAt(7,'G');
        System.out.println("String is ");
        System.out.println(name);

        //INSERT CHARACTER
        name.insert(0,'T');
        name.insert(8,'G');
        name.insert(8,'@');
        System.out.println("String is ");
        System.out.println(name);
        System.out.println("string lenght="+ name.length());

        //DELEAT CHARACTER
        name.delete(8,10);
        name.delete(0,1);
        System.out.println("String is ");
        System.out.println(name);


        //APEND CHARACTER
        name.append(1);
        name.append('@');
        System.out.println("String is ");
        System.out.println(name);
        System.out.println("string lenght="+ name.length());

        */



        for (int i=0; i<name.length()/2; i++){
            int f=i;
            int b=name.length()-1-i;
            char rf=name.charAt(i);
            char rb=name.charAt(b);
            name.setCharAt(i,rb);
            name.setCharAt(b,rf);

        }
        System.out.println(" Revers String is ");
        System.out.println(name);
        System.out.println("string lenght="+ name.length());







    }
}
