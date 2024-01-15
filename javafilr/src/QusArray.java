import java.util.Scanner;

public class QusArray   {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ARRAY SIZE");
        int n= sc.nextInt();
        int a[]=new int[n];
        System.out.println("ENTER ARRAY ELEMENT");
        for(int i=0; i<n; i++){
            a[i]= sc.nextInt();
        }
        System.out.println("ARRAY IS");
        for(int i=0;i<n;i++){
            System.out.print(a[i] +" ");
        }
        System.out.println();



        //MAX OR MIN  IN ARRAY
        int max=1;
        int min=a[1];
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("MAX NUMBER="+ max);
        System.out.println("MIN NUMBER="+ min);



        //CHECK ARRRY IS ASCENDIND ORDER OR NOT
        Boolean ch=true;
        for (int i=0;i<n-1;i++){
            if(a[i+1]<a[i]){
                ch=false;
            }
        }
        if(ch==true)
            System.out.println("ARRAY ARRANGED IN ASCENDING ORDER");
        else
            System.out.println("ARRAY ARRANGED IN NOT ASCENDING ORDER");


        // ASCENDIND ORDER
        int g=0;
        for(int j=0; j<n-1; j++) {
            for (int i = 0; i < n - 1-j; i++) {
                if (a[i] > a[i + 1]) {
                    g = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = g;
                }
            }
        }
        System.out.println(" NEW ARRAY IS");
        for(int i=0;i<n;i++){
            System.out.print(a[i] +" ");
        }
        System.out.println();
        int l=a.length;
        System.out.println("length of array=" + l);



        //find an element in array
        System.out.println("ENTER SEARCH NUMBER");
        int s= sc.nextInt();
        int d=-1;
        for(int i=0; i<n;i++){
            if(a[i]==s){
                d=i;
                System.out.println("NUMBER " +s +" IS PRESENT " +i +" POSITION IN ARRAY");
            }
        }
        if(d<0){
            System.out.println("NUMBER " +s +" IS NOT PRESENT IN ARRAY ");
        }

    }
}

