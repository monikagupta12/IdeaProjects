import java.util.Stack;

public class StackDisignWithArray {

    public static class StackArray {
        public static int size;
        public static int[] arr;
        int n;

        public StackArray(int n) {
            this.n=n;
            arr = new int[n];
            size = -1;
        }

        public static boolean isEmpty() {
            if (size == -1) {
                return true;
            }
            return false;
        }

        public static void push(int val) {
            if (size == arr.length - 1) {
                System.out.println("OverFlow");
                return;
            }
            size++;
            arr[size] = val;

        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("EMPTY STACK");
                return -1;
            }
            int val = arr[size];
            size--;
            return val;
        }
        public static int peek() {
            if (isEmpty()) {
                System.out.println("EMPTY STACK");
                return -1;
            }
            int val = arr[size];
            return val;
        }


    }

    public static void main(String[] args) {
        int arraySize=5;
        StackArray sa=new StackArray(arraySize);
        sa.push(5);
        sa.push(4);
        int see=sa.peek();
        int top=sa.pop();
        see=sa.peek();
        sa.push(3);
        sa.push(3);
        sa.push(2);
       sa. push(1);
        sa.push(4);
        while(!sa.isEmpty()){
            System.out.println(sa.pop());
        }
    }

}
