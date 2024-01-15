public class QueueWithCircularArray {
    public static class QueueCA {
        public static int[] queue;
        public static int size;
        public static int front;
        public static int rare;

        public QueueCA(int size) {
            this.size = size;
            queue = new int[size];
            front = -1;
            rare = -1;
        }

        public static boolean isEmpty() {
            if (front == -1 && rare == -1) {
                return true;
            }
            return false;
        }
        public static boolean isFull(){
            if((rare+1)%size==front) {
                return true;
            }
            return false;
        }
        public static void add(int val){
            if(isFull()){
                System.out.println("QUEUE IS FULL");
                return;
            }
            if(front==-1 && rare==-1){
                front++;
            }
            rare=(rare+1)%size;
            queue[rare]=val;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue empty");
                return -1;
            }
            int val=queue[front];
            if(front==rare){
                front=-1;
                rare=-1;
                return val;
            }

            front=(front+1)%size;
            return val;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("queue empty");
                return -1;
            }
            return queue[front];
        }
    }

    public static void main(String[] args) {
       QueueCA queue=new QueueCA(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        System.out.println(queue.peek());
        queue.add(5);
        queue.add(6);
        queue.add(7);
        queue.add(8);
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
        System.out.println(queue.peek());
    }
}
