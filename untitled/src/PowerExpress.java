import java.util.ArrayList;
import java.util.List;

public class PowerExpress {
    public static void main(String[] args) {
        int n=29;
        int k=1;
        List<List<Integer>> way=new ArrayList();
        way = combinationSum3(n, k);
        for (List<Integer> integers : way) {
            for(int num:integers){
                System.out.print(num +" ");
            }
            System.out.println();
        }
    }
    public static List<List<Integer>> combinationSum3(int n, int k) {
        List<List<Integer>> outPut=new ArrayList();
        int diff=n;
        combinationPair(n,k,outPut,new ArrayList(),1,diff);
        return outPut;
    }
    private static void combinationPair(int n, int k ,List<List<Integer>> outPut,List<Integer> combo, int index,int diff){
            if(diff==0){
                outPut.add(new ArrayList(combo));
                return;
            }
        for(int i=index;i<=n; i++){
            int cc=power(i,k);
            if(cc<=n) {
                combo.add(i);
                combinationPair(n ,k, outPut, combo, i + 1,diff-cc);
                combo.remove(combo.size() - 1);
            }

        }

    }
    public static int power(int base,int exponent){
        int result = 1;
        while (exponent != 0) {
            result *= base;
            --exponent;
        }
        return result;
    }
}
