public class SubarraySumEqualToK {
    public static void main(String[] args) {
        int[] nums = {-1,-1,1};
        int target = 1;
        int num = subarraySum(nums, target);
        System.out.println(num);
    }
    public static int subarraySum(int[] nums, int k) {
        int sum=0;
        int count=0;
        int start=0;
        for(int end=0; end<nums.length; end++){
            sum=sum+nums[end];
            while(sum>=k && start<=end){
                if(sum==k){
                    count++;
                }
                sum=sum-nums[start];
                start++;
            }
        }
        return count;
    }
}
