import java.util.*;

public class ProblemHashMap {
    public static void main(String[] args) {
        String[] input = {"cat","bat","tan","tab","nat","ant","act"};
        List<List<String>> outPut = new ArrayList<>();
        outPut = groupAnagrams(input);
        for (List<String> group : outPut) {
            for (String str : group) {
                System.out.print(str+" ");
            }
            System.out.println();
        }
    }

    public static List<List<String>> groupAnagrams(String[] s) {
        List<List<String>> output = new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();

        for (String str : s) {
            char[] chArray = new char[26];
            for (int i = 0; i < str.length(); i++){
                chArray[str.charAt(i) - 'a']++;
            }
            String key = String.valueOf(chArray);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }
//        for(String str:s){
//           char[] ch=str.toCharArray();
//            Arrays.sort(ch);
//            String key= Arrays.toString(ch);
//            if(!map.containsKey(key)){
//               map.put(key,new ArrayList<>());
//            }
//            map.get(key).add(str);
//        }
//        return new ArrayList<>(map.values());

}
