// Last updated: 24/6/2026, 11:22:31 pm
1class Solution {
2
3    class Pair {
4        int val;
5        int idx;
6
7        Pair(int val, int idx) {
8            this.val = val;
9            this.idx = idx;
10        }
11    }
12
13    int[] count;
14
15    public List<Integer> countSmaller(int[] nums) {
16
17        int n = nums.length;
18        count = new int[n];
19
20        Pair[] arr = new Pair[n];
21
22        for (int i = 0; i < n; i++) {
23            arr[i] = new Pair(nums[i], i);
24        }
25
26        mergeSort(arr, 0, n - 1);
27
28        List<Integer> ans = new ArrayList<>();
29
30        for (int x : count) {
31            ans.add(x);
32        }
33
34        return ans;
35    }
36
37    private void mergeSort(Pair[] arr, int left, int right) {
38
39        if (left >= right)
40            return;
41
42        int mid = left + (right - left) / 2;
43
44        mergeSort(arr, left, mid);
45        mergeSort(arr, mid + 1, right);
46
47        merge(arr, left, mid, right);
48    }
49
50    private void merge(Pair[] arr, int left, int mid, int right) {
51
52        Pair[] temp = new Pair[right - left + 1];
53
54        int i = left;
55        int j = mid + 1;
56        int k = 0;
57
58        int rightCount = 0;
59
60        while (i <= mid && j <= right) {
61
62            if (arr[i].val > arr[j].val) {
63
64                rightCount++;
65                temp[k++] = arr[j++];
66
67            } else {
68
69                count[arr[i].idx] += rightCount;
70                temp[k++] = arr[i++];
71            }
72        }
73
74        while (i <= mid) {
75            count[arr[i].idx] += rightCount;
76            temp[k++] = arr[i++];
77        }
78
79        while (j <= right) {
80            temp[k++] = arr[j++];
81        }
82
83        for (int p = 0; p < temp.length; p++) {
84            arr[left + p] = temp[p];
85        }
86    }
87}