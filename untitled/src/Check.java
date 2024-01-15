import java.util.ArrayList;
import java.util.List;

public class Check {
    public static void main(String[] args) {
        int[] prices={1,2,4,2,5,7,2,4,9,0};
        int mProfit = maxProfit(prices);
        System.out.println(mProfit);
    }
    public static int maxProfit(int[] prices) {
        int l=prices.length;
        int bPrice= Integer.MAX_VALUE;
        int mProfit=0;
        boolean buy=false;
        int mProfit1=0;
        int mProfit2=0;
        for(int i=0; i<l-1;i++ ){
            if(!buy && prices[i]<prices[i+1]){
                bPrice=prices[i];
                buy=true;
                continue;
            }
            if(buy && prices[i]>prices[i+1] && bPrice<prices[i]){
                int sPrice=prices[i];
                buy=false;
                int profit=sPrice-bPrice;
                if(profit>mProfit1){
                    mProfit2=mProfit1;
                    mProfit1=profit;
                }
                else if(profit<mProfit1 && profit>mProfit2){
                    mProfit2=profit;
                }
            }
        }
        if(buy){
            int sPrice=prices[l-1];
            int profit=sPrice-bPrice;
            mProfit=mProfit+profit;
            if(profit>=mProfit1) {
                mProfit2 = mProfit1;
                mProfit1 = profit;
            }
            else if(profit<mProfit1 && profit>mProfit2){
                mProfit2=profit;
            }
        }
        return mProfit1+mProfit2;
    }
}
