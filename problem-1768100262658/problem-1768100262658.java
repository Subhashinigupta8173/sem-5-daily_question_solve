// Last updated: 11/1/2026, 8:27:42 am
1class Solution {
2    public int residuePrefixes(String s) {
3        boolean [] seen=new boolean[26];
4        int ans=0;
5        int c=0;
6        for(int i=0;i<s.length(); i++){
7           int idx=s.charAt(i)-'a';
8            if(!seen[idx]){
9                seen[idx]=true;
10                ans++;
11            }
12            int len=i+1;
13            if(ans==len%3){
14                c++;
15            }
16        }
17        return c;
18        
19    }
20}