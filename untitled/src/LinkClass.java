public class LinkClass {
    Node head;
    private static int size;
    LinkClass(){
        size=0;
    }

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
            size++;
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
    public void addLast( int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
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
    public  void removeFirst(){
        if(head==null){
            System.out.println("EMPTY LIST");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        head=head.next;
        return;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("EMPTY LIST");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node temp =head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return;
    }
    //Insert in midddle
    public void insertLL(int index, int data){
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
            head=newNode;
            return;
        }
        int count =1;
        Node temp=head;
        while(count<index-1 && temp.next!=null ){
            count++;
            temp=temp.next;
        }
        if(count!=index-1){
            System.out.println("INVALID INDEX");
            size--;
            return;
        }
        newNode.next=temp.next;
        temp.next = newNode;
        return;
    }
    public void deleteLL(int index){
        if(head==null){
            System.out.println("EMPTY LIST");
            return;
        }
        size--;
        if(head.next==null && index==1){
            head=null;
            return;
        }
        if(index==1){
            head=head.next;
            return;
        }
        int count=1;
        Node temp= head;
        Node currNode=head;
        while(count<index && temp.next!=null){
            count++;
            currNode=temp;
            temp=temp.next;
        }
        if(count!=index){
            System.out.println("INVALID INDEX");
            size++;
            return;
        }
        currNode.next=temp.next;
        return;
    }
    public int sizeLL(){
        return size;
    }

    public static void main(String[] args) {
        LinkClass list=new LinkClass();
        list.insertLL(1,1);
//        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(4);
        list.addLast(5);
        list.printList();
        list.removeFirst();
        list.removeLast();
        list.printList();
        list.insertLL(1,3);
        list.insertLL(5,5);
        list.insertLL(4,0);
        list.printList();
        list.deleteLL(1);
        list.deleteLL(5);
        list.deleteLL(5);
        list.deleteLL(3);
        list.printList();
        int s=list.sizeLL();
        System.out.println(s);
        list.insertLL(5,5);
        list.insertLL(4,5);
        list.printList();
        System.out.println(list.sizeLL());
        list.insertLL(6,5);


    }
}
