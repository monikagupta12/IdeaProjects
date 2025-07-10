package CollectorInterface;

import java.sql.Statement;

class Create{
    public void display(){
        System.out.println("Create class");
    }
    Create(){
        System.out.println("create class Consturtor created");
    }
}


interface Provider {
    public Create proof();

}


public class ConstructorReference {
    public static void main(String[] args) {
        Provider p1=Create::new;
        p1.proof().display();
    }
}
