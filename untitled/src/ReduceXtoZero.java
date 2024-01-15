public class ReduceXtoZero {
    public static void main(String[] args) {
        int[] nums = {8828,9581,49,9818,9974,9869,9991,10000,10000,10000,9999,9993,9904,8819,1231,6309};
        int target = 10;
        int num = minOperations(nums, target);
        System.out.println(num);
    }

    public static int minOperations(int[] nums, int x) {
        int l=nums.length;
        int totalsum=0;
        for(int i=0; i<nums.length; i++){
            totalsum=totalsum+nums[i];
        }
        int target= totalsum-x;
        int start=0;
        int maxlength=0;
        int sum=0;
        for(int end=0; end<nums.length; end++){
            sum=sum+nums[end];
            while(sum>=target && start<target){
                if(sum==target) {
                    int length = end - start + 1;
                    if (length > maxlength) {
                        maxlength = length;
                    }
                }
                sum=sum-nums[start];
                start++;
            }
        }
        if(maxlength==0){
            return -1;
        }
        return (l-maxlength);
    }
}
