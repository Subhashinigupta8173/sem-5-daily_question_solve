// Last updated: 1/2/2026, 8:06:42 am
1class Solution {
2    public int countMonobit(int n) {
3    
4       int c=1;
5        for(int i=1; i<31; i++){
6            int m=(1<<i)-1;
7            if(m<=n){
8                c++;
9            }
10            else{
11                break;
12            }
13        }
14        return c;
15        
16        
17    }
18}