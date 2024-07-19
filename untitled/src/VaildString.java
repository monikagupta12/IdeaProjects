import org.w3c.dom.stylesheets.LinkStyle;

import java.util.*;

public class VaildString{

    public static class Node{
        String s;
        Map<String,Node> map= new HashMap<>();
        boolean delete;
        boolean eow;
        Node(String s){
            this.s=s;
        }
    }
    Node root=new Node("/");
    public List<List<String>> deleteDuplicateFolder(List<List<String>> paths) {
        for(List<String> path:paths){
            insert(root,path);
        }
        Map<String,Node> seen=new HashMap<>();
        dfs(root,seen);

        List<List<String>> res=new ArrayList<>();
        List<String> list=new ArrayList<>();
        deleteNode(root,res,list);

        return res;

    }


    private void insert(Node curr,List<String> path){
        for(String p:path){
            curr.map.putIfAbsent(p,new Node(p));
            curr=curr.map.get(p);
        }
        curr.eow=true;
    }


    private String dfs(Node curr,Map<String,Node> seen){
        if(curr.map.size()==0){
            return "";
        }
        StringBuilder sb=new StringBuilder();
        for(String val:curr.map.keySet()){
            String rec=dfs(curr.map.get(val),seen);
            sb.append(rec);
            sb.append(val);
        }
        String temp=sb.toString();
        if(seen.containsKey(temp)){
            seen.get(temp).delete=true;
            curr.delete=true;
        }
        else{
            seen.put(temp,curr);
        }
        return sb.toString();
    }

    private void deleteNode(Node curr,List<List<String>> res,List<String> list){
        if(curr.delete){
          return;
        }
        if(curr.eow){
            res.add(new ArrayList<>(list));
        }

        for(String val:curr.map.keySet()){
            Node child=curr.map.get(val);
            list.add(val);
            deleteNode(child,res,list);

        }
        list.remove(list.size()-1);
    }
    public static void main(String[] args) {

        VaildString v0=new VaildString();
        String[] v1={"b"};
        String[] v2={"f"};
        String[] v3={"f","r"};
        String[] v4={"f","r","g"};
        String[] v5={"f","r","g","c"};
        String[] v6={"f","r","g","c","r"};
        String[] v7={"f","o"};
        String[] v8={"f","o","x"};

        String[] v9={"f","o","x","t"};
        String[] v10={"f","o","x","d"};
        String[] v11={"f","o","l"};
        String[] v12={"l"};
        String[] v13={"l","q"};
        String[] v14={"c"};
        String[] v15={"h"};
        String[] v16={"h","t"};

        String[] v17={"h","o"};
        String[] v18={"h","o","d"};
        String[] v19={"h","o","t"};

        List<String> list1 = Arrays.asList(v1);
        List<String> list2 = Arrays.asList(v2);
        List<String> list3 = Arrays.asList(v3);
        List<String> list4 = Arrays.asList(v4);
        List<String> list5 = Arrays.asList(v5);
        List<String> list6 = Arrays.asList(v6);
        List<String> list7 = Arrays.asList(v7);
        List<String> list8 = Arrays.asList(v8);
        List<String> list9 = Arrays.asList(v9);
        List<String> list10 = Arrays.asList(v10);
        List<String> list11 = Arrays.asList(v11);
        List<String> list12 = Arrays.asList(v12);
        List<String> list13 = Arrays.asList(v13);
        List<String> list14 = Arrays.asList(v14);
        List<String> list15 = Arrays.asList(v15);
        List<String> list16 = Arrays.asList(v16);
        List<String> list17 = Arrays.asList(v17);
        List<String> list18 = Arrays.asList(v18);
        List<String> list19 = Arrays.asList(v19);


        List<List<String>> res=new ArrayList<>();
        res.add(list1);
        res.add(list2);
        res.add(list3);
        res.add(list4);
        res.add(list5);
        res.add(list6);
        res.add(list7);
        res.add(list8);
        res.add(list9);
        res.add(list10);
        res.add(list11);
        res.add(list12);
        res.add(list13);
        res.add(list14);
        res.add(list15);
        res.add(list16);
        res.add(list17);
        res.add(list18);
        res.add(list19);




        v0.deleteDuplicateFolder(res);



    }
}



