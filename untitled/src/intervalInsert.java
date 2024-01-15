import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class intervalInsert {
    public static void main(String[] args) {
        int[][]intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval={4,8};
        int[][] iNew=new int[intervals.length+1][2];
        iNew=insert(intervals,newInterval);
        for(int[] row:iNew){
            for(int num:row){
                System.out.print(num +" ");
            }
            System.out.print(" ");
        }
    }
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        int idx = 0;
        int l = intervals.length;
        for (int i = 0; i < l; i++) {
            if (intervals[i][0] > newInterval[0]) {
                idx = i;
                break;
            }
        }
        for (int i = 0; i <idx; i++) {
            list.add(intervals[i]);
        }
        list.add(newInterval);
        for (int i = idx; i <intervals.length; i++) {
            list.add(intervals[i]);
        }
        return merge(list.toArray(new int[list.size()][]));
    }
    private static int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<>();
        int[] mInterval = intervals[0];
        list.add(mInterval);
        for (int[] num : intervals) {
            if (mInterval[1] >= num[0]) {
                mInterval[1] = Math.max(mInterval[1], num[1]);
            } else {
                mInterval = num;
                list.add(num);
            }
        }
        return list.toArray(new int[list.size()][]);
    }

}
