import java.util.*;

public class FindKPairs {
    public static class Pair{
        int index;
        int start;
        int dur;
        public Pair(int index,int start,int dur){
            this.index=index;
            this.start=start;
            this.dur=dur;
        }
    }
    public static int[] getOrder(int[][] tasks) {
        int l=tasks.length;
        Pair[] curr=new Pair[l];
        for(int i=0; i<l; i++){
            curr[i]=new Pair(i,tasks[i][0],tasks[i][1]);

        }
        Arrays.sort(curr,(a,b)->a.start-b.start);

        int[] out=new int[l];
        PriorityQueue<Pair> pq=new PriorityQueue<>(new Comparator<Pair>(){
            @Override
            public int compare(Pair a, Pair b){
                int result =a.dur-b.dur;
                if(result==0){
                    return a.index-b.index;
                }
                return result;
            }
        });

        int time=curr[0].start;
        int i=0;
        int j=0;
        while(i<l||!pq.isEmpty()){
            while(i<l && time>=curr[i].start){
                pq.add(curr[i]);
                i++;
            }
            if(!pq.isEmpty()){
                Pair top=pq.remove();
                time+=top.dur;
                out[j++]=top.index;
            }
        }



        return out;
    }
    public static void main(String[] args) {
        int [][] s1 = {{5,2},{7,2},{9,4},{6,3},{5,10},{1,1}};
        int [] s2 = {5,8,6,9};
        int[] queries = {5,4,9};
        int[] out =getOrder(s1);
        System.out.println();

    }
}
