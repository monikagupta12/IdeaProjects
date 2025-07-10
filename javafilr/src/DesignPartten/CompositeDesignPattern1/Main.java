package DesignPartten.CompositeDesignPattern1;

public class Main {
    public static void main(String[] args) {
        Directory fs1=new Directory("Comady Movies");
        fs1.addNewFile(new File("Hulchal"));
        fs1.addNewFile(new File("BhagamBhag"));
        fs1.addNewFile(new File("fukrey"));

        Directory fs2=new Directory("Horrier Movies");
        fs2.addNewFile(new File("Raaz"));
        fs2.addNewFile(new File("Stree"));

        Directory fs=new Directory("Movies");
        fs.addNewFile(fs1);
        fs.addNewFile(fs2);
        fs.addNewFile(new File("Mother India"));
        fs.ls();


    }
}
