// Last updated: 16/8/2026, 10:55:09 am
1import java.util.*;
2
3class Solution {
4    public List<String> restoreIpAddresses(String s) {
5        List<String> result = new ArrayList<>();
6        backtrack(s, 0, new ArrayList<>(), result);
7        return result;
8    }
9
10    private void backtrack(String s, int start, List<String> path, List<String> result) {
11        
12        if (path.size() == 4) {
13            
14            if (start == s.length()) {
15                result.add(String.join(".", path));
16            }
17            return;
18        }
19
20        
21        for (int len = 1; len <= 3; len++) {
22            if (start + len > s.length()) break; 
23            String segment = s.substring(start, start + len);
24
25            
26            if (segment.startsWith("0") && segment.length() > 1) continue;
27
28            int value = Integer.parseInt(segment);
29            if (value > 255) continue;
30
31           
32            path.add(segment);
33
34            
35            backtrack(s, start + len, path, result);
36
37          
38            path.remove(path.size() - 1);
39        }
40    }
41}