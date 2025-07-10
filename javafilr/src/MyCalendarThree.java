import java.util.Arrays;
import java.util.PriorityQueue;

public class MyCalendarThree {

    class Pair{
        int end;
        int room;
        int count;
        Pair(int end, int room, int count){
            this.end=end;
            this.room=room;
            this.count=count;
        }
    }
    public int mostBooked(int n, int[][] meetings) {
        PriorityQueue<Pair> availableRoom=new PriorityQueue<>((a, b)->a.room-b.room);
        PriorityQueue<Pair> busyRoom=new PriorityQueue<>((a,b)->(a.end==b.end)?a.room-b.room:a.end-b.end);
        Arrays.sort(meetings,(a, b)->a[0]-b[0]);

        for(int i=0; i<n; i++){
            availableRoom.add(new Pair(0,i,0));
        }
        for(int[]meet:meetings){
            int st=meet[0];
            int et=meet[1];

            while(!busyRoom.isEmpty()&& busyRoom.peek().end<=meet[0]){
                Pair empty=busyRoom.remove();
                availableRoom.add(empty);
            }
            if(!availableRoom.isEmpty()){
                Pair curr=availableRoom.remove();
                curr.count++;
                curr.end=meet[1];
                busyRoom.add(curr);
            }
            else{
                Pair curr=busyRoom.peek();
                int dur=et-st;
                curr.end=curr.end+dur;
                curr.count++;
            }
        }
        while(!busyRoom.isEmpty()){
            Pair empty=busyRoom.remove();
            availableRoom.add(empty);
        }
        int room=0;
        int max=0;
        while(!availableRoom.isEmpty()){
            Pair curr=availableRoom.remove();
            if(curr.count>max){
                max=curr.count;
                room=curr.room;
            }
        }
        return room;



    }

    public static void main(String[] args) {
        MyCalendarThree ob1=new MyCalendarThree();
        int[][]arr={{1,20},{2,10},{3,5},{4,9},{6,8}};
        ob1.mostBooked(3,arr);
    }
}
