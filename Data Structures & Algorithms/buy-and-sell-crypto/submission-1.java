class Solution {
    public int maxProfit(int[] prices) {
        int mw =0;
        int mi=prices[0];
        for(int i = 1 ;i<prices.length;i++){
                if(mi>prices[i]){
                    mi=prices[i];
                }
                else{
                    int nc = prices[i] - mi;
                    if(nc > mw){
                        mw = nc;
                    }
                }
        }
        return mw;
    }
}
