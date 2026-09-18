// Last updated: 18/9/2026, 5:02:58 pm
1class Solution {
2    public boolean check(int[] nums) {
3        int n = nums.length;
4        int [] arr = nums.clone();
5        Arrays.sort(arr);
6        int i = 0;
7        while(i < n){
8            boolean flag = true;
9            for(int j = 0; j < n; j++){
10                if(arr[j] != nums[(i + j)%n] ){
11                   flag = false;
12                   break;
13                }
14                
15            }
16            
17            if(flag){
18                return true;
19            }
20            i++;
21            
22
23        }
24        return false;    
25
26    }
27}