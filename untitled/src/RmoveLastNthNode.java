public class RmoveLastNthNode {
    Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public  void addFirst( int data){
        Node newNode= new Node(data);
        if(head==null) {
            head = newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        return;
    }
    public  void printList(){
        if(head==null){
            System.out.println("LinkList Empty");
            return;
        }
        Node temp=head;
        while (temp !=null){
            System.out.print(temp.data +"->");
            temp=temp.next;
        }
        System.out.println("null");
        return;
    }
    // remove Nth from the last
    public void removeNode(int index){
        int size=0;
        Node temp=head;
        while (temp!=null){
            size++;
            temp=temp.next;
        }
        if(index==size){
            head=head.next;
            return;
        }
        int pos=size-index;
        int count=1;
        Node currt=head;
        while (count<pos){
           currt=currt.next;
           count++;
        }
        currt.next=currt.next.next;
    }
    //check palindrome
    public  Node getMid(){
        Node slow=head;
        Node fast=head;
        while (fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node reverse(Node start){
        head=start;
        Node perv=head;
        Node curr=head;
        while(curr!=null){
            Node last=curr.next;
            curr.next=perv;

            perv=curr;
            curr=last;
        }
        head.next=null;
        return perv;
    }
    public boolean palindrome(){
        if(head==null && head.next==null){
            return true;
        }
        Node FHE=getMid();
        Node FHS=head;
        Node SHS=reverse(FHE.next);
        while (SHS!=null){
          if(FHS.data!=SHS.data){
              return false;
          }
          FHS=FHS.next;
          SHS=SHS.next;
        }
        return true;
    }
    // loop exit in list
    public boolean loopExit(){
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
    }
    public void reversList(){
        if(head==null) {
            System.out.println("EMPTY LIST");
            return;
        }
        if(head.next==null){
            return;
        }
        Node prev=head;
        Node currt=head;
        while(currt!=null){
            Node next=currt.next;
            currt.next=prev;

            prev=currt;
            currt=next;
        }
        head.next=null;
        head=prev;
    }
    public void remove(){
        Node p1=head;
        Node p2=head;
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                p2=slow;
                return ;
            }
        }
        while (p1.next==p2.next){
            p1=p1.next;
            p2=p2.next;
        }
        p2.next=null;
    }

    

    public static void main(String[] args) {
        RmoveLastNthNode list =new RmoveLastNthNode();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.printList();
        list.removeNode(5);
        list.printList();
        list.removeNode(2);
        list.printList();
        list.removeNode(1);
        list.removeNode(2);
        list.removeNode(1);
        list.printList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(1);
        list.addFirst(1);
        list.addFirst(3);
        list.addFirst(1);
        list.removeNode(3);
        list.printList();
//        boolean check=list.palindrome();
//        boolean loop=list.loopExit();
//        System.out.println("loop exit in list ?");
//        System.out.println(loop);
//        System.out.println("palindrome list or not");
//        System.out.println(check);
//        list.printList();
        list.reversList();
        System.out.println("revers list");
        list.printList();
        boolean check=list.palindrome();
        System.out.println("palindrome list or not");
        System.out.println(check);
        boolean loop=list.loopExit();
        System.out.println("loop exit in list ?");
        System.out.println(loop);
        list.printList();



    }
}
