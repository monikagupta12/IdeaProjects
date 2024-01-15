import org.w3c.dom.stylesheets.LinkStyle;

import java.util.*;

public class VaildString{
    public static class Node{
        Node[] childern =new Node[27];
        boolean eow;
        public Node(){
        }
    }

    Node root=new Node();
    public void insert(String word, int i,Node curr){
        if(i==word.length()){
            curr.eow=true;
            return;
        }
        char ch=word.charAt(i);
        if(ch=='/'){
            if(curr.childern[26]==null){
                curr.childern[26]=new Node();
            }
            insert(word,i+1,curr.childern[26]);
        }
        else{
            if(curr.childern[ch-'a']!=null&& curr.childern[ch-'a'].eow){
                return;
            }
            if(curr.childern[ch-'a']==null){
                curr.childern[ch-'a']=new Node();
            }
            insert(word,i+1,curr.childern[ch-'a']);
        }
    }
    public List<String> removeSubfolders(String[] folder) {
        for(String str:folder){
            insert(str,0,root);
        }
        List<String> list=new ArrayList<>();
        addFolder(root,list,new StringBuilder());
        return list;
    }
    public void addFolder(Node curr,List<String> list,StringBuilder sb){
        if(curr.eow){
            boolean flag=false;
            if(curr.childern[26]!=null ){
                list.add(sb.toString());
                return;
            }
            for(int i=0; i<27; i++){
                if(curr.childern[i]!=null){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                list.add(sb.toString());
                return;
            }
        }
        for(int i=0; i<26; i++){
            if(curr.childern[i]!=null){
                sb.append((char)(i+'a'));
                addFolder(curr.childern[i],list,sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
        if(curr.childern[27]!=null){
            sb.append('/');
            addFolder(curr.childern[27],list,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        VaildString v1=new VaildString();
        String[] dictionary={"/a","/a/b","/c/d","/c/d/e","/c/f"};
       v1.removeSubfolders(dictionary);

       int[] profits = {1,2,3};
       int[] capital = {0,1,1};

    }
}



