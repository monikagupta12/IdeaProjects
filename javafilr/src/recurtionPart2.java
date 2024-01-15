import java.util.Scanner;

public class recurtionPart2{
    public static void towerOfHanoi(String s,String h,String d,int n){
        if(n==1){
            System.out.println("move " + n +" disk from "+ s +" to " + d);
            return;
        }
        towerOfHanoi(s,d,h,n-1);
        System.out.println("move " + n +" disk from "+ s +" to " + d);
        towerOfHanoi(h,s,d,n-1);

    }
    public static String revString(String str) {
        int l=str.length();
        String restr="";
        if(l==0){
            return restr;
        }
        char cc=str.charAt(0);
        restr=revString(str.substring(1));
        return restr+cc;
    }
    public static int f=-1;
    public static int l=-1;
    public static void getPosition(String str, char c,int idx){
        if(idx==str.length()){
            System.out.println("first position=" + f);
            System.out.println("last position=" +l);
            return;
        }
        if(str.charAt(idx)=='a'){
            if(f==-1){
                f=idx;
            }
            else {
                l=idx;
            }
        }
        getPosition(str,c,idx+1);
    }
    public static boolean checkIfIncreasing(int arr[], int idx) {
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return checkIfIncreasing(arr ,idx+1);
        }
        else {
            return false;
        }
    }
    public static String moveX( String str, int idx, int count){
        String restr="";
        if(idx==str.length()){
            restr=restr+addX(count);
            return restr;
        }
        char cc= str.charAt(idx);
        if(cc=='a'){
            return moveX(str,idx+1,count+1);
        }
        else {
            return cc+ moveX(str ,idx+1,count);
        }
    }
    public static String addX(int count){
         String newstr="";
        for(int i=0;i<count;i++){
            newstr+='a';
        }
        return newstr;
    }
    public static String removeDuplicates(String str, int idx, boolean a[]){
        String nstr="";
        if(idx==str.length()){
            return nstr;
        }
        char cc=str.charAt(idx);
        if(a[cc-'a']){
            return removeDuplicates(str,idx+1,a);
        }
        else{
            a[cc-'a']=true;
            return cc+removeDuplicates(str,idx+1,a);
        }

    }
    public static void printSubseq(String str, int idx, String res){
        if(idx==str.length()){
            System.out.println(res);
            return;
        }
        char cc =str.charAt(idx);
        printSubseq(str,idx+1,cc+res);
        printSubseq(str,idx+1,res);
    }


    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of disk");
        int n= sc.nextInt();
        towerOfHanoi("source","helper","destination",n);
        System.out.println("enter a string");
        String str= sc.next();
        String restrv=revString(str);
        System.out.println("revers string is");
        System.out.println(restrv);
        char c='a';
        System.out.println("position of a in string");
        getPosition(str,c,0);
        int arr[]=new int[5];
        System.out.println("enter array element");
        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("array is");
        for (int i=0;i<5;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("array shorted or not");
        boolean check=checkIfIncreasing(arr,0);
        System.out.println(check);
        String modi =moveX(str,0,0);
        System.out.println(modi);
        System.out.println("modified string is");
        boolean a[]=new boolean[26];
        String mo=removeDuplicates(str,0,a);
        System.out.println(mo);






    }


}
