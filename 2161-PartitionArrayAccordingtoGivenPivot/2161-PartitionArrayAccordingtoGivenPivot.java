// Last updated: 25/11/2025, 10:15:01 pm
class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n=nums.length;
        int a=0;
        int b=n-1;
        int [] arr=new int[n];
        for(int i=0 ,j=nums.length-1; i<n; i++,j--){
            if(nums[i]<pivot){
                arr[a]=nums[i];
                a++;
            }
            if(nums[j]>pivot){
                arr[b]=nums[j];
                b--;

            }
        } 
        while(a<=b){
            arr[a]=pivot;
            a++;
        }   
        return arr;   
    }
}