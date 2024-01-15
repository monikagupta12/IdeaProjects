import java.util.ArrayList;
import java.util.List;

public class SummaryRange {
    public static void main(String[] args) {
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        List<String> list = new ArrayList<>();
        list = summaryRanges(nums);
        for (String range : list) {
            System.out.print(range + " ");
        }
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        int start = 0;
        int end = 0;
        int count = 0;
        int endcount = -1;
        int lastindex = 0;
        for (int i = 1; i < nums.length; i++) {
            StringBuilder str = new StringBuilder();
            if (nums[i] == nums[i - 1] + 1) {
                count++;
                continue;
            }
            if (i == 1 && count == 0) {
                str.append(nums[0]);
            } else {
                endcount = count;
                lastindex = i;
                end = nums[i - 1];
                if (count == 0) {
                    str.append(end);
                } else {
                    start = nums[i - 1 - count];
                    str.append(start);
                    str.append("->");
                    str.append(end);
                }
            }
            list.add(str.toString());
            count = 0;
        }
        if (end != nums[nums.length - 1]) {
            end = nums[nums.length - 1];
            StringBuilder s = new StringBuilder();
            if (lastindex == nums.length - 1) {
                s.append(end);
            } else {
                start = nums[nums.length - 1 - endcount - 1];
                s.append(start);
                s.append("->");
                s.append(end);
            }
            list.add(s.toString());
        }
        return list;
    }

}
