import java.util.*;

public class NextPointer {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }

    }

    public class Pairs{
        int sum;
        int count;
        public Pairs(int sum,int count){
            this.sum=sum;
            this.count=count;
        }

    }
    public List<Double> averageOfLevels(TreeNode root) {
        List<Pairs> list=new ArrayList<>();
        List<Double> res=new ArrayList<>();
        sumAtLevel(root,0,list);
        for(Pairs curr:list){
            Double avg=(double)curr.sum/curr.count;
            res.add(avg);
        }
        return res;
    }
    private void sumAtLevel(TreeNode root, int level,List<Pairs> list){
        if(root==null){
            return;
        }
        if(list.size()==level){
            list.add(new Pairs(root.val,1));
        }
        else{
            Pairs curr=list.get(level);
            int sum=curr.sum+root.val;
            int cal=curr.count++;
            list.set(level,new Pairs(sum,cal));
        }
        sumAtLevel(root.left,level+1,list);
        sumAtLevel(root.right,level+1,list);
    }


    public static void main(String[] args) {
        NextPointer d1=new NextPointer();
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
//        root.left.left=new TreeNode(4);
//        root.left.right=new TreeNode(6);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);
   //     root.right.left.right=new TreeNode(4);
  //      root.right.right=new TreeNode(4);
  //      root.right.right.right=new TreeNode(14);
//        root.left.left.left=new TreeNode(7);
//        root.left.left.right=new TreeNode(1);
////        root.left.right.left=new Node(1);
////        root.left.right.right=new Node(0);
//        root.right.right.left=new TreeNode(5);
//        root.right.right.right=new TreeNode(3);
//        root.left.right.right.left=new Node(7);

        int[] q={3,5,4,2,4};
        List<Double>output= d1.averageOfLevels(root);
        System.out.println(output);
    }
}
