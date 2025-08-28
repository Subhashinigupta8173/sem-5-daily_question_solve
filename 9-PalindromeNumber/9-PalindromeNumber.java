// Last updated: 28/8/2025, 7:40:17 am
class Solution {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;

          
        
    }
}