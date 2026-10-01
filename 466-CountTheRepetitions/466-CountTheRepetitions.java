// Last updated: 1/10/2026, 4:45:38 pm
1class Solution {  
2    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {  
3
4        
5        int n = s1.length();  
6        int m = s2.length();  
7
8        int c = 0;  
9        int j = 0;  
10
11        int[] seenK = new int[m];
12        int[] seenC = new int[m];
13
14        Arrays.fill(seenK, -1);
15
16        int k = 0;
17
18        while(k < n1) {
19
20           
21            for(int i = 0; i < n; i++) {
22
23                if(s1.charAt(i) == s2.charAt(j)) {
24                    j++;
25                }
26
27                if(j == m) {
28                    c++;
29                    j = 0;
30                }
31            }
32
33            k++;
34
35           
36            if(seenK[j] != -1) {
37
38                int oldK = seenK[j];
39                int oldC = seenC[j];
40
41                int cycleK = k - oldK;
42                int cycleC = c - oldC;
43
44                int remaining = n1 - k;
45
46                int times = remaining / cycleK;
47
48                k += times * cycleK;
49                c += times * cycleC;
50
51            } 
52            else {
53               
54                seenK[j] = k;
55                seenC[j] = c;
56            }
57        }
58
59        return c / n2;
60    }  
61}