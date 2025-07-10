/**
 * @author devenps
 */
import java.util.*;
public class numarical {
    public static void main(String[] args) {

        int[][] r = {{0,2,1,0,0,0,0},{0,2,2,2,2,2,0},{0,2,0,0,0,0,0},{0,2,0,2,2,2,2},{0,2,0,0,0,0,0},{0,2,2,2,2,2,0},{0,2,0,0,0,0,0},{0,2,0,2,2,2,2},{0,0,0,0,0,0,0}};
        int[][] p={{1,2},{1,4},{1,5},{2,3},{2,3},{3,4},{3,5},{4,5},{6,7},{7,10},{8,9},{9,10}};


        int[] v ={-1,4,5,-2} ;
        int[] w={-5,-1,-3,-2,-4};
        Integer[] a = {3, 28, 33, 26, 34, 20, 27, 5, 21, 23, 4, 21, 37, 35, 32, 15, 14, 1, 7, 2, 9, 6, 38, 17, 30, 18, 16, 13, 24, 29, 12, 14, 8, 36, 11, 31, 25, 22, 10, 19};
        List<Integer> list = Arrays.asList(a);
        TreeNode root = new TreeNode(1);


        String[] m = {"main() {", "   int x = 1; // Its comments here", "   x++;", "   cout << x;", "   //return x;", "   x--;", "}"};
        String []n={"hot","dot","dog","lot","log"};
        char[] t = {'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o'};
        int[] val = {0,3,2,1,5,1,5,5,3,1,2,2,2,2,1};
        String str=Arrays.toString(val);
        System.out.println(str);


        Integer[] t1 = {1,2,3};
        Integer[] t2 = {0,0,4};
        Integer[] t3 = {7,6,5};


        List<Integer> p1 = Arrays.asList(t1);
        List<Integer> p2 = Arrays.asList(t2);
        List<Integer> p3 = Arrays.asList(t3);
        List<List<Integer>> co = new ArrayList<>();
        co.add(p1);
        co.add(p2);
        co.add(p3);
       numarical n1=new numarical();
       long val1= n1.validSubstringCount("bcca", "abc");
        System.out.println(val1);



    }


    public long validSubstringCount(String word1, String word2) {
        int[] freq2=new int[26];

        char[] target=word2.toCharArray();
        for(int i=0; i<target.length; i++){
            freq2[target[i]-'a']++;
        }

        int[] freq1=new int[26];
        long count=0;
        int start=0;
        int n=word1.length();
        char[] source=word1.toCharArray();
        for(int end=0; end<n; end++){
            freq1[source[end]-'a']++;

            while(start<=end && isVaild(freq1,freq2,target)){
                count+=(n-end)+1;

                freq1[source[start]-'a']--;
                start++;
            }
        }
        return count;
    }




    
    private boolean isVaild(int[] freq1, int[] freq2,char[] target){
        for(int i=0; i<target.length; i++){
            int ch=target[i]-'a';
            if(freq1[ch]<freq2[ch]){
                return false;
            }
        }
        return true;
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

}

