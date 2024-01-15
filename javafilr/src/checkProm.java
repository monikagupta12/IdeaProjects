import java.util.HashSet;
import java.util.Scanner;

public class checkProm {
    public static void printSubseq(String str, int idx, String res,HashSet<String> hs){
        if(idx==str.length()){
            if (hs.contains(res)) {
                return;
            }
            else{
                hs.add(res);
                System.out.println(res);
                return;
            }
        }
        char cc =str.charAt(idx);
        printSubseq(str,idx+1,cc+res, hs);
        printSubseq(str,idx+1,res, hs);
    }
    public static String key[] ={".;","abc","def","ghi","jkl","mno","pqrs","tu","vw","xyz"};
    public static void printKeypadCombination(String number, int idx, String res){
        if(idx==number.length()){
            System.out.println(res);
            return;
        }
        char cc=number.charAt(idx);
        String mapping=key[cc-'0'];
        for(int i=0; i<mapping.length();i++){
            printKeypadCombination(number,idx+1,mapping.charAt(i)+res);
        }

    }

    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> hs=new HashSet<>();
        String str = sc.next();

       printSubseq(str,0,"" ,hs);
        System.out.println("enter number string");
        String num= sc.next();
        System.out.println("key pad combination");
        printKeypadCombination(num,0,"");

    }

}
