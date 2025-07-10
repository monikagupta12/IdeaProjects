package CollectorInterface;

import java.util.Arrays;

public class Qustion2 {
    public int findLongestAlternatingSubarray(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int neg=0;
        int pos=0;
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                pos=neg+1;
                neg=0;
            }
            else if(arr[i]<0){
                neg=pos+1;
                pos=0;
            }
            else{
                int temp=neg+1;
                neg=pos+1;
                pos=temp;
            }
            max=Math.max(max,Math.max(pos,neg));
//            if (arr[i] * arr[i - 1] < 0){
//                pos++;
//                neg++;
//            }
//            else if(arr[i]==0) {
//                 if(arr[i-1]>0){
//                     neg=pos+1;
//                     pos=1;
//                 }
//                 else if (arr[i-1]<0){
//                     pos=neg+1;
//                     neg=1;
//                 }
//                 else{
//                     int p=neg+1;
//                     neg=pos+1;
//                     pos=p;
//                 }
//            }
//            else if(arr[i-1]==0) {
//                if(arr[i]>0){
//                    pos=1;
//                    neg=neg+1;
//                }
//                else{
//                    neg=1;
//                    pos=pos+1;
//                }
//            }
//            else{
//                pos=1;
//                neg=1;
//            }

        }
        return max;
    }



    public static void main(String[] args) {
        Qustion2 q=new Qustion2();
        int[] arr={1,0,0,1};
        int val=q.findLongestAlternatingSubarray(arr);
        System.out.println(val);

    }
}
