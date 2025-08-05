// Last updated: 5/8/2025, 10:25:19 pm
class Solution {
    public boolean isPalindrome(String s) {
       
        StringBuilder filtered = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                filtered.append(Character.toLowerCase(c));
            }
        }

       
        String filteredString = filtered.toString();
        String reversedString = filtered.reverse().toString();
        return filteredString.equals(reversedString);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        
        String s = scanner.nextLine();

        Solution solution = new Solution();
        boolean result = solution.isPalindrome(s);

        System.out.println( result);
    }
}
