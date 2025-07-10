package DesignPartten.FlyWeightDesignPattern;

public class Main {
    public static void main(String[] args) {
        LCharacter lt=new LCharacter('a',"Bold",20);
        lt.display(1,1);
        LCharacter lt2=new LCharacter('a',"Bold",20);
        lt2.display(1,2);
        LCharacter lt3=new LCharacter('b',"Bold",20);
        lt3.display(2,3);
        LCharacter lt4=new LCharacter('b',"Bold",20);
        lt4.display(1,3);
        for(int i=0; i<3; i++){
            for (int j=0; j<5; j++){
                System.out.print(NotePade.page[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }


    }
}
