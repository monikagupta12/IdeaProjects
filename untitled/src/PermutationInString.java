import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PermutationInString {
    public static void main(String[] args) {
        String s1="a";
        String s2="ab";
        boolean vaild=checkInclusion(s1,s2);
        System.out.println(vaild);
    }
    public static boolean checkInclusion(String s1, String s2) {
        int l1=s1.length();
        int l2=s2.length();
        if(l2<l1){
            return false;
        }
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0; i<l1; i++){
            char key =s1.charAt(i);
            map.put(key,map.getOrDefault(key,0)+1);
        }
        int mapSize=map.size();
        int start=0;
        for(int end=0; end<l2; end++){
            char removeKey=s2.charAt(end);
            if(map.containsKey(removeKey)){
                int count=map.get(removeKey);
                if(count==1){
                    mapSize--;
                }
                map.put(removeKey,count-1);
            }
            if(end-start>=l1){
                char addKey=s2.charAt(start);
                if(map.containsKey(addKey)){
                    int count=map.get(addKey);
                    if(count==0){
                        mapSize++;
                    }
                    map.put(addKey,count+1);
                }
                start++;
                if(mapSize==0){
                    return true;
                }
            }
        }
        return false;
    }
}
