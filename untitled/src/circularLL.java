public class circularLL {
    Node head;
    public class Node{
        int data;
        Node perv;
        Node next;
        Node( int data){
            this.data=data;
            this.next=null;
            this.perv=null;
        }
    }
    public void insertDELL(int data, int index){
        Node newNode =new Node(data);
        if(head==null && index !=1){
            System.out.println("INVALID ADDRESS");
            return;
        }
        if(head==null && index==1){
            head=newNode;
            return;
        }
        if(index==1){
            newNode.next=head;
            newNode.perv=null;
            head.perv=newNode;
            head=newNode;
            return;
        }
        int count=1;
        Node temp=head;
        while(count<index-1 && temp.next!=null){
            temp=temp.next;
            count++;
        }
        if(count!=index-1){
            System.out.println("INVALID INDEX");
            return;
        }
        newNode.next=temp.next;
        newNode.perv=temp;
        if(temp.next!=null){
            temp.next.perv=newNode;
        }
        temp.next=newNode;
        return;
    }
    public void deleteDELL(int index){
        if(head==null){
            System.out.println("EMPTY LIST");
            return;
        }
        if(head.next==null && index==1){
            head=null;
            return;
        }
        if(index==1){
            head=head.next;
            head.perv=null;
            return;
        }
        int count=1;
        Node temp=head;
        while(count<index && temp.next!=null){
            temp=temp.next;
            count++;
        }
        if(count!=index){
            System.out.println("INVALID INDEX");
            return;
        }
        Node temp2=temp.perv;
        temp2.next=temp.next;
        if(temp.next!=null){
            temp.next.perv=temp.perv;
        }
        return;
    }
    public void printLL(){
        if(head==null){
            System.out.println("EMPTY LIST");
            return;
        }
        Node temp=head;
        while (temp!= null){
            System.out.print( temp.data +"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public int size(){
        if(head==null){
            return 0;
        }
        int size=0;
        Node temp=head;
        while (temp!=null){
            temp=temp.next;
            size++;
        }
        return size;
    }

    public static void main(String[] args) {
        circularLL list=new circularLL();
        list.insertDELL(1,2);
        list.insertDELL(1,1);
       list.insertDELL(2,2);
       list.insertDELL(3,3);
       list.insertDELL(4,4);
        list.printLL();
       list.insertDELL(5,6);
        list.printLL();
      System.out.println(list.size());
       list.deleteDELL(4);
       list.deleteDELL(1);
       list.deleteDELL(4);
        list.printLL();
        list.insertDELL(1,2);
        list.insertDELL(1,3);
        list.printLL();
        list.deleteDELL(3);
        list.deleteDELL(4);
        list.printLL();
        System.out.println(list.size());


    }

}
