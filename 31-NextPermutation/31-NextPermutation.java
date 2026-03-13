// Last updated: 13/3/2026, 6:54:14 pm
1class Solution {
2    public List<List<Integer>> permuteUnique(int[] nums) {
3        List<List<Integer>> result=new ArrayList<>();
4        Arrays.sort(nums);
5        boolean[] used = new boolean[nums.length];
6        backtrack( nums,new ArrayList<>(),used,result);
7        return result;
8
9        
10    }
11    private void backtrack(int[] nums,List<Integer> current,boolean [] used,List<List<Integer>>result){
12        if(current.size()==nums.length){
13            result.add(new ArrayList<>(current));
14        }
15        for(int i=0; i<nums.length; i++){
16             if(used[i])
17                continue;
18
19            if(i > 0 && nums[i] == nums[i-1] && !used[i-1])
20                continue;
21
22            used[i] = true;
23            
24            current.add(nums[i]);
25            backtrack(nums,current,used,result);
26            current.remove(current.size()-1);
27            used[i]=false;
28        }
29        
30    }
31}