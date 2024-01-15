import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
    String s= "AADOBECODEBANC";
    String t="ABC";
    String out=minWindow(s,t);
        System.out.println(out);
    }


    public static String minWindow(String s, String t) {
        Map<Character, Integer> map=new HashMap<>();
        for(int i=0; i<t.length(); i++){
            char key=t.charAt(i);
            if(!map.containsKey(key)){
                map.put(key,1);
            }
            else{
                map.put(key,map.get(key)+1);
            }
        }
        int count=0;
        int start = 0;
        int miniSSlength=s.length()+1;
        int startpoint=0;
        for (int end = 0; end <s.length(); end++){
            char key=s.charAt(end);
            if (map.containsKey(key)){
                map.put((char) key,map.get(key)-1);
                if(map.get(key)>=0){
                    count++;
                }
                while(count==t.length()){
                    int length=end-start+1;
                    if(length<miniSSlength){
                        miniSSlength=length;
                        startpoint=start;
                    }
                    if(map.containsKey(s.charAt(start))){
                        map.put(s.charAt(start),map.get(s.charAt(start))+1);
                        if(map.get(s.charAt(start)) > 0){
                            count --;
                        }
                    }
                    start++;
                }
            }
        }
        if(miniSSlength>s.length())
        {
            return "";
        }
        return s.substring(startpoint,miniSSlength+startpoint);
    }
}
