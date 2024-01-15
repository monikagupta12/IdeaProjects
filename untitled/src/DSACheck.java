import java.util.*;

public class DSACheck {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

    }
    public String getDirections(TreeNode root, int startValue, int destValue) {
        StringBuilder rootToDest=new StringBuilder();
        pathDirectionDest(root,destValue,"",rootToDest);
        String s1=rootToDest.toString();

        StringBuilder rootToStart=new StringBuilder();
        pathDirectionDest(root,startValue,"",rootToStart);
        String s2=rootToStart.toString();

        int pos=0;
        for(int i=0; i<s2.length(); i++){
            if( i<s1.length() && s1.charAt(i)==s2.charAt(i)){

                pos=i;
            }
        }

        String part2=s1.substring(pos+1);
        String part1=s2.substring(pos+1);

        StringBuilder sb=new StringBuilder();
        for(int i=0; i<part1.length(); i++){
            sb.append('U');
        }
        sb.append(part2);
        return sb.toString();


    }

    public void pathDirectionDest(TreeNode root,int destValue, String s, StringBuilder rootToDest){
        if(root==null){
            return;
        }
        if(root.val==destValue){
            rootToDest.append(s);
            return;
        }
        pathDirectionDest(root.left, destValue, s+'L', rootToDest);
        pathDirectionDest(root.right, destValue, s+'R', rootToDest);
    }


    public static void main(String[] args) {
        DSACheck d1 = new DSACheck();
        TreeNode root=new TreeNode(5);
//
//        int[] preorder = {-1,0};
////        int[] postorder = {4, 5, 2, 6, 7, 3, 1};

        root.left=new TreeNode(1);
        root.right=new TreeNode(2);
        root.left.left=new TreeNode(3);
//        root.left.left.left=new TreeNode(6);
//        root.left.left.left.right=new TreeNode(2);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(4);
//        root.left.left.left=new TreeNode(4);
//        root.left.left.right=new TreeNode(6);
   //     root.right.right.right=new TreeNode(7);
  //      root.right.right.right=new TreeNode(7);
//        root.left.left.left=new TreeNode(8);
//        root.left.left.right=new TreeNode(9);
////////
//        root.left.right.right=new TreeNode(11);
//        root.left.right.left=new TreeNode(10);
  //    root.left.right.left=new TreeNode(1);
////      root.left.right.right=new TreeNode(3);
////        root.right.left=new TreeNode(5);
  //    root.right.right=new TreeNode(3);
  //       root.right.left.left=new TreeNode(-1);
//        root.right.right.left=new TreeNode(5);
   //    root.right.right.right=new TreeNode(5);
       int n=11;
       int depth=3;
        DSACheck d=new DSACheck();
        int[]q={4};
        String list = d.getDirections(root,3,6);
        System.out.println(list);
    }
}



