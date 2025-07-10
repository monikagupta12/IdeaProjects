package LearnMultithreading;
class SeetAllocatement{
    static int totalSeat=20;
     static synchronized public void bookSeat(int seat){
        if(totalSeat>=seat){
            System.out.println(seat+" seat is Booked");
            totalSeat=totalSeat-seat;
            System.out.println( "SeatLeft="+totalSeat);
        }
        else{
            System.out.println(seat+" seat is not Booked");
            System.out.println("Because SeatLeft="+totalSeat);
        }
        //System.out.println(totalSeat);
    }
}
class MoveBookApp2 extends Thread{
    SeetAllocatement b;
    int seat;
    MoveBookApp2(SeetAllocatement b,int seat){
        this.b=b;
        this.seat=seat;
    }

    @Override
    public void run() {
        b.bookSeat(seat);
    }
}
class MoveBookApp1 extends Thread{
    SeetAllocatement b;
    int seat;
    MoveBookApp1(SeetAllocatement b,int seat){
        this.b=b;
        this.seat=seat;
    }

    @Override
    public void run() {
        b.bookSeat(seat);
    }
}
public class Synchronization {
    public static void main(String[] args) {
        SeetAllocatement b=new SeetAllocatement();
        MoveBookApp1 m1=new MoveBookApp1(b,7);
        MoveBookApp1 m2=new MoveBookApp1(b,5);
        m1.start();
        m2.start();
        SeetAllocatement b1=new SeetAllocatement();
        MoveBookApp2 m3=new MoveBookApp2(b1,10);
        MoveBookApp2 m4=new MoveBookApp2(b1,2);
        m3.start();
        m4.start();
    }
}
