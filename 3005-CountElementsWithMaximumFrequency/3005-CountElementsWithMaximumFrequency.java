// Last updated: 22/9/2025, 6:40:12 am
class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        for(int num:nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        int maxfreq=0;
        for(int count:freq.values()){
           
            maxfreq=Math.max(maxfreq,count);
        }
        int result=0;
        for(int count:freq.values()){
            if(count==maxfreq){

            result+=count;

            }
        }
        return result;
        
    }

}