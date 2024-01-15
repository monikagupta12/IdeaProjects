public class BinarySearch {
    public static void main(String[] args) {
        int[] nums={3,1};
         int target=1;
         boolean targetPresent=search(nums,target);
        System.out.println(targetPresent);
    }
    public static boolean search(int[] nums, int target) {
        int ei=nums.length-1;
        int si=0;
        while(si<=ei){
            int mid= si+(ei-si)/2;
            if(target==nums[mid]){
                return true;
            }
            else if(nums[si]==nums[mid] && nums[mid]==nums[ei]&& si!=mid && mid!=ei){
                si++;
                ei--;
                continue;
            }
            else if(nums[si]<=nums[mid]){
                if(nums[si]<=target  &&  target<=nums[mid]){
                    ei=mid-1;
                }
                else {
                    si = mid + 1;
                }
            }
            else{
                if(nums[mid]<=target  &&  target<=nums[ei]){
                    si=mid+1;
                }
                else{
                    ei=mid-1;
                }

            }
        }
        return false;
    }

}