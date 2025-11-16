// Last updated: 16/11/2025, 8:13:22 am
class Solution {
    public int minLengthAfterRemovals(String s) {
        int ca=0;
        int cb=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                ca++;
            }
            else{
                cb++;
            }
        }
        return Math.abs(ca-cb);
    }
}