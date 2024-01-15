import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.HashMap;
import java.util.Map;

public class RandomCheck {

    public Node copyRandomList(Node head) {
        Node temp=head;
        while(temp!=null){
            Node next=temp.next;
            Node newNode =new Node(temp.val);
            temp.next=new Node(temp.val);
            newNode.next=next;
            temp=temp.next.next;
        }
        System.out.println("check");
        printList(head);
        temp=head;
        while(temp!=null ){
            Node currentRandom=temp.random;
            if(currentRandom !=null){
                temp.next.random=currentRandom.next;
            }
            temp=temp.next.next;
        }

        Node newNode =new Node(0);
        Node original=head;
        Node copy=newNode;
        while(original!=null&& original.next!=null){
            copy.next=original.next;
            original.next=original.next.next;


            original=original.next;
            copy=copy.next;
        }
        return newNode.next;
    }
    public  void printList(Node head){
        if(head==null){
            System.out.println("LinkList Empty");
            return;
        }
        Node temp=head;
        while (temp !=null){
            System.out.print(temp.random.val +"--"+ temp.val  +"->--->");
            temp=temp.next;
        }
        System.out.println("null");
        return;
    }
    public void setRendomPointer(Node head){
        Node temp=head;
        temp.random=head;
        temp.next.random=head;
    }


    public static void main(String[] args) {
        RandomCheck list =new RandomCheck();
        Node head =new Node(1);
        head.next=new Node(2);
        list.setRendomPointer(head);
        list.printList(head);
         Node copy=list.copyRandomList(head);
         list.printList(copy);


    }
    public static class Node{
        int val;
        Node next;
        Node random;
        private Node(int data){
            this.val=data;
            this.next=null;
        }
    }


}
