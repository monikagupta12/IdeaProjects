import java.util.Arrays;

public class shortQus {
    public static void main(String[] args) {

    }
    public int[][] merge(int[][] intervals) {
        int l = intervals.length - 1;
        Arrays.sort(intervals, (a, b) -> a[0]-b[0]);

        int idx = 1;
        for (int i = 0; i < l; i++) {
            if (intervals[i][1] >= intervals[i + 1][0]) {
                intervals[i][0] = intervals[i][0];
                intervals[i][1] = intervals[i + 1][1];
            } else {
                intervals[idx][0] = intervals[i + 1][0];
                intervals[idx][1] = intervals[i + 1][1];
                idx++;
            }
        }
        int a[][] = new int[idx][2];
        for (int i = 0; i < idx; i++) {
            a[i][0] = intervals[i][0];
            a[i][1] = intervals[i][1];
        }
        return a;
    }
}
