// Last updated: 1/7/2026, 9:38:41 pm
1class Solution {
2    public int findContentChildren(int[] arr, int[] s) {
3        int n=arr.length;
4        int m=s.length;
5        int c=0;
6        int i=0;
7        int j=0;
8        Arrays.sort(s);
9        Arrays.sort(arr);
10        while(i<n && j<m){
11           
12                if(s[j]>=arr[i] ){
13                    c++;
14                    i++;
15                    j++;
16                
17            }
18            else{
19                j++;
20            }
21        }
22        return c;
23    }
24}