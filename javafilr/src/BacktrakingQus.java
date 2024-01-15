import java.util.Scanner;

public class BacktrakingQus {
    public static void subSet (int idx, String ns,String s){
        if(idx==s.length()){
            System.out.println(ns);
            return;
        }
        char cc= s.charAt(idx);
        subSet(idx+1,ns+cc,s);
        subSet(idx+1, ns,s);
    }
    public static void permutation(String s, String perm){
        if(s.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0; i<s.length(); i++){
            String ns=s.substring(0,i)+s.substring(i+1);
            char cc=s.charAt(i);
            permutation(ns,perm+cc);
        }
    }
    public static int gridWay(int i,int j,int m, int n){
        if(i==m-1&&j==n-1){
            return 1 ;
        }
        if(i==m||j==n){
            return 0;
        }
        int u=gridWay(i+1,j,m,n);
        int l=gridWay(i,j+1,m,n);
        return u+l;
    }
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string for subset");
        String s= sc.next();
        System.out.println("Subset are");
        subSet(0,"",s);

        System.out.println("Permutation are");
        permutation(s,"");


        System.out.println("Total grid way");
        int m=3;
        int p=3;
        int w=gridWay(0,0,m,p);
        System.out.println(w);
    }
}
