// Last updated: 30/6/2026, 10:53:06 pm
1class Solution {
2    public String removeKdigits(String num, int k) {
3        StringBuilder sb=new StringBuilder();
4        Stack<Character> s=new Stack<>();
5
6        for(int i=0;i<num.length();i++){
7            char ch=num.charAt(i);
8           
9            while(!s.isEmpty() && k>0 && s.peek()>ch){
10                s.pop();
11                k--;
12            }
13            s.push(ch);
14            
15            
16        }
17        while(k > 0 && !s.isEmpty()){
18    s.pop();
19    k--;
20}
21
22for(char c : s){
23    sb.append(c);
24}
25
26while(sb.length() > 1 && sb.charAt(0) == '0'){
27    sb.deleteCharAt(0);
28}
29
30if(sb.length() == 0){
31    return "0";
32}
33
34return sb.toString();
35        
36    }
37}