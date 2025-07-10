package DesignPartten.BuilderDesignPattern;

public class Main {
    public static void main(String[] args) {
        User u1=new User.UserBuilder()
                .setUserId("123")
                .setUserName("monika")
                .setEmailId("123@com")
                .getUser();
        User u2=User.UserBuilder
                .getUserBuilder()
                .setUserId("456")
                .setUserName("krita")
                .setEmailId("456@com")
                .getUser();
        System.out.println(u1);
        System.out.println(u2);
    }
}
