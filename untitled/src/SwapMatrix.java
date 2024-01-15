import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapMatrix {
    public static void main(String[] args){
        String[] input = {"ddddddddddg","dgggggggggg"};
        List<List<String>> outPut = new ArrayList<>();
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
        boolean[] visit=new boolean[l];
        for(int i=0; i<l; i++){
            if(visit[i]){
                continue;
            }
            List<String> temp = new ArrayList();
            temp.add(strs[i]);
            visit[i]=true;
            for(int j=i+1; j<l; j++){
                if(groupAnnagram(strs[i],strs[j])){
                    temp.add(strs[j]);
                    visit[j]=true;
                }
            }
            outPut.add(temp);
        }
        return outPut;
    }
    public static boolean groupAnnagram(String s1,String s2){
        int l1=s1.length();
        int l2=s2.length();
        if(l1!=l2){
            return false;
        }
        int[] alphabate1=new int[26];
        int[] alphabate2=new int[26];
        for(int i=0; i<l1; i++){
            alphabate1[s1.charAt(i)-'a']++;
        }
        for(int i=0; i<l2; i++){
            alphabate2[s2.charAt(i)-'a']++;
        }
        for (int i=0; i<l2; i++){
            if(alphabate1[s1.charAt(i)-'a']!=alphabate2[s1.charAt(i)-'a']){
               return false;
            }
        }
       return true;
    }



}



