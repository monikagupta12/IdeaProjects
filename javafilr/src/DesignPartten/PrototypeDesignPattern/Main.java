package DesignPartten.PrototypeDesignPattern;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        NetworkConnection n1=new NetworkConnection();
        System.out.println(n1.hashCode());
        n1.setIp("122.14.5.3");
        n1.loadImpotantData();
        System.out.println(n1);

        NetworkConnection n2=(NetworkConnection) n1.clone();
        System.out.println(n2.hashCode());
        System.out.println(n2);
    }
}
