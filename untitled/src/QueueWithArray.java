import java.util.Objects;

public class QueueWithArray {
    public static class QueueArray{
        public static int[] queue;
        public static int size;
        public static int rare;
       public QueueArray(int size){
           this.size=size;
           queue=new int[size];
           rare=-1;
       }
       public static boolean isEmpty(){
           return (rare== -1) ;
       }
       public static boolean isFull(){
           return (rare==size-1);
       }
       public static void add(int val){
           if(isFull()){
               System.out.println("OVER FLOW");
               return;
           }
           rare++;
           queue[rare]=val;
       }
       public static int remove(){
           if(isEmpty()){
               System.out.println("FULL QUEUE");
               return -1;
           }
           int val=queue[0];
           for(int i=0; i<size-1; i++){
               queue[i]=queue[i+1];
           }
           rare--;
           return val;
       }
       public static int peek(){
           if(isEmpty()){
               System.out.println("FULL QUEUE");
               return -1;
           }
           return queue[0];
       }
    }

    public static void main(String[] args) {
        QueueArray queue=new QueueArray(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        queue.add(5);
        queue.add(6);
        queue.add(7);
        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
        System.out.println(queue.peek());
    }
}
