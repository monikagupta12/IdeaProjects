import java.util.ArrayList;
import java.util.List;

public class StackWithArrayList {
    public static class StackAL{
       static List<Integer> list=new ArrayList<>();
        public static boolean isEmpty(){
            if(list.size()==0){
                return true;
            }
            return false;
        }
        public static void push(int val){
            list.add(val);
        }
        public static int pop(){
            if(isEmpty()){
                System.out.println("STACK EMPTY");
                return -1;
            }
            return list.remove(list.size()-1);
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("STACK EMPTY");
                return -1;
            }
            return list.get(list.size()-1);
        }

    }

    public static void main(String[] args) {
        StackAL sa=new StackAL();
        sa.push(5);
        sa.push(4);
        int see=sa.peek();
        System.out.println(see);
        int top=sa.pop();
        System.out.println(top);
        see=sa.peek();
        System.out.println(see);
        sa.push(3);
        sa.push(3);
        sa.push(2);
        sa. push(1);
        sa.push(4);
        while(!sa.isEmpty()){
            System.out.println(sa.pop());
        }
        System.out.println(sa.pop());
    }
}
