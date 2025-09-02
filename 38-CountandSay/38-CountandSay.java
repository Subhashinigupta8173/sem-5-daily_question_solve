// Last updated: 2/9/2025, 10:54:47 pm
class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        int i = s.length() - 1;

       
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

       
        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }

        return length;
    }
}
