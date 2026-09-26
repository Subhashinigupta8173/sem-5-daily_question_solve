// Last updated: 26/9/2026, 1:57:40 pm
1class Solution {
2    HashMap<Integer, Integer> map = new HashMap<>();
3    Boolean[][] dp;
4    public boolean canCross(int[] stones) {
5        dp = new Boolean[stones.length][stones.length + 1];
6        for(int i = 0; i < stones.length; i++){
7            map.put(stones[i] , i);
8        }
9        return Frog(stones, 0, 0);
10
11        
12    }
13    public boolean Frog(int [] stones, int i,int jump){
14        if(i ==  stones.length - 1){
15            return true;
16        }
17        if(dp[i][jump] != null){
18            return dp[i][jump];
19        }
20        for(int nextjump = jump - 1; nextjump <= jump + 1; nextjump++){
21            if(nextjump <= 0){
22                continue;
23
24            }
25            int nextposition = stones[i] + nextjump;
26            if(map.containsKey(nextposition)){
27                int j = map.get(nextposition);
28                if(Frog(stones, j, nextjump)){
29                    return dp[i][jump] = true;
30                }
31            }
32        }
33        return dp[i][jump] = false;
34    }
35}