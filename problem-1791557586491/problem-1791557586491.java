// Last updated: 9/10/2026, 8:23:06 pm
1class Solution {
2    public int findLucky(int[] arr) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4
5        for (int i = 0; i < arr.length; i++) {
6            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
7        }
8
9       int max = -1;
10
11
12        for (int key : map.keySet()) {
13            int ans = map.get(key);
14            if(key == ans){
15                max = key;
16            }
17
18          
19        }
20        if(max != -1){
21        return max;
22        }
23        else{
24            return -1;
25        }
26
27        
28    }
29}
30
31