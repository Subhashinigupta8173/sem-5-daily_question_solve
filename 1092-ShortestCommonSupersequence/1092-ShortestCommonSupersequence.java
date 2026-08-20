// Last updated: 20/8/2026, 12:41:34 am
1class Solution {
2    public String shortestCommonSupersequence(String str1, String str2) {
3        int n = str1.length();
4        int m = str2.length();
5        String [] [] dp = new String[n+1][m+1];
6        String ans  = lcs( 0 ,0 ,str1,str2,dp);
7         StringBuilder res = new StringBuilder();
8
9        int i = 0;
10        int j = 0;
11
12        for (int k = 0; k < ans.length(); k++) {
13
14            char ch = ans.charAt(k);
15
16            while (str1.charAt(i) != ch) {
17                res.append(str1.charAt(i));
18                i++;
19            }
20
21            while (str2.charAt(j) != ch) {
22                res.append(str2.charAt(j));
23                j++;
24            }
25
26            res.append(ch);
27
28            i++;
29            j++;
30        }
31
32        while (i < str1.length()) {
33            res.append(str1.charAt(i));
34            i++;
35        }
36
37        while (j < str2.length()) {
38            res.append(str2.charAt(j));
39            j++;
40             }
41
42        return res.toString();
43    }
44        
45    public static  String lcs(int i ,int j ,String str1, String str2,String[][] dp){
46        if (i == str1.length() || j == str2.length()) {
47            return "";
48        }
49
50        if (dp[i][j] != null) {
51            return dp[i][j];
52        }
53
54      
55        if (str1.charAt(i) == str2.charAt(j)) {
56
57            return dp[i][j] =
58                    str1.charAt(i) + lcs(i + 1, j + 1, str1, str2,dp);
59        }
60
61       
62        String take1 = lcs(i + 1, j, str1, str2,dp);
63        String take2 = lcs(i, j + 1, str1, str2,dp);
64
65        if (take1.length() >= take2.length()) {
66            return dp[i][j] = take1;
67        } else {
68             return dp[i][j] = take2;
69        }
70        
71        
72    }
73
74}