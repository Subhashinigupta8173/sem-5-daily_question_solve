// Last updated: 30/8/2025, 8:24:18 pm
class Solution {
    public long perfectPairs(int[] nums) {
        int j=nums.length;
        long pairc=0;
        int [] absnums=new int [j];
        for(int i=0;i<j;i++){
            absnums[i]=Math.abs(nums[i]);
        }
        Arrays.sort(absnums);
        for(int i=0; i<j ; i++){
            int s=i+1;
            int e=findUpperBound(absnums,2*absnums[i]);
            pairc+=(e-s);
        }
        return pairc;
    }

        private int findUpperBound(int [] arr,int target){
            int low=0;
            int high=arr.length;
            while(low<high){
                int mid=(low+high )>> 1;
                if(arr[mid]<=target){
                    low=mid+1;
                }
                else{
                    high=mid;
                }
            }
            return low;
        
        
        
    }
}