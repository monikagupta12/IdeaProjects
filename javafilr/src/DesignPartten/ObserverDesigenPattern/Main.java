package DesignPartten.ObserverDesigenPattern;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        YouTubeChannel ch1 = new YouTubeChannel();
        User1 user1 = new User1("monika", "1234");
        User2 user2 = new User2("neetu", "45@12");
        ch1.suscribe(user1);
        ch1.suscribe(user2);
        ch1.unSuscribe("1234");
      /*  System.out.println("1 for Suscribe new user1 with phone no");
        System.out.println("2 for Suscribe new user2 with email");
        System.out.println("3 for addind new video");
        System.out.println("4 for exit channel");
        System.out.println("5 for unSuscribe new user1 with ID");
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("enter vaild information");
            int option=sc.nextInt();
            if(option==1){
                System.out.println("Name");
                String name=sc.next();
                System.out.println("Phone number");
                String no=sc.next();
                User1 user1=new User1(name,no);
                ch1.suscribe(user1);
            }
            else if(option==2){
                System.out.println("Name");
                String name=sc.next();
                System.out.println("EmailID");
                String no=sc.next();
                User2 user2=new User2(name,no);
                ch1.suscribe(user2);
            }
            else if(option==3){
                System.out.println(" video title");
                String title=sc.next();
                ch1.notifyObserver(title);
            }
            else if(option==4){
                break;
            }
            else if (option==5) {
                System.out.println(" ender id to remove");
                String id=sc.next();
                ch1.unSuscribe(id);
            }
            else{
                System.out.println("Invail Input");
            }

        }*/
    }
}
