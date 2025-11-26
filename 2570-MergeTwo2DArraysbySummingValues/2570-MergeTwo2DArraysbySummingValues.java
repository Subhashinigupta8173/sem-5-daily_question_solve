// Last updated: 26/11/2025, 9:05:58 pm
1class Solution {
2    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
3        List<int[]> ll=new ArrayList<>();
4        int i=0,j=0;
5        while(i<nums1.length && j<nums2.length){
6            if(nums1[i][0]<nums2[j][0]){
7                ll.add(nums1[i]);
8                i++;
9            }
10            else if(nums1[i][0]>nums2[j][0]){
11                ll.add(nums2[j]);
12                j++;
13            }
14            else{
15                ll.add(new int[]{nums1[i][0],nums1[i][1]+nums2[j][1]});
16                i++;
17                j++;
18            }
19
20        }
21        while(i<nums1.length){
22            ll.add(nums1[i]);
23            i++;
24        }
25        while(j<nums2.length){
26            ll.add(nums2[j]);
27            j++;
28        }
29
30        return ll.toArray(new int[ll.size()][]);
31
32
33
34        
35    }
36}