// Last updated: 3/9/2025, 8:05:20 am
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--; 
            int remainder = columnNumber % 26;
            char c = (char) ('A' + remainder);
            sb.append(c);
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }
}
