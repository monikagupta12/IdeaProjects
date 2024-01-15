
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class permutation {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        //[[0,0,0,1,9],[0,0,0,9,1],[0,0,1,0,9],[0,0,1,9,0],
        // [0,0,9,0,1],[0,0,9,1,0],[0,1,0,0,9],[0,1,0,9,0],
        // [0,1,9,0,0],[0,9,0,0,1],[0,9,0,1,0],[0,9,1,0,0],[1,0,0,0,9],
        // [1,0,0,9,0],[1,0,9,0,0],[1,9,0,0,0],[9,0,0,0,1]
        // ,[9,0,0,1,0],[9,0,1,0,0],[9,1,0,0,0]]
        Arrays.sort(nums);
        List<List<Integer>> output=new ArrayList<>();
        output=permuteUnique(nums);
        int count=1;
        for(List<Integer> subset:output){
            for(int num:subset){
                System.out.print(num+" ");
            }
            count++;
            System.out.println();
        }
    }
    public static List<List<Integer>> permuteUnique(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> outPut=new ArrayList();
        permuteFuction(outPut,nums,0);
        return outPut;
    }
    public static void permuteFuction(List<List<Integer>> outPut,int[] nums,int index){
        if(index==nums.length){
            List<Integer> perm=new ArrayList<>();
            for(int num:nums){
                perm.add(num);
            }
            outPut.add(perm);
            return;
        }
        for(int i=index; i< nums.length;i++){
            swap(i,index,nums);
            permuteFuction(outPut,nums,index+1);
            swap(i,index,nums);
        }
    }
    public static void swap(int idx1 ,int idx2, int[] nums){
        int temp=nums[idx1];
        nums[idx1]=nums[idx2];
        nums[idx2]=temp;



    }
//    public static void permuteFuction( List<List<Integer>> outPut,List<Integer> perm, int[] nums,boolean[] visit){
//        if(perm.size()==nums.length){
//            outPut.add(new ArrayList(perm));
//            return;
//        }
//
//        for(int i=0; i<nums.length; i++){
//            if(!visit[i]) {
//                if(i>0 && nums[i]==nums[i-1]){
//                    continue;
//                }
//                visit[i]=true;
//                int cc = nums[i];
//                perm.add(cc);
//                permuteFuction(outPut, perm, nums, visit);
//                perm.remove(perm.size() - 1);
//                visit[i]=false;
//            }
//        }

//    }
}
