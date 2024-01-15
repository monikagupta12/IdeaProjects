import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
       /* int n = 5;
        int position = 3;
        int bitmask = 1 << position;

        //GET A bit
        if ((n & bitmask) == 0) {
            System.out.println("bit is 0");
        } else {
            System.out.println("bit is 1");
        }

        //SET A BIT
        int ni = (n | bitmask);
        System.out.println("New number is");
        System.out.println(ni);

        //CLEAR A BIT
        int nb= n&(~bitmask);
        System.out.println("new number is");
        System.out.println(nb);

        //UPDATE A BIT
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 0 for reset or 1 for set bit");
        int con= sc.nextInt();
        if(con==1){
            int nu=n|bitmask;
            System.out.println("update bit 3rd to 1");
            System.out.println(nu);
        }
        else {
            int nu= n&(~bitmask);
            System.out.println("update bit 3rd to 1");
            System.out.println(nu);
        }

        */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int nu = sc.nextInt();
        int count = bitNumber(nu);
        System.out.println("number of ones="+ count);
        if(count==1){
            System.out.println("number is power of 2");
        }
        else {




            System.out.println("number is not power of 2");
        }

        System.out.println("position of bit toggle");
        int k= sc.nextInt();
        System.out.println("new nuber is="+ togglebit(nu,k));
    }
    public static int bitNumber(int n){
        if(n==0)
        return 0;
        else {
            return (n&1)+bitNumber(n>>1);
        }
    }
    public static  int togglebit(int n, int k){
        return n^(1<<(k-1));
    }
}

