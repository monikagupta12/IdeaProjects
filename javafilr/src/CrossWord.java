import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CrossWord {
    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>listPairs=new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
                int num1 = nums[i];
                twoSum(i + 1, nums, num1, listPairs);
        }
        return listPairs;
    }
    public static void twoSum(int si, int[] nums, int num1,List<List<Integer>> listPairs) {
        if(si==nums.length-1) {
            return;
        }
        int temp=si;
        int ei = nums.length - 1;
        while (si < ei) {
            List<Integer> pair=new ArrayList<>();
            if (nums[si] + nums[ei] == (-1)* num1) {
                        pair.add(num1);
                        pair.add(nums[si]);
                        pair.add(nums[ei]);
                        listPairs.add(pair);
                        si++;
                        continue;

            } else if (nums[si] + nums[ei] < (-1)*num1) {
                si++;
            } else {
                ei--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
        List<List<Integer>>listPairs=new ArrayList<>();
        
        listPairs=threeSum(nums);
       for(List<Integer> pair:listPairs){
           for(int digit:pair){
               System.out.print(digit+" ");
           }
           System.out.println();
       }
    }

}
