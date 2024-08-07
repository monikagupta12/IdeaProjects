/**
 * @author devenps
 */
import java.util.*;
public class numarical {
    public static void main(String[] args) {

        int[][] r = {{10, 3}, {7, 1}, {5, 2}, {5, 9}, {2, 6}, {2, 4}, {1, 4}};
        int[][] p={{10, 3}, {8, 10}, {8, 5}, {7, 10}, {6, 6} ,{5, 4} ,{3, 6}, {2, 3}};


        int[] v = {10, 100};
        Integer[] a = {3, 28, 33, 26, 34, 20, 27, 5, 21, 23, 4, 21, 37, 35, 32, 15, 14, 1, 7, 2, 9, 6, 38, 17, 30, 18, 16, 13, 24, 29, 12, 14, 8, 36, 11, 31, 25, 22, 10, 19};
        List<Integer> list = Arrays.asList(a);
        TreeNode root = new TreeNode(1);


        String[] m = {"01:15","02:00"};
        String []n={"02:00","03:00"};
        char[] t = {'a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o'};
        int[] val = {1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};


        Integer[] t1 = {2, 5};
        Integer[] t2 = {3, 2};
        Integer[] t3 = {3, 0, 5};
        Integer[] t4 = {1, 2, 10};

        List<Integer> pr = Arrays.asList(t1);

        List<Integer> p3 = Arrays.asList(t3);
        List<Integer> p4 = Arrays.asList(t4);
        List<List<Integer>> co = new ArrayList<>();
        co.add(p3);
        co.add(p4);
        RandomizedCollection r1=new RandomizedCollection();
        r1.insert(10);
        r1.insert(10);
        r1.insert(20);
        r1.insert(20);
        r1.insert(30);
        r1.insert(30);
        r1.remove(10);
        r1.remove(10);
        r1.remove(30);
        r1.remove(30);


        r1.remove(1);
        r1.insert(1);
        r1.getRandom();



    }
    static class RandomizedCollection {
        ArrayList<Integer>list;
        Map<String ,Integer> map;
        Map<Integer,Integer>numToFreq;
        Random r1=new Random();

        public RandomizedCollection() {
            list=new ArrayList<>();
            map=new HashMap<>();
            numToFreq=new HashMap<>();
        }

        public boolean insert(int val) {
            StringBuilder sb=new StringBuilder();
            sb.append(val).append('#').append(1);
            String s=sb.toString();
            int n=list.size();
            if(map.containsKey(s)){
                int maxFreq=numToFreq.get(val);
                maxFreq++;
                numToFreq.put(val,maxFreq);
                StringBuilder sb1=new StringBuilder();
                sb1.append(val).append('#').append(maxFreq);
                map.put(sb1.toString(),n);
                list.add(val);
                return false;
            }
            else{
                numToFreq.put(val,1);
                map.put(s,n);
                list.add(val);
                return true;
            }
        }

        public boolean remove(int val) {
            StringBuilder sb=new StringBuilder();
            sb.append(val).append('#').append(1);
            String s=sb.toString();
            int n=list.size();
            if(!map.containsKey(s)){
                return false;
            }
            int maxFreq=numToFreq.get(val);
            StringBuilder sb1=new StringBuilder();
            sb1.append(val).append('#').append(maxFreq);
            maxFreq--;
            if(maxFreq==0){
                numToFreq.remove(val);
            }
            else{
                numToFreq.put(val,maxFreq);
            }


            int pos=map.get(sb1.toString());
            map.remove(sb1.toString());
            if(pos==list.size()-1){
                list.remove(list.size()-1);
                return true;
            }

            int lastElement=list.get(list.size()-1);
            int lastFreq=numToFreq.get(lastElement);
            StringBuilder sb2=new StringBuilder();
            sb2.append(lastElement).append('#').append(lastFreq);
            map.put(sb2.toString(),pos);

            list.set(pos,lastElement);
            list.remove(list.size()-1);
            return true;

        }

        public int getRandom() {
            int n=list.size();
            int pos=r1.nextInt(n);
            return list.get(pos);

        }
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

