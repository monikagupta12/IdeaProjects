import java.util.Arrays;

public class InsertIntervals {
    public static void main(String[] args) {
        int[][]intervals = {{},{}};
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
        int idx1=0;
        int idx2=0;
        int l=intervals.length;
        int[][] iNew=new int[l+1][2];
        int x=0;
        for(int i=0;   i<l;   i++) {
            if (intervals[i][0] > newInterval[0]) {
                idx1 = i-1;
                break;
            }
        }
        if(intervals[idx1][1]<newInterval[0]) {
            for (int search1 = idx1 + 1; search1 < l; search1++) {
                if (intervals[search1][0] <= newInterval[1]) {
                    idx2 = search1;
                }
            }
            if (intervals[idx2][0] == newInterval[1]) {
                intervals[idx1][1] = intervals[idx2][1];
            } else {
                intervals[idx1][1] = newInterval[1];
            }
            for (int i = 0; i < l; i++) {
                if (i <= idx1) {
                    iNew[x][0] = intervals[i][0];
                    iNew[x][1] = intervals[i][1];
                    x++;
                } else if (i > idx2) {
                    iNew[x][0] = intervals[i][0];
                    iNew[x][1] = intervals[i][1];
                    x++;
                }
            }
        }
        else{
                for (int i=0; i<=idx1;i++){
                    if(i<=idx1){
                        iNew[x][0]=intervals[i][0];
                        iNew[x][1]=intervals[i][0];
                        x++;
                    }
                }
                iNew[x][0]=newInterval[0];
                iNew[x][1]=newInterval[1];
                x++;
                for (int i=idx1+1; i<=l;i++){
                        iNew[x][0]=intervals[i][0];
                        iNew[x][1]=intervals[i][0];
                        x++;
                }
        }

        return iNew;
    }
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0]-b[0]);
        int l=intervals.length ;
        int idx=0;
        for(int i=0; i<l-1; i++){
            if(intervals[i][1] >= intervals[i+1][0]){
                if(intervals[i][1]<=intervals[i+1][1]){
                    intervals[i+1][0]=intervals[i][0 ];
                }
            }
            else{
                intervals[idx][0]=intervals[i][0];
                intervals[idx][1]=intervals[i][1];
                idx++;
            }
        }
        intervals[idx][0]=intervals[l-1][0];
        intervals[idx][1]=intervals[l-1][1];
        idx++;

        int a[][]=new int[idx][2];
        for(int i=0; i< idx; i++){
            a[i][0]=intervals[i][0];
            a[i][1]=intervals[i][1];
        }
        return a;
    }


}
