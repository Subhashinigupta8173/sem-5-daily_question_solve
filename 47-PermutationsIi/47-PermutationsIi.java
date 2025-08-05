// Last updated: 5/8/2025, 10:25:34 pm
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        boolean [] used=new boolean[nums.length];
        backtrack(nums,new ArrayList<>(),used,result);
        return result;

        
    }
    public static void backtrack(int[]nums,List<Integer> templist,boolean[] used,List<List<Integer>> result){
        if(templist.size()==nums.length){
            List<Integer> permutation=new ArrayList<>();
            for(int i=0; i<templist.size(); i++){
                permutation.add(templist.get(i));
            }
            result.add(permutation);
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(used[i]) continue;
            if(i>0 && nums[i]==nums[i-1] && !used[i-1]) continue;
            used[i]=true;
            templist.add(nums[i]);
            backtrack(nums,templist,used,result);
            used[i]=false;
            templist.remove(templist.size()-1);
        }
    }
}