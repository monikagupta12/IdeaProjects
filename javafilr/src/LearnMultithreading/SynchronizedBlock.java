package LearnMultithreading;

class SeetAllocatement1{
   volatile int totalSeat=10;
   public void bookSeat(int seat){
       System.out.println(Thread.currentThread().getName() +" start Ticket Booking requrid ticket"+ seat);
       System.out.println(Thread.currentThread().getName() +" start Ticket Booking requrid ticket"+ seat);

           if (totalSeat >= seat) {
               totalSeat = totalSeat - seat;
               System.out.println(seat + " seat is Booked");
               System.out.println("SeatLeft="+totalSeat);
           } else {
               System.out.println(seat + " seat is not Booked");
               System.out.println("Because SeatLeft="+totalSeat);
           }


   }
}
class MoveBookApp extends Thread{
    SeetAllocatement1 b;
    int seat;
    MoveBookApp(SeetAllocatement1 b,int seat){
        this.b=b;
        this.seat=seat;
    }

    @Override
    public void run() {
        b.bookSeat(seat);
    }
}
public class SynchronizedBlock {
    public static void main(String[] args) {
        SeetAllocatement1 b=new SeetAllocatement1();
        MoveBookApp m1=new MoveBookApp(b,7);
        MoveBookApp m2=new MoveBookApp(b,5);
        m1.start();
        m2.start();
    }
}
