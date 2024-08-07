import java.util.ArrayList;
import java.util.List;

public class PermutationNum {
    public static void main(String[] args) {
        int[] num={1,2,3,4};
        List<List<Integer>> res=permutationFunction(num);
        int size=res.size();
        System.out.println("Total Permutation="+size);
        for(List<Integer> perm:res){
            System.out.println(perm);
        }
    }

    private static List<List<Integer>> permutationFunction(int[] num) {
        List<List<Integer>> res=new ArrayList<>();
        dfs(0,num,new ArrayList<>(),res);
        return res;
    }
    private static void dfs( int visit,int[]num,List<Integer>curr, List<List<Integer>> res){
        int n=num.length;
        if(curr.size()==n){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int k=0; k<n;k++){
            if((visit>>k&1)==1){
                continue;
            }
            curr.add(num[k]);
            dfs(visit|(1<<k),num,curr,res);
            curr.remove(curr.size()-1);
        }
    }


}
