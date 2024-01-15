public class ReversLL {


    public ListNode sortList(ListNode head) {
        quickSort(head,null);
        return head;
    }
    private void swapNode(ListNode node1,ListNode node2){
        int temp=node1.val;
        node1.val=node2.val;
        node2.val=temp;
    }
    private ListNode partition(ListNode start, ListNode end){
        int pivot=start.val;
        ListNode x =start;
        ListNode i=start.next;
        while(i!=end){
            if(i.val<pivot){
                x=x.next;
                swapNode(x,i);
            }
            i=i.next;
        }
        swapNode(x,start);
        return x;
    }
    private void quickSort(ListNode start, ListNode end) {
        if (start == end) {
            return;
        }
        ListNode temp = start;
        boolean flag = true;
        while (temp.next != null) {
            if (temp.val > temp.next.val) {
                flag = false;
                break;
            }
            temp = temp.next;
        }
        if (!flag) {
            ListNode part = partition(start, end);
            quickSort(start, part);
            quickSort(part.next, end);
        }
        return;
    }
    public  void printList(ListNode head){
        if(head==null){
            System.out.println("LinkList Empty");
            return;
        }
        ListNode temp=head;
        while (temp !=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");
        return;
    }

    public static void main(String[] args) {
        ListNode head1=new ListNode(1);
        head1.next=new ListNode(2);
        head1.next.next=new ListNode(3);
        head1.next.next.next=new ListNode(3);





        ReversLL list=new ReversLL();
        list.printList(head1);
        System.out.println("COPY LIST");
        ListNode copy=list.sortList(head1);
        list.printList(copy);




    }
    public static class ListNode {
        int val;
       ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
