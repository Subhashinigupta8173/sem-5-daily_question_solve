// Last updated: 21/9/2026, 9:40:02 pm
1class Solution {
2    public int maxEnvelopes(int[][] envelopes) {
3        Arrays.sort(envelopes, (a, b) -> {
4            if(a[0] == b[0]) {
5                return b[1] - a[1];
6            }
7            return a[0] - b[0];
8        });
9        int n  = envelopes.length;
10        int [] lis = new int[n];
11        int size = 0;
12        for(int i= 0; i < n;i++){
13            int height = envelopes[i][1];
14            int left = 0; 
15            int right = size;
16            while(left < right){
17                int mid = left + (right - left) / 2;
18                if(lis[mid] < height){
19                    left = mid + 1;
20                }
21                else{
22                    right = mid ;
23
24                }
25            }
26            lis[left]  = height;
27            if(left  == size){
28                size++;
29            }
30        }
31        return size;
32       
33    }
34}