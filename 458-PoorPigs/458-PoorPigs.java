// Last updated: 2/10/2026, 11:25:36 am
1class Solution {
2    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
3        int rounds  = minutesToTest / minutesToDie;
4        int state = rounds + 1 ;
5        int pig  = 0;
6        int possibilities =1;
7        while(possibilities  < buckets){
8            possibilities *= state;
9            pig++;
10        }
11        return pig;
12    }
13}