import java.util.Scanner;

public class StringsQ {
    public static void main(String []args) {
       /* Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int n= sc.nextInt();
        int al=0;
        String name[] =new String[n];
        for( int i=0; i<n; i++){
            name[i]= sc.next();
            al=al+ name[i].length();

        }
        System.out.println("array length is=" +al);*/

        //Replace character
       /* Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NAME");
        String name = sc.next();
        String result = " ";
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'e') {
                result = result + 'i';
            } else {
                result = result + name.charAt(i);
            }
        }
        System.out.println("NEW STRING IS");
        System.out.println(result);*/


        //find username from email
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER EMAIL ADDRESS");
        String email = sc.next();
        String un=" ";
        for(int i=0; i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else {
                un=un+email.charAt(i);
            }
        }
        System.out.println("USERNAME IS");
        System.out.println(un);

    }


}
