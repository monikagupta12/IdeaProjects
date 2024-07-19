
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;

public class Check {
    public static class Node{
        int val;
        Node(int val){
            this.val = val;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return val == node.val;
        }

        @Override
        public int hashCode() {
            return Objects.hash(val);
        }
    }
    public static void main(String[] args) {
        Map<Node, String> map = new HashMap<>();
        Node node = new Node(1);
        Node node1 = new Node(1);

        map.put(node, "Dev");

        if (map.containsKey(node1)){
            System.out.println("Value Match");
        } else {
            System.out.println("Doesn't Match");
        }


        //int[][] k = {{3,4,4},{2,5,6},{4,7,10},{9,6,5},{7,4,4},{6,2,10},{6,8,6},{7,9,4},{1,5,4},{1,0,4},{9,7,3},{7,0,5},{6,5,8},{1,7,6},{4,0,9},
               // {5,9,1},{8,7,3},{1,2,6},{4,1,5},{5,2,4},{1,9,1},{7,8,10},{0,4,2},{7,2,8}};
        char[][] r={{'X','X','X'},{'X','O','X'},{'X','X','X'}};
        int[][] arr1={{1,2}};
        int[][] arr2={{1,1},{1,0}};
        int [] st={4,3,6,3,11,6,4};
        int [] e={2,3};
        int[] b={352655,586228,169685,541073,584647,413832,576537,616413};
        Integer[] c1 = {1,2};
        Integer[] c2 = {2,3};
        Integer[] c3 = {3,4};
        Integer[] c4 = {4,2};
        Integer[] c5 = {1,4};
        Integer[] c6 = {2,5};


        int[] t = {8,3,4,8,0,6,7,0,5};
        List<List<Integer>> p=new ArrayList<>();
        p.add(Arrays.asList(c1));
        p.add(Arrays.asList(c2));
        p.add(Arrays.asList(c3));
        p.add(Arrays.asList(c4));
        p.add(Arrays.asList(c5));
        p.add(Arrays.asList(c6));


        char[] or={'c','d','a','a','c','a','d'};
        char[] ch={'a','a','d','b','d','c','c'};
        String s1 = "bcaabaddac";
        String s2 = "bdccbdaadc";
        String baseStr = "hold";
        List<Integer> l1 = new ArrayList<>();
        String[] s={"a","b"};

        List<List<String>> equations=new ArrayList<>();
        equations.add(Arrays.asList(s));

        String[] i1={"JFK","KUL"};
        String[] i2={"JFK","NRT"};
        String[] i3={"NRT","JFK"};
//        String[] i4={"ATL","JFK"};
//        String[] i5={"ATL","SFO"};

        List<List<String>> queries=new ArrayList<>();
        queries.add(Arrays.asList(i1));
        queries.add(Arrays.asList(i2));
        queries.add(Arrays.asList(i3));
//        queries.add(Arrays.asList();
//        queries.add(Arrays.asList(i5));




         new Check().minimumCost(s1,s2,or,ch,st);
        System.out.println();


    }
    class Pair{
        int node;
        int cost;
        Pair(int node, int cost){
            this.node=node;
            this.cost=cost;
        }
    }
    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {
        int[][] graph=new int[26][26];
        for(int i=0; i<26; i++){
            Arrays.fill(graph[i],-1);
        }
        for(int i=0; i<original.length; i++){
            int u=original[i]-'a';
            int v=changed[i]-'a';
            graph[u][v]=cost[i];
        }
        int[][] dis=new int[26][26];
        for(int i=0; i<26; i++){
            Arrays.fill(dis[i],Integer.MAX_VALUE);
        }
        for(int i=0; i<original.length; i++){
            int u=original[i]-'a';
            if(dis[u][u]==Integer.MAX_VALUE){
                minDistance(graph,u,dis[u]);
            }
        }
        int count=0;
        for(int i=0; i<source.length(); i++){
            int u=source.charAt(i)-'a';
            int v=target.charAt(i)-'a';
            if(dis[u][v]==Integer.MAX_VALUE){
                return -1;
            }
            count+=dis[u][v];
        }
        return count;



    }
    private void  minDistance(int[][] graph, int scr, int[] dis){
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.cost-b.cost);
        pq.add(new Pair(scr,0));
        dis[scr]=0;
        while(!pq.isEmpty()){
            Pair curr=pq.remove();
            int u=curr.node;
            for(int v=0; v<26; v++){
                if(graph[u][v]!=-1){
                    if(dis[v]>dis[u]+graph[u][v]){
                        dis[v]=dis[u]+graph[u][v];
                        pq.add(new Pair(v,dis[v]));
                    }
                }
            }
        }
    }
}

