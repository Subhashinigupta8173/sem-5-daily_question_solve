// Last updated: 1/7/2026, 5:24:07 am
1class Solution {
2    public int integerReplacement(int num) {
3        long n=num;
4        int c=0;
5
6       while(n!=1){
7            if(n%2==0){
8                n=n/2;
9                c++;
10            }
11            else{
12                if(n==3 || n%4==1){
13                    n--;
14                }
15                else{
16                    n++;
17                }
18                c++;
19            }
20        } 
21        return c;
22        
23    }
24}