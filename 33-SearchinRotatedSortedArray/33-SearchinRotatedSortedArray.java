// Last updated: 17/7/2026, 10:17:27 am
1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while (left <= right) {
7            int mid = left + (right - left) / 2;
8
9            if (nums[mid] == target) {
10                return mid;
11            }
12
13            if (nums[left] <= nums[mid]) { 
14                if (nums[left] <= target && target < nums[mid]) {
15                    right = mid - 1;
16                } else {
17                    left = mid + 1;
18                }
19            } else { 
20                if (nums[mid] < target && target <= nums[right]) {
21                    left = mid + 1;
22                } else {
23                    right = mid - 1;
24                }
25            }
26        }
27
28        return -1; 
29    }
30
31    public static void main(String[] args) {
32        Scanner scanner = new Scanner(System.in);
33        System.out.println();
34
35        
36        int n = scanner.nextInt();
37
38        if (n <= 0) {
39            System.out.println();
40            return;
41        }
42
43        int[] nums = new int[n];
44
45        System.out.println();
46        for (int i = 0; i < n; i++) {
47            nums[i] = scanner.nextInt();
48        }
49
50       
51        int target = scanner.nextInt();
52
53        Solution solution = new Solution();
54        int result = solution.search(nums, target);
55
56        System.out.println( result);
57    }
58}