import java.util.ArrayList;
import java.util.List;

public class SwapKthNode {
    public List<List<ListNode>> splitListToParts(ListNode head, int k) {
        List<List<ListNode>> list=new ArrayList<>();
        int size=0;
        ListNode temp= head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(k>size){
            ListNode current= head;
            for(int i=1; i<=k; i++){
                List <ListNode> row=new ArrayList<>();
                if(i<=size){
                    head=current.next;
                    current.next=null;
                    row.add(current);
                    current=head;
                }
                list.add(row);
            }
            return list;
        }
        ListNode current= head;
        int elementNum=size/k;
        int rem= size%k;
        for(int i=1; i<=k; i++){
            List <ListNode> row=new ArrayList<>();
            int count=elementNum;
            while(count!=0){
                row.add(current);
                current=current.next;
                count--;
            }
            if(rem!=0){
                row.add(current);
                current=current.next;
                rem--;
            }
            head=current;
            current=head;
            list.add(row);
        }
        return list;
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
        ListNode head=new ListNode(1);
         head.next=new ListNode(2);
         head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(6);
        head.next.next.next.next.next.next=new ListNode(7);
        head.next.next.next.next.next.next.next=new ListNode(8);
        head.next.next.next.next.next.next.next.next=new ListNode(9);
        head.next.next.next.next.next.next.next.next.next=new ListNode(10);


         SwapKthNode list=new SwapKthNode();
         list.printList(head);
         list.splitListToParts(head,3);
         list.printList(head);
    }
    public static class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }
}
