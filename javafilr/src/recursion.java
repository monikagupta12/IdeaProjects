import java.util.Scanner;

public class recursion {
    public static void printPermutation(String str, int idx, String perm){
        if(idx== str.length()){
            System.out.println(perm);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char cc = str.charAt(i);
            String rstr = str.substring(0, i) + str.substring(i + 1);
            printPermutation(rstr, idx + 1, perm + cc);
        }
    }
    public static int countPaths(int i, int j, int m, int n){
        if(i==m-1 ||j==n-1){
            return 1;
        }
        int rp=countPaths(i,j+1,m,n);
        int dp=countPaths(i+1,j,m,n);
        return rp+dp;
    }
    public static int tilling( int n, int m){
      if(n<m) {
        return 1;
      }
      if(n==m){
        return 2;
      }
      return tilling(n-1, m)+tilling(n-m, m);
    }


    public static int pairFriends(int n){
        if(n<=1){
            return 1;
        }
        return pairFriends(n-1)+(n-1)*pairFriends(n-2);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String str="abc";
        printPermutation(str,0,"");
        System.out.println("no of rows");
        int m= sc.nextInt();
        System.out.println("no of colums");
        int n= sc.nextInt();
        System.out.println("total path");
        int tp=countPaths(0,0,m,n);
        System.out.println(tp);
        int p=4,q=2;
        int way=tilling(p,q);
        System.out.println("total way");
        System.out.println(way);
        System.out.println("enter no friends");
        int frd= sc.nextInt();
        int tfn=pairFriends(frd);
        System.out.println("total way to invite");
        System.out.println(tfn);

    }
}
