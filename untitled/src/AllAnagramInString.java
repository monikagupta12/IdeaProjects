import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AllAnagramInString {
    public static void main(String[] args) {
        String s= "abab";
        String t="ab";
        List<Integer> list=findAnagrams(s,t);
        for(int num:list) {
            System.out.println(list);
        }
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        if (s.length() < p.length()) {
            return list;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            char key = p.charAt(i);
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int mapSize = map.size();
        int start = 0;

        for (int end = 0; end <s.length(); end++) {
            char removeKey = s.charAt(end);   //remove at end
            if (map.containsKey(removeKey)) {
                int count = map.get(removeKey);
                if (count == 1) {
                    mapSize--;
                }
                map.put(removeKey, count - 1);
            }
            if (end - start >= p.length()) {
                char addKey = s.charAt(start);
                //add atstart start but when p.length traves
                if (map.containsKey(addKey)) {
                    int count = map.get(addKey);
                    if (count == 0) {
                        mapSize++;
                    }
                    map.put(addKey, count + 1);
                }
                start++;
            }
            if (mapSize == 0) {
                list.add(start);
            }
        }
        return list;
    }
}
