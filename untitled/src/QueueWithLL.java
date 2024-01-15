public class QueueWithLL {
    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static class QueueLL{
        public static Node front=null;
        public static Node rare=null;
        public static boolean isEmpty(){
            if(front==null&&rare==null){
                return true;
            }
            return false;
        }
        public static void add(int val){
            Node newNode=new Node(val);
            if(front==null&& rare==null){
                front=newNode;
                rare=newNode;
                return;
            }
            rare.next=newNode;
            rare=newNode;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int val= front.val;
            if(front==rare){
                rare=null;
            }
            front=front.next;
            return val;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int val= front.val;
            return val;
        }
    }
    public static void main(String[] args) {
        QueueLL queue=new QueueLL();
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
