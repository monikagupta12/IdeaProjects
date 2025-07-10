package DesignPartten.ItratorDesignPattern;

public class Main {
    public static void main(String[] args) {
        UserCollection u1=new UserCollection();
        u1.addUser(new User("MONIKA ", 24));
        u1.addUser(new User("RITA ", 20));
        u1.addUser(new User("VEETU ", 30));
        Itrator it=u1.getItrator();
        while ((it.hashNext())){
            User ur=(User) it.next();
            System.out.println(ur);
        }
        u1.remove(0);
        System.out.println("-----------");
        it=u1.getItrator();
        while ((it.hashNext())){
            User ur=(User) it.next();
            System.out.println(ur);
        }

    }


}
