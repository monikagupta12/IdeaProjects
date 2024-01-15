public class setColors {
    public static void main(String[] args) {
        int[]nums={2,0,2,1,1,0};
        moveZeroes(nums);
      //  sortColors(nums);
        for (int num:nums){
            System.out.print(num+" ");
        }
    }
    public static void moveZeroes(int[] nums) {
        int x=0;
        int l=nums.length;
        for(int i=0; i<l; i++){
            if(nums[i]!=0){
                nums[x++]=nums[i];
            }
        }
        for(int i=x; i<(l-x); i++){
            nums[i]=0;
        }

    }
    public static  void sortColors(int[] nums) {
        int p0=0;
        int p1=0;
        int p2=nums.length-1;
        while(p1<=p2){
            if(nums[p1]==0){
                swap(p0,p1,nums);
                p0++;
                p1++;
            }
            else if(nums[p1]==2){
                swap(p1,p2,nums);
                p2--;
            }
            else if(nums[p1]==1){
                p1++;
            }



        }

    }
    private static void swap(int index1,int index2, int[]nums){
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;

    }
}
