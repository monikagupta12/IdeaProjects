/**
 * @author devenps
 */
import java.util.*;
public class numarical {
    public static void main(String[] args) {
        int[][] r = {{1,2},{4,2},{1,3},{5,2}};


        int[]v={1,0,2,1,3};
        Integer[] a = {3, 28, 33, 26, 34, 20, 27, 5, 21, 23, 4, 21, 37, 35, 32, 15, 14, 1, 7, 2, 9, 6, 38, 17, 30, 18, 16, 13, 24, 29, 12, 14, 8, 36, 11, 31, 25, 22, 10, 19};
        List<Integer> list = Arrays.asList(a);
        TreeNode root = new TreeNode(1);

        root.right = new TreeNode(2);


        root.right.left = new TreeNode(2);

        String[] m = {"jnfbyktlrqumowxd","mvhgcpxnjzrdei"};
        String[] t = {"r", "am", "jg", "umhjo", "fov", "lujy", "b", "uz", "y"};


        Integer[] t1 = {1,2};
        Integer[] t2 = {4,2};
        Integer[] t3 = {1,3};
        Integer[] t4 = {5,2};

        List<Integer> p1 = Arrays.asList(t1);
        List<Integer> p2 = Arrays.asList(t2);
        List<Integer> p3 = Arrays.asList(t3);
        List<Integer> p4 = Arrays.asList(t4);
        List<List<Integer>> co=new ArrayList<>();
        co.add(p1);
        co.add(p2);
        co.add(p3);
        co.add(p4);





        numarical n1 = new numarical();
        n1.convert("PAYPALISHIRING",3);
        System.out.println();


    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public String convert(String s, int numRows) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int gap=numRows+numRows-2;
        int diff=gap;

        for(int r=0; r<numRows; r++){
            for(int i=r; i<n; i=i+gap){
                sb.append(s.charAt(i));
                if(diff!=gap || diff!=0 ||i+gap>=n){
                    continue;
                }
                sb.append(s.charAt(i+gap));
            }
            gap=gap-2;

        }
        return sb.toString();
    }
}

