import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumProblem {
    public static void main(String[] args) {
        int[] num={1,1,-2,-2,-3,3,2,2};
        List<List<Integer>>list=new ArrayList();
        list=threeSum(num);
        for(List<Integer> pair:list) {
            for (int n : pair) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
    public  static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>list=new ArrayList();
        for(int i=0; i<nums.length-2; i++) {
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int sIndex=i+1;
            int eIndex = nums.length - 1;
            while (sIndex < eIndex) {
                int sum = nums[i] + nums[sIndex] + nums[eIndex];
                if (sum == 0) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(nums[i]);
                    pair.add(nums[sIndex]);
                    pair.add(nums[eIndex]);
                    list.add(new ArrayList(pair));
                    while (sIndex < eIndex && nums[sIndex] == nums[sIndex + 1]) {
                        sIndex++;
                    }
                    while (sIndex < eIndex && nums[eIndex] == nums[sIndex - 1]) {
                        eIndex--;
                    }
                    sIndex++;
                    eIndex--;
                } else if (sum < 0) {
                    sIndex++;
                } else {
                    eIndex--;
                }
            }
        }
        return list;
    }
}
