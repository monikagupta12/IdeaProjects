import java.util.*;

public class check {
  /*  public static String reverseWords(String s) {
        int l=s.length();
        int lidx=-1;
        int sidx=-1;
        if(l==0||lidx==l){
            return"";
        }
        for(int i=0; i<l; i++){
            if(s.charAt(i)!=' '){
                sidx=i;
                break;
            }
        }
        for(int i=sidx; i<l; i++){
            if(s.charAt(i)==' '){
                lidx=i;
                break;
            }
            else{
                lidx=l;
            }
        }

        if(sidx<0){
            return "";
        }
        System.out.println(sidx);
        System.out.println(lidx);

        String sub=s.substring(sidx, lidx);
        System.out.println(sub);
        String callstring=s.substring(lidx);
        System.out.println(callstring);



        return reverseWords(callstring) + sub;


    }
    public static void main(String[]args){
        String s="the sky is pink";
        String rs=reverseWords(s);
        System.out.println(rs);
    }

   */
/*  public static String reverseWords(String s) {
      int l=s.length();
      int lidx=-1;
      int sidx=-1;
      if(l<=0||lidx==l){
          return"";
      }
      for(int i=0; i<l; i++){
          if(s.charAt(i)!=' '){
              sidx=i;
              break;
          }
      }
      for(int i=sidx; i<l; i++){
          if(s.charAt(i)==' '){
              lidx=i;
              break;
          }
          else{
              lidx=l;
          }
      }

      if(sidx<0){
          return "";
      }
      System.out.println(sidx);
      System.out.println(lidx);

      String sub=s.substring(sidx, lidx);
     System.out.println(sub);
      String callstring=s.substring(lidx);
     // System.out.println(callstring);

      String re= reverseWords(callstring)+" " + sub;
      return re;


  }
    public static void main(String[]args){
        String s=" l   ";
        System.out.println(s);
        String rs=reverseWords(s);
        System.out.println(rs);
    }

 */
      public int uniquePathsWithObstacles(int[][] obstacleGrid) {
          int m = obstacleGrid.length;
          int n = obstacleGrid[0].length;
          int[][] dp = new int[m + 1][n + 1];
          for (int i = 1; i <= m; i++) {
              for (int j = 1; j <= n; j++) {
                  if (i == 1 || j == 1) {
                      dp[i][j] = 1;
                  } else if (obstacleGrid[i - 1][j - 1] == 1) {
                      dp[i][j] = 0;
                  } else {
                      dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                  }
              }
          }
          return dp[m][n];
      }
      public static void main(String[] args) {
          check c1=new check();
          int[][] nums={{0,1},{0,0}};
          List<String> list=Arrays.asList("aaaa","aa","a");
          c1.uniquePathsWithObstacles(nums);

      }
}

