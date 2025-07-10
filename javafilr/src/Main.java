import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int[] at={903, 896, -260, -803, 389, 167, 810, 124, -435, 710, -669, 693,
               335, -916, 396, 56, -470, 197, -554, -17, 529, 71, -775, -400, -738, -175, -741,
               816, 447, -228, 52, -620, 132, -21, 215, 309, 676, 368, 897, -513, -958, -7, -344, 768,
               465, -812, 401, -994, 641, -606, 933, -116, 213, -619, 403, -630, -809, -792, 478, 112, 636,
               -659, 624, 21, -482, -868, 76, 76, 391, 135, -289, -466, 646, -598, 364, 55, 277,
               -198, 782, 647, 612, 935, -625, 240, 948, 396, -635, 529, -644, -103, 974, -511, -63, -663,
               -390, -238, 670, -460, 300, 317, 934};
       int[] dt={81, 13, 36, 65, 38, 69};
       int[][] arr={{0 ,1, 0 },{0, 0, 1 },{1, 1, 1 },{0,0, 0 }};
       Main m1=new Main();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);



       TreeNode root=new TreeNode(1);
        root.right=new TreeNode(2);

        String str ="lingmindraboofooowingdingbarrwingmonkeypoundcake";

        char[][] word={{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String[] words={"What","must","be","acknowledgment","shall","be"};
        int [][] mat={{1}};
       find_height(dt,6,47);
    }
    static class  TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }

    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    static int find_height(int tree[], int n, int k)
    {
        int si=0;
        int ei=0;

        for(int num:tree){
            if(num>ei){
                ei=num;
            }

        }

        while(si<=ei){
            int mid=si+(ei-si)/2;
            int ans=isPossible(mid, tree);
            if(ans==k){
                return mid;
            }
            else if(ans<k){
                si=mid+1;
            }
            else{
                ei=mid-1;
            }
        }
        return -1;
    }

    static int isPossible(int h, int tree[]){
        int count=0;
        for(int num:tree){
            if(num>h){
                count+=(num-h);
            }
        }
        return count;
    }
}






