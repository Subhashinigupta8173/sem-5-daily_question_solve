// Last updated: 2/10/2026, 12:17:22 pm
1class Solution {
2    public List<String> generateParenthesis(int n) {
3        List<String> ll=new ArrayList<>();
4		Parentheses(n,0,0,"",ll); 
5        return ll;
6       
7		
8	}
9    public static void Parentheses(int n, int o, int c, String ans, List<String> ll){
10        if(o == n && c == n){
11            ll.add(ans);
12            return ;
13        }
14        if(o > n || c > o){
15            return ;
16        }
17        Parentheses(n, o + 1, c, ans +"(", ll);
18        Parentheses(n, o, c + 1, ans +")", ll);
19
20    }
21
22
23}