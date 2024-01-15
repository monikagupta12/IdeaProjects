import java.util.Scanner;

public class ArrayShorting {
    public static void main( String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Array Size is");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Array Element is");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array is");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] +" ");
        }
        System.out.println();

        int temp = 0;
        //SELECTION SHORT
        for (int i = 0; i < n; i++) {
            int small = i;
            for (int j = i + 1; j < n; j++) {
                if (a[small] > a[j]) {
                    small = j;
                }
            }
            temp = a[i];
            a[i] = a[small];
            a[small] = temp;
        }
        System.out.println("Shorted array is");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] +" ");
        }


        //INSERTION SHORTING
        for (int i=1; i<n; i++){
            int current =a[i];
            int j=i-1;
            while (j>=0 && current<a[j]){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=current;
        }
        System.out.println();
         System.out.println("Shorted array is");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }

}