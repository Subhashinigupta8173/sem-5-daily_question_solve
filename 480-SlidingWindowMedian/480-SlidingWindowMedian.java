// Last updated: 17/11/2026, 10:37:40 pm
1import java.util.ArrayList;
2import java.util.Collections;
3import java.util.List;
4
5public class Solution {
6    public double[] medianSlidingWindow(int[] nums, int k) {
7        List<Double> resList = new ArrayList<>();
8        int n = nums.length;
9        int i = 0;
10        int j = k - 1;
11        List<Integer> temp = new ArrayList<>();
12        for (int x = 0; x < k - 1; x++) {
13            temp.add(nums[x]);
14        }
15        Collections.sort(temp);
16        while (j < n) {
17            int num = nums[j];
18            int insertIdx = Collections.binarySearch(temp, num);
19            if (insertIdx < 0) {
20                insertIdx = -insertIdx - 1;
21            }
22            temp.add(insertIdx, num);
23
24            if (k % 2 == 1) {
25                double median = (double) temp.get(k / 2);
26                resList.add(median);
27            } else {
28                int idx = k / 2;
29                double median1 = (double) temp.get(idx);
30                double median2 = (double) temp.get(idx - 1);
31                resList.add((median1 + median2) / 2);
32            }
33
34            int removeIdx = Collections.binarySearch(temp, nums[i]);
35            if (removeIdx < 0) {
36                removeIdx = -removeIdx - 1;
37            }
38            temp.remove(removeIdx);
39
40            i++;
41            j++;
42        }
43
44        double[] resArray = new double[resList.size()];
45        for (int x = 0; x < resList.size(); x++) {
46            resArray[x] = resList.get(x);
47        }
48
49        return resArray;
50    }
51}