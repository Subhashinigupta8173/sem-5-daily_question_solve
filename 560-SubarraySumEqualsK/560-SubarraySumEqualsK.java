// Last updated: 1/12/2025, 5:45:14 pm
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3        Map<Integer,Integer> map=new HashMap<>();
4        map.put(0,1);
5        int sum=0,c=0;
6        for(int num:nums){
7            sum+=num;
8            if(map.containsKey(sum-k)){
9                c+=map.get(sum-k);
10            }
11            map.put(sum,map.getOrDefault(sum,0)+1);
12        }
13        return c;
14        
15        
16    }
17}