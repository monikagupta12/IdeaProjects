public class BinaryTree {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int val){
            this.val=val;
        }
    }
    static class BinaryTreeDev {
        static int i = -1;

        public static TreeNode buildTree(int[] nodes) {
            if (i == nodes.length) {
                return null;
            }
            i++;
            if (nodes[i] == -1) {
                return null;
            }
            TreeNode root = new TreeNode(nodes[i]);
            root.left = buildTree(nodes);
            root.right = buildTree(nodes);
            return root;
        }
    }



    public static void main(String[] args) {
        int[] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTreeDev b=new BinaryTreeDev();
        TreeNode root=b.buildTree(nodes);
    }

}
