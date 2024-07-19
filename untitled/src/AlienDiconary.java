import java.util.*;

/**
 * @author devenps
 */

public class AlienDiconary {
    public static void main(String[] args) {
        String[] words={"kaa","akcd","akca","cak","cad","kak"};
        String ans=findAlienDicnoary(words);
        System.out.println(ans);
    }

    private static String findAlienDicnoary(String[] words) {
        Map<Character, Set<Character>> graph=new HashMap<>();
        int[]indgree=new int[26];

        int n=words.length;
        for(String s:words){
            for(char ch:s.toCharArray()){
                graph.put(ch,new HashSet<>());
            }
        }

        for(int i=0; i<n-1; i++){
            String s1=words[i]; String s2=words[i+1];
            int len1=s1.length(); int len2=s2.length();
            if(len1>len2 && s1.startsWith(s2)){
                System.out.println("invaild case");
                return "";
            }
            for(int k=0; k<Math.min(len1,len2); k++){
                char ch1=s1.charAt(k);
                char ch2=s2.charAt(k);
                if(ch1!=ch2){
                    if(!graph.get(ch1).contains(ch2)){
                        graph.get(ch1).add(ch2);
                        indgree[ch2-'a']++;
                        break;
                    }
                }
            }
        }


        String s1=bfs(graph,indgree);
        StringBuilder sb2=new StringBuilder();
        int[]visit=new int[26];
        for(Character key:graph.keySet()){
            if(indgree[key-'a']==0 && visit[key-'a']==0){
                if(dfs(graph,key,sb2,visit)){
                    System.out.println("bfs"+ "-->"+s1);
                    System.out.println("dfs"+ "-->"+"");
                    return " ";
                }
            }
        }
        sb2.reverse();
        System.out.println("bfs"+ "-->"+s1);
        System.out.println("dfs"+ "-->"+sb2.toString());
        return sb2.toString();
    }

    private static  boolean dfs(Map<Character, Set<Character>> graph, char curr, StringBuilder sb2, int[] visit) {
        visit[curr-'a']=1;
        for(char dest:graph.get(curr)){
            if(visit[dest-'a']==1){
                return true;
            }
            if(visit[dest-'a']==0 && dfs(graph,dest,sb2,visit)){
                return true;
            }
        }
        visit[curr-'a']=2;
        sb2.append(curr);
        return false;
    }

    private static String bfs(Map<Character, Set<Character>> graph, int[] indgree) {
        Queue<Character>q=new LinkedList<>();
        StringBuilder sb=new StringBuilder();
        for(char key: graph.keySet()){
            if(indgree[key-'a']==0){
                q.add(key);
            }
        }
        while (!q.isEmpty()){
            char curr=q.remove();
            sb.append(curr);
            for(char dest:graph.get(curr)){
                indgree[dest-'a']--;
                if(indgree[dest-'a']==0){
                    q.add(dest);
                }
            }
        }
        return sb.length()==graph.size() ?sb.toString() :"";
    }


}
