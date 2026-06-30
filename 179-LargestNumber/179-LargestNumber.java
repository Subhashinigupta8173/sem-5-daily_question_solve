// Last updated: 30/6/2026, 11:28:47 am
1class Solution {
2    public String largestNumber(int[] nums) {
3
4        String[] arr = new String[nums.length];
5
6        for (int i = 0; i < nums.length; i++) {
7            arr[i] = String.valueOf(nums[i]);
8        }
9
10        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
11
12        if (arr[0].equals("0")) {
13            return "0";
14        }
15
16        StringBuilder ans = new StringBuilder();
17
18        for (String s : arr) {
19            ans.append(s);
20        }
21
22        return ans.toString();
23    }
24}