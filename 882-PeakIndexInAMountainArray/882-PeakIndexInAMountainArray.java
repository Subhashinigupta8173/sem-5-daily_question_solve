// Last updated: 5/8/2025, 10:24:06 pm
public class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1; 
            } else {
                right = mid; 
            }
        }
        
        return left; 
    }
}
