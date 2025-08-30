// Last updated: 30/8/2025, 8:24:16 pm
class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
    int n=prices.length;
        long op=0;
        for(int i=0; i<n; i++){
            op+=(long) strategy[i]*prices[i];
        }
        long [] porgin=new long[n+1];
        long [] preprice=new long[n+1];
        for(int i=0; i<n; i++){
            porgin[i+1]=porgin[i]+(long) strategy[i]*prices[i];
            preprice[i+1]=preprice[i]+prices[i];
        }
        long goodgain=0;
        for(int  a=0; a+k<=n; a++){
            int r=a+k-1;
            long os=porgin[r+1]-porgin[a];
            int mid=a+k/2;
            long news=preprice[r+1]-preprice[mid];
            long gain=news-os;
            if(gain > goodgain){
                goodgain=gain;
            }
        }
        return op+goodgain;
        
    }
}