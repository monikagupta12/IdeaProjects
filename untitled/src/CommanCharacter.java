import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommanCharacter {
    public static void main(String[] args) {
        String [] words ={"daaccccd","adacbdda","abddbaba","bacbcbcb","bdaaaddc","cdadacba","bacbdcda","bacdaacd"};
        List<String> list=commonChars(words);
        for(String s:list){
            System.out.print(s +" ");
        }
    }

    public static List<String> commonChars(String[] words) {
        List<String> list=new ArrayList();
        int l=words.length;
        String result=words[0];
        for(int i=1; i<l; i++){
            result=commonLetter(result,words[i]);
        }
        for(int i=0; i<result.length(); i++){
            list.add(String.valueOf(result.charAt(i)));
        }
        return list;
    }
    private static String commonLetter(String s1,String s2){
        Map<Character,Integer> map=new HashMap<>();

        StringBuilder str =new StringBuilder();
        for(int i=0; i<s1.length(); i++){
            char key=s1.charAt(i);
            map.put(key,map.getOrDefault(key,0)+1);
        }

        for(int i=0; i<s2.length(); i++){
            char key=s2.charAt(i);
            if(map.containsKey(key)){
                int count=map.get(key);
                if(count!=0){
                    str.append(key);
                }
                map.put(key,count-1);
            }
        }
        String s=str.toString();
        return s;
    }
}
