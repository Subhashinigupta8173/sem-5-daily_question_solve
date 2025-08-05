// Last updated: 5/8/2025, 10:25:56 pm
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
        
                if (stack.isEmpty() || !isMatch(stack.pop(), c)) {
                    return false;
                }
            }
        }
      
        return stack.isEmpty();
    }
    
  
    public static boolean isMatch(char open, char close) {
        return (open == '(' && close == ')') ||(open == '{' && close == '}') ||
               (open == '[' && close == ']');
    }
}
