import java.util.*;

public class Add {
    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int root=(int)Math.sqrt(j);
                if (j!=root*root) {
                    continue;
                }
                dp[i] = Math.min(dp[i], dp[i - j] + 1);
            }
        }
        return dp[n];
    }
    public static void main(String[] args){
        char[][]arr={{'O','X','X','O','X'},{'X','O','O','X','O'},{'X','O','X','O','X'},{'O','X','O','O','O'},{'X','X','O','X','O'}};
        int[] nums={1,2,1,2,1};
        Add a=new Add();
        List<List<Integer>> piles=Arrays.asList(Arrays.asList(48,14,23,38,33,79,3,52,73,58,49,23,74,44,69,76,83,41,46,32,28));
        int ans=a.numSquares(12);
        System.out.println(ans);


    }
}
