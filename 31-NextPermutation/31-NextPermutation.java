// Last updated: 13/3/2026, 6:48:48 pm
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> result=new ArrayList<>();
4        backtrack( nums,new ArrayList<>(),result);
5        return result;
6
7        
8    }
9    private void backtrack(int[] nums,List<Integer> current,List<List<Integer>>result){
10        if(current.size()==nums.length){
11            result.add(new ArrayList<>(current));
12        }
13        for(int i=0; i<nums.length; i++){
14            if(current.contains(nums[i])){
15            continue;
16            }
17            current.add(nums[i]);
18            backtrack(nums,current,result);
19            current.remove(current.size()-1);
20        }
21    }
22}