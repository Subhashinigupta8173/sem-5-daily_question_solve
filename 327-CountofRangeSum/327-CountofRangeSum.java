// Last updated: 7/7/2026, 1:47:27 pm
1class Solution {
2    public int countRangeSum(int[] nums, int lower, int upper) {
3        return divideAndConquer(nums,0,nums.length-1,lower,upper);
4    }
5    public int divideAndConquer(int[] nums,int l,int r,int lower,int upper){
6        if(l == r) {
7            return nums[l] >= lower && nums[r] <= upper ? 1 : 0;
8        }
9        int mid = l + (r - l)/ 2;
10        long[] prefixSum = new long[r - mid]; // l - mid - r // left-> l,mid ; right -> mid+1,r
11        prefixSum[0] = nums[mid + 1];
12        for(int i = mid + 2; i <= r; i++){
13            prefixSum[i - mid - 1] = prefixSum[i - mid - 2] + nums[i];
14        }
15
16        Arrays.sort(prefixSum);
17
18        long count = 0;
19        long sum = 0;
20        for(int le = mid; le >= l; le--){
21            sum += nums[le];
22            // binary search
23            long bLeftIndex = findIndex(prefixSum,lower-sum - 0.5), bRightIndex = findIndex(prefixSum,upper-sum + 0.5);
24            count += bRightIndex - bLeftIndex;
25        }
26
27        // left[] & right[]
28        // prefixRight[]
29        /*
30        * 0. Create binary search
31        * 1. Prefix sum of right array - Done
32        * 2. sort the prefix array - Done
33        * 3. for loop to find suffix sum from left array - Done
34        * 4. Inside for loop we will find bLeftIndex and bRightIndex from prefixSum, such that lower - sum <= x <= upper - sum - Done
35        * 5. update the count - Done
36        * 6. T(0,n) = T(0,mid) + T(mid+1,n-1) + C
37        *
38        * */
39        int leftSubProblem = divideAndConquer(nums,l,mid,lower,upper);
40        int rightSubProblem = divideAndConquer(nums,mid+1,r,lower,upper);
41        return leftSubProblem + rightSubProblem + (int)count;
42    }
43    // -> x ; i -> i+1
44    private static int findIndex(long[] arr, double val) {
45        int l = 0, r = arr.length - 1, m = 0;
46
47        while (l <= r) {
48            m = l + (r - l) / 2;
49
50            if (arr[m] < val) {
51                l = m + 1;
52            } else {
53                r = m - 1;
54            }
55        }
56
57        return l;
58    }
59}