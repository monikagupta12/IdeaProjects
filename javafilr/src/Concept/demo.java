package Concept;

import java.lang.*;
public class demo {

    protected void finalize() throws Throwable
    {
        System.out.println("Block release");
    }

    // Driver code
    public static void main(String[] args) throws Throwable
    {
        demo d1 = new demo();
        demo d2 = new demo();
        demo d3 = new demo();
        System.out.println("d1="+d1);
        System.out.println("d1="+d1);
        d1=d3;
        System.gc();

        d2=null;
        Runtime.getRuntime().gc();
        Thread.sleep(1000);
        System.out.println("end progarm");

    }
}
