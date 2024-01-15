import java.sql.Array;
import java.util.*;

public class combination {
    public static void main(String[] args) {
        int[] nums= {2,1,3};
        int target=35;
        List<List<Integer>> outPut = new ArrayList();

       int numb =combinationSum4(nums ,target);
        System.out.println(numb);
//        for(List<Integer> combo:outPut){
//            for(int :combo){
//                System.out.print(num +" ");
//            }
//            System.out.println();

    }
    public static int combinationSum4(int[] nums, int target ) {

        if(target==0){
            return 1;
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            int cc=nums[i];
            if(cc<=target){

                count=count+ combinationSum4(nums,target-cc);


            }
        }
        return count;

    }
//    private  static int totalCombinationSum(int[] nums,int target,List<Integer> pair ){
//        if(target==0){
//            for(int num:pair){
//                System.out.print(num+" ");
//            }
//            System.out.println();
//            return 1;
//        }
//        int count=0;
//        for(int i=start;i<nums.length;i++){
//            int cc=nums[i];
//            if(cc<=target){
//                pair.add(cc);
//                count=count+ totalCombinationSum(nums,target-cc,i,pair);
//                pair.remove(pair.size()-1);
//
//            }
//        }
//        return count;
//    }

}
