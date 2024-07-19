import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author devenps
 */

public class MiniSwapSortArray {
    public static void main(String[] args) {
        int[]arr={6,4,2,14,8,10,12,16};
        Integer[]a={6,4,2,14,8,10,12,16};
        List<Integer> list= Arrays.asList(a);
        int ans=swapCount(arr,list);
        System.out.println(ans);
    }

    private static int swapCount(int[] arr, List<Integer> list) {
        Collections.sort(list);
        int n=arr.length;
        int[][]sort=new int[n][2];
        for(int i=0; i<n; i++){
            sort[i][0]=arr[i];
            sort[i][1]=i;
        }
        Arrays.sort(sort,(a,b)->a[0]-b[0]);
        boolean[]visit=new boolean[n];
        int count=0;
        for(int i=0; i<n; i++){
            if(!visit[i]){
                count+=cycleFind(i,sort,visit);
            }
        }
        return count;
    }

    private static int cycleFind(int i, int[][] sort, boolean[] visit) {
        int count=0;
        while(!visit[i]){
            count++;
            visit[i]=true;
            i=sort[i][1];
        }
        return count-1;
    }


}
