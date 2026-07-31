// Last updated: 31/7/2026, 7:27:27 am
1class Solution {
2    public int leastInterval(char[] tasks, int n) {
3        int [] freq = new int[26];
4        for(char ch:tasks){
5            freq[ch-'A']++;
6        }
7        int maxfreq = 0;
8        for(int f:freq){
9            maxfreq = Math.max(maxfreq, f);
10        }
11        int maxcount = 0;
12        for(int f :freq){
13            if(f == maxfreq){
14                maxcount++;
15            }
16        }
17        int ans = (maxfreq-1)*(n+1)+maxcount;
18        return  Math.max(ans, tasks.length);
19
20    }
21}