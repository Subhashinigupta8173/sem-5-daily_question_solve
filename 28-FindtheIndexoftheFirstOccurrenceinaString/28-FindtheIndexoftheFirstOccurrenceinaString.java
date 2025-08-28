// Last updated: 29/8/2025, 2:27:22 am
class Solution {
    public int strStr(String haystack, String needle) {
        int n=haystack.length();
        int m=needle.length();
        
        if(m>n){
            return -1;
        }
        for(int i=0; i<=n-m; i++){
            if(haystack.substring(i,i+m).equals(needle)){
                return  i;
            }
        }
        return -1;
        

        
    }
    
}