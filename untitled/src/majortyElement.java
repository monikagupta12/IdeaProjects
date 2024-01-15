import java.util.ArrayList;
import java.util.List;

public class majortyElement {
    public static void main(String[] args) {
        int[] nums={2,1,1,3,1,4,5,6};
        List<Integer> list =majorityElement(nums);
        for(int num:list) {
            System.out.println(num);
        }
    }
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        //only maximum two element happend
        int num1=0;
        int num2=0;
        int count1=0;
        int count2=0;
        for(int i=0; i<nums.length; i++){
            if(num1==nums[i]){
                count1++;
            }
            else if(num2==nums[i]){
                count2++;
            }
            else if(count1==0){
                num1=nums[i];
                count1++;
            }
            else if(count2==0){
                num2=nums[i];
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        int num1sum=0;
        int num2sum=0;
        for(int num:nums){
            if(num==num1){
                num1sum++;
            }
            else if(num==num2){
                num2sum++;
            }
        }
        if(num1sum>nums.length/3){
            list.add(num1);
        }
        if(num2sum>nums.length/3){
            list.add(num2);
        }
        return list;

    }
}
