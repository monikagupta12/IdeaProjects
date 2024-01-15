import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DeleatInterval {
    public static void main(String[] args) {
        int[][] intervals = {{1, 4}, {3, 5}, {6, 7}, {8, 10}, {12, 16}};
        int[][] iNew = new int[intervals.length][2];
        iNew = merge(intervals);
        for (int[] row : iNew) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.print(" ");
        }

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
//    public static int[][] merge(int[][] intervals) {
//        Arrays.sort(intervals, (a, b) -> a[0]-b[0]);
//        int l=intervals.length ;
//        int idx=0;
//        for(int i=0; i<l-1; i++){
//            if(intervals[i][1] >= intervals[i+1][0]){
//                if(intervals[i][1]<=intervals[i+1][1]){
//                    intervals[i+1][0]=intervals[i][0 ];
//                }
//            }
//            else{
//                intervals[idx][0]=intervals[i][0];
//                intervals[idx][1]=intervals[i][1];
//                idx++;
//            }
//        }
//        intervals[idx][0]=intervals[l-1][0];
//        intervals[idx][1]=intervals[l-1][1];
//        idx++;
//
//        int a[][]=new int[idx][2];
//        for(int i=0; i< idx; i++){
//            a[i][0]=intervals[i][0];
//            a[i][1]=intervals[i][1];
//        }
//        return a;
//    }


