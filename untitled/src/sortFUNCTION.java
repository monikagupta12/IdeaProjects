import java.util.Arrays;

public class sortFUNCTION {
    public static void main(String[] args) {
        Integer[] nums={1000000000, 1000000000};
        //Arrays.sort(nums);
        Arrays.sort(nums,sortFUNCTION::compare);
        StringBuilder str =new StringBuilder();
        for(int i=0; i<nums.length; i++){
            str.append(nums[i]);
        }
        System.out.println(str);
    }
    public static Integer compare(Integer a,Integer b){
        StringBuilder s1 =new StringBuilder();
        s1.append(a);
        s1.append(b);
        StringBuilder s2 =new StringBuilder();
        s2.append(b);
        s2.append(a);
        String str1= s1.toString();
        String str2= s2.toString();
        if(str1.compareTo(str2)>=0){
            return -1;
        }
        else{
            return 1;
        }
    }

    /*public String largestNumber(int[] nums) {
        StringBuilder s1= new StringBuilder();
        StringBuilder s1= new StringBuilder();
        s1.append(num[0]);
        s2.append(num[0]);

        for(int i=0; i<nums.length-1; i++){
            s.append(nums[i]) ;
        }
        String str= s.toString();
    }
    */


}
