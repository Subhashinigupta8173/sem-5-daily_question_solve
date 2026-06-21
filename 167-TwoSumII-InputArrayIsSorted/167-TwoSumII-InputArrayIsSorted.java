// Last updated: 21/6/2026, 11:39:22 pm
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int n=numbers.length;
4
5        int i=0;
6        int j=n-1;
7        int sum=0;
8
9        while(i<j){
10            sum=numbers[i]+numbers[j];
11            if(sum==target){
12                return new int[]{i + 1, j + 1};
13            }
14             else if(sum>target){
15                j--;
16            }
17            else{
18                i++;
19            }
20        }
21
22        return new int[]{-1, -1};
23    }
24}
25