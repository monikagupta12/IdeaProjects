import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static java.util.Collections.*;

public class CoinChange {
//    public static void main(String[] args) {
//        int[] coins={5,2,1};
//        int amount=11;
//        int total=coinChange(coins,amount);
//        System.out.println(total);
//    }
//    public static int coinChange(int[] coins, int amount) {
//        if (amount == 0) return 0;
//        int minCount=Integer.MAX_VALUE;
//        for (int num:coins) {
//            if (amount>num) {
//                int result = 1+coinChange(coins, amount-num);
//                minCount = Math.min(minCount, result);
//            }
//        }
//
//        return minCount;
//        //return amountCalculation(coins,amount,0,0,new ArrayList<>(), mincount);
//    }
//    private  static int amountCalculation(int[] coins, int amount, int count, int index,List<Integer>pair,int mincount) {
//        if (amount == 0) {
//            mincount = Math.min(mincount, count);
//            return 0;
//        }
//        for (int i = 0; i < coins.length; i++) {
//            int cc = coins[i];
//            if (cc <= amount) {
//                int a = 0 + amountCalculation(coins, amount - cc, count + 1,pair, mincount);
//            }
//        }
//
//        mincount = Math.min(mincount, count);
//
//        return mincount;
//    }

}
