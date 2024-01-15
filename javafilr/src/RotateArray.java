import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int l=nums.length-1;
        int idx=0;
        int item=0;
        while(k>0){
            item = nums[l];
            for (int i=l; i>0; i--){
                nums[i]=nums[i-1];
            }
            nums[0]=item;
            k--;
        }
    }
}
