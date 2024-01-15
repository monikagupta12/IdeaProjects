import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainDublicates {
    public static void main(String[] args) {
        int[] nums={1,0,1,1};
        int k=1;
        boolean vaild=containsNearbyDuplicate(nums,k);
        System.out.println(vaild);
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) {
                set.remove(nums[i - k - 1]);
            }
            if(!set.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
