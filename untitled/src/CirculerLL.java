public class CirculerLL {
    Node head;
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void printLL(){
        if(head==null){
            System.out.println("EMPTY LIST");
            return;
        }
         Node temp=head;
        do {
            System.out.print( temp.data +"->");
            temp=temp.next;
        }while (temp!=head);
        System.out.println();
        return;
    }
    public int sizeLL(){
        if(head==null){
            return 0;
        }
        int size=0;
        Node temp=head;
       do{
            size++;
            temp=temp.next;
       } while (temp!=head);
        return size;
    }
    public void addFirst(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            newNode.next=newNode;
            return;
        }
        Node temp=head;
        while (temp.next!=head){
            temp=temp.next;
        }
        newNode.next=head;
        head=newNode;
        temp.next=head;
        return;
    }
    public void addLast(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            newNode.next=head;
            return;
        }
        Node temp=head;
        while (temp.next!=head){
            temp=temp.next;
        }
        temp.next=newNode;
        newNode.next=head;
        return;
    }
    public void removeFirst(){
        if (head==null){
            System.out.println("EMPTY LIST");
            return;
        }
        if(head.next==head){
            head=null;
            return;
        }
        Node temp=head;
        while (temp.next!=head){
            temp=temp.next;
        }
        head=head.next;
        temp.next=head;
        return;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("LIST EMPTY");
            return;
        }
        if(head.next==head){
            head=null;
            return;
        }
        Node temp=head;
        Node currt=head;
        while (temp.next!=head){
            currt=temp;
            temp=temp.next;
        }
        currt.next=head;
        return;
    }
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
    public void removeLoop(){
        Node p1=head;
        Node p2=head;
        Node slow=head;
        Node fast=head;
        while (fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                p2=slow;
                break;
            }
        }
        while (p1.next!=p2.next){
            p1=p1.next;
            p2=p2.next;
        }
        p2.next=null;
    }
    public  void listAfterRemoveLoop(){
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

    public static void main(String[] args) {
        CirculerLL list= new CirculerLL();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(4);
        list.addLast(5);
        list.printLL();
        System.out.println(list.sizeLL());
        list.removeFirst();
        list.removeLast();
        list.printLL();
        list.removeFirst();
        list.removeLast();
        list.removeFirst();
        list.printLL();
        list.addLast(2);
        list.printLL();
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.printLL();
        boolean loop=list.loopExit();
        System.out.println(loop);
        list.removeLoop();
        list.listAfterRemoveLoop();

    }
}