// Last updated: 23/9/2025, 5:58:17 am
class Solution {
    public String simplifyPath(String path) {
    
        String[] parts = path.split("/");
        Deque<String> stack = new ArrayDeque<>();
        
        for (String part : parts) {
            if (part.equals("") || part.equals(".")) {
                
                continue;
            } else if (part.equals("..")) {
                
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else {
                
                stack.push(part);
            }
        }
        
        
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.insert(0, "/" + dir);
        }
        
        
        return result.length() == 0 ? "/" : result.toString();
    }
}
