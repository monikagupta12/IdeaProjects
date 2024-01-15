public class StackWithLL {
    public static class Node{
        int val;
        Node next;
        public Node(int val){
           this.val=val ;
           this.next=null;
        }
    }
    public static class StackLL {
        public static Node head;
        public static int size;

        public StackLL() {
            head = null;
            size = -0;
        }

        public static boolean isEmpty() {
            if (head == null) {
                return true;
            }
            return false;
        }

        public static void push(int val) {
            Node newNode = new Node(val);
            size++;
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("EMPTY STACK");
                return -1;
            }
            int val = head.val;
            size--;
            head = head.next;
            return val;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("EMPTY STACK");
                return -1;
            }
            return head.val;
        }

        public static int size() {
            if (isEmpty()) {
                System.out.println("Empty Stack");
                return -1;
            }
            return size;
        }

        public static void main(String[] args) {
            StackLL sa = new StackLL();
            sa.push(5);
            sa.push(4);
            int see = sa.peek();
            System.out.println(see);
            int top = sa.pop();
            System.out.println(top);
            see = sa.peek();
            System.out.println(see);
            sa.push(3);
            sa.push(3);
            sa.push(2);
            sa.push(1);
            sa.push(4);
            System.out.println(sa.size());
            while (!sa.isEmpty()) {
                System.out.println(sa.pop());
            }
            System.out.println(sa.size());
            System.out.println(sa.pop());
            sa.push(100);
            System.out.println(sa.peek());
            System.out.println(sa.size());
        }
    }

}
