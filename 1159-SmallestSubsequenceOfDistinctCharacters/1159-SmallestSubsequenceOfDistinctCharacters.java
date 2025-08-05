// Last updated: 5/8/2025, 10:23:50 pm
public class Solution {
    public String smallestSubsequence(String s) {
        int[] lastIndex = new int[26]; 
        boolean[] inStack = new boolean[26]; 
        
        
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }
        
        Deque<Character> stack = new ArrayDeque<>(); 
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (inStack[c - 'a']) continue; 
            
            
            while (!stack.isEmpty() && stack.peek() > c && lastIndex[stack.peek() - 'a'] > i) {
                inStack[stack.pop() - 'a'] = false;
            }
            
            stack.push(c); 
            inStack[c - 'a'] = true;
        }
        
       
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.removeLast());
        }
        
        return result.toString();
    }
}
