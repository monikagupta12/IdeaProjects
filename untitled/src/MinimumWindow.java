import java.util.HashSet;
import java.util.Set;

public class MinimumWindow {
    public static void main(String[] args) {
        String s= "ADOBECODEBANC";
        String t="ABC";
        String out=minWindow(s,t);
        System.out.println(out);
    }
    public static String minWindow(String s, String t) {
        String output;
        Set<Character> set=new HashSet<>();
        char[] ch=new char[26];
        for(int i=0; i<t.length(); i++){
            ch[t.charAt(i) -'a']++;
            if(!set.contains(t.charAt(i))){
                set.add(t.charAt(i));
            }
        }
        int start=0;
        for(int end=0; end<s.length(); end++){
            if(s.charAt(end)==t.charAt(0)){
                start=0;
                output="";
                continue;
            }
            String chString=String.copyValueOf(ch);
            if(chString==null){
               int minilength=end-start+1;
            }

            if(set.contains(s.charAt(end))){
                ch[s.charAt(end)]--;
                start++;

            }

        }


        return "";
    }

}
