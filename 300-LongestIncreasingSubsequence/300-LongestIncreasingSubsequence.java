// Last updated: 22/6/2026, 11:42:04 pm
1class Solution {
2    public int lengthOfLIS(int[] nums) {
3    
4        ArrayList<Integer> list = new ArrayList<>();
5        for(int num: nums){
6            int idx = Collections.binarySearch(list, num);
7            if(idx<0){
8                idx=-(idx+1);
9            }
10            if(idx==list.size()){
11                list.add(num);
12            }
13            else{
14                list.set(idx,num);
15            }
16
17        }
18        return list.size();
19    }
20}