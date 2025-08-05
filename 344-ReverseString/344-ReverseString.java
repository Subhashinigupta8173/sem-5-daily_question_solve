// Last updated: 5/8/2025, 10:24:41 pm
class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
           
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
           
            left++;
            right--;
        }
    }
}
