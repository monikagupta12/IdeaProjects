import java.util.Arrays;
import java.util.List;

//import java.util.*;
//import java.util.Scanner;
//
public class ArrayListProg {
    //    public static List<List<Integer>> subsetsWithDup(int[] nums) {
//        List<List<Integer>> list =new ArrayList<>();
//        int l=nums.length;
//        subset(nums,0,list,new ArrayList());
//        return list;
//    }
//    public static void subset(int[] nums,int index, List<List<Integer>> list,List<Integer> sub){
//        if(index==nums.length){
//            list.add(new ArrayList(sub));
//            return;
//        }
//        for(int i=index; i<nums.length;i++) {
//            if (i> 1 && nums[i - 1] != nums[i]) {
//                int cc = nums[index];
//                sub.add(cc);
//                subset(nums, i + 1, list, sub);
//                sub.remove(sub.size() - 1);
//            }
//        }
//
//    }
//
// public static void main(String[] args) {
//        int nums[]={1,2,2};
//        List<List<Integer>> list =new ArrayList<>();
//      list=subsetsWithDup(nums);
      /*for (List<Integer> numList : list) {
          for (int num : numList) {
              System.out.println(num);
          }
      }*/

//     for (int i = 0; i< list.size(); i++) {
//         List<Integer> numList = list.get(i);
//         for (int j = 0; j<numList.size(); j++){
//             System.out.println(numList.get(j));
//         }
//     }
//
    public static int[] twoSum(int[] numbers, int target) {
        int si = 0;
        boolean flag=false;
        int ei = numbers.length;
        int[] index = new int[2];
        for (int i = 0; i < ei; i++) {
            index[0] = i + 1;
            for (int j = i + 1; j < ei; j++) {
                if (numbers[j] == target - numbers[i]) {
                    flag=true;
                    index[1] = j + 1;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] index = new int[2];
        index = twoSum(numbers, target);
        System.out.println(Arrays.toString(index));
    }
}

