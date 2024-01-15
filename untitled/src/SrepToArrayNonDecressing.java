import java.util.ArrayList;
import java.util.List;

public class SrepToArrayNonDecressing {
    public static void main(String[] args) {
        int[] nums={10,6,5,10,15};
        int total= totalSteps(nums);
        System.out.println(total);
    }
    public static int totalSteps(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            list.add(nums[i]);
        }
        int count=0;
        boolean flag=true;
        while(flag){
            int perv=list.get(0);
            flag=false;
            for(int i=1;  i<list.size(); i++){
                int current=list.get(i);
                if(perv>current){
                    list.remove(i);
                    flag= true;
                }
                perv=current;
            }
            count++;
        }
        return count-1;

    }
}
