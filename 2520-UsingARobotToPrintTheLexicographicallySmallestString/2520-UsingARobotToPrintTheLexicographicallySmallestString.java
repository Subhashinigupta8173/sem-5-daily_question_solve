// Last updated: 5/8/2025, 10:23:35 pm
import java.util.*;

public class Solution {
    public String robotWithString(String s) {
        int n = s.length();
        char[] minChar = new char[n];
        
        // Step 1: Build the suffix min array
        minChar[n - 1] = s.charAt(n - 1);
        for (int i = n - 2; i >= 0; i--) {
            minChar[i] = (char) Math.min(s.charAt(i), minChar[i + 1]);
        }

        Stack<Character> t = new Stack<>(); // Robot's holding string
        StringBuilder result = new StringBuilder();

        int i = 0;
        for (int j = 0; j < n; j++) {
            char ch = s.charAt(j);
            t.push(ch);

            // Pop from t to result while top of t <= remaining min in s
            while (!t.isEmpty() && (j == n - 1 || t.peek() <= minChar[j + 1])) {
                result.append(t.pop());
            }
        }

        // Pop remaining characters from t
        while (!t.isEmpty()) {
            result.append(t.pop());
        }

        return result.toString();
    }
}
