// Last updated: 28/9/2026, 11:43:37 am
1class Solution {
2    public String decodeString(String s) {
3        Stack<Integer> count = new Stack<>();
4        Stack<String>  Stringcount = new Stack<>();    
5        StringBuilder current= new StringBuilder();
6        int num =0 ;
7        for(char ch : s.toCharArray()){
8            if(Character.isDigit(ch)){
9                num = num * 10 + (ch - '0');
10
11            }
12            else if(ch == '['){
13                count.push(num);
14                Stringcount.push(current.toString());
15
16                num = 0;
17                current = new StringBuilder();
18            }
19            else if(ch == ']'){
20                int c  = count.pop();
21                String previous = Stringcount.pop();
22                StringBuilder temp = new StringBuilder(previous);
23                for(int i = 0; i< c; i++){
24                    temp.append(current);
25
26                }
27                current = temp;
28
29
30            }
31            else{
32                current.append(ch);
33            }
34        }
35        return current.toString();            
36    }
37}