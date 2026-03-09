// Last updated: 9/3/2026, 5:18:43 pm
1import java.util.*;
2
3class Solution {
4    public List<List<Integer>> threeSum(int[] nums) {
5
6        List<List<Integer>> result = new ArrayList<>();
7        Arrays.sort(nums);
8
9        for(int i = 0; i < nums.length - 2; i++){
10
11            if(i > 0 && nums[i] == nums[i-1])
12                continue;
13
14            int j = i + 1;
15            int k = nums.length - 1;
16
17            while(j < k){
18
19                int sum = nums[i] + nums[j] + nums[k];
20
21                if(sum == 0){
22
23                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
24
25                    j++;
26                    k--;
27
28                    while(j < k && nums[j] == nums[j-1]) j++;
29                    while(j < k && nums[k] == nums[k+1]) k--;
30                }
31
32                else if(sum < 0){
33                    j++;
34                }
35                else{
36                    k--;
37                }
38            }
39        }
40
41        return result;
42    }
43}