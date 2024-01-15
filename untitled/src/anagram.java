import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class anagram {
    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> outPut = new ArrayList();
        outPut = groupAnagrams(input);
        for (List<String> group : outPut) {
            for (String str : group) {
                System.out.print(str+" ");
            }
            System.out.println();
        }
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        int l = strs.length;
        List<List<String>> outPut = new ArrayList();
        int[] mapping = new int[l];
        Arrays.sort(strs, anagram::compare);
        for (String str : strs) {
            System.out.print(str + " ");
        }
        System.out.println();

        for (int i = 0; i < l; i++) {
            int sum = 0;
            for (int j = 0; j < strs[0].length(); j++) {
                sum = sum + (strs[i].charAt(j) - 'a');
            }
            mapping[i] = sum;
        }
        int start = 0;
        int end = -1;
        for (int i = 1; i < l; i++) {
            if (mapping[i - 1] != mapping[i]) {
                end = i;
                List<String> temp = new ArrayList<>();
                for (int j = start; j < end; j++) {
                    temp.add(strs[j]);
                }
                start = end;
                outPut.add(new ArrayList<>(temp));
            }
        }
        return outPut;
    }
    public static Integer compare(String s1, String s2) {
        int sum1=0;
        for (int j = 0; j < s1.length(); j++) {
            sum1 = sum1 + (s1.charAt(j) - 'a');
        }
        int sum2=0;
        for (int j = 0; j < s2.length(); j++) {
            sum2 = sum2 + (s2.charAt(j) - 'a');
        }
        if(sum1>sum2){
            return -1;
        }
        else{
            return 1;
        }
    }
}
