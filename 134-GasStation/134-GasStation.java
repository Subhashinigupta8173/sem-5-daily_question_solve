// Last updated: 3/12/2025, 9:09:23 pm
1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        int n=gas.length;
4        int idx=0;
5        int sum=0;
6        int total=0;
7        for(int i=0; i<n; i++ ){
8            int diff=gas[i]-cost[i];
9            total+=diff;
10            sum+=diff;
11            if(sum<0){
12                idx=i+1;
13                sum=0;
14            }
15        }
16        return total >=0 ? idx:-1;
17    }
18}