// Last updated: 3/10/2026, 10:56:43 pm
1class Solution {
2
3    HashMap<String, Integer> memo = new HashMap<>();
4    int INF = 100;
5
6    public int findMinStep(String board, String hand) {
7
8        int[] count = new int[26];
9
10        for (char c : hand.toCharArray()) {
11            count[c - 'A']++;
12        }
13
14        int ans = dfs(board, count);
15
16        return ans == INF ? -1 : ans;
17    }
18
19    int dfs(String board, int[] hand) {
20
21        board = remove(board);
22
23        if (board.length() == 0) {
24            return 0;
25        }
26
27        String key = board + Arrays.toString(hand);
28
29        if (memo.containsKey(key)) {
30            return memo.get(key);
31        }
32
33        int ans = INF;
34
35        // Try every ball color
36        for (int k = 0; k < 26; k++) {
37
38            if (hand[k] == 0) {
39                continue;
40            }
41
42            char ch = (char) ('A' + k);
43
44            // Try every insertion position
45            for (int i = 0; i <= board.length(); i++) {
46
47                // Avoid useless insertions.
48                // We only insert:
49                // 1. next to the same color
50                // 2. between two same-colored balls
51                if (i < board.length() && board.charAt(i) == ch) {
52
53                    hand[k]--;
54
55                    String next =
56                        board.substring(0, i)
57                        + ch
58                        + board.substring(i);
59
60                    int result = dfs(next, hand);
61
62                    if (result != INF) {
63                        ans = Math.min(ans, 1 + result);
64                    }
65
66                    hand[k]++;
67                }
68
69                else if (i > 0 && i < board.length()
70                        && board.charAt(i - 1) == board.charAt(i)) {
71
72                    hand[k]--;
73
74                    String next =
75                        board.substring(0, i)
76                        + ch
77                        + board.substring(i);
78
79                    int result = dfs(next, hand);
80
81                    if (result != INF) {
82                        ans = Math.min(ans, 1 + result);
83                    }
84
85                    hand[k]++;
86                }
87            }
88        }
89
90        memo.put(key, ans);
91
92        return ans;
93    }
94
95    String remove(String board) {
96
97        boolean changed = true;
98
99        while (changed) {
100
101            changed = false;
102
103            for (int i = 0; i < board.length();) {
104
105                int j = i;
106
107                while (j < board.length()
108                        && board.charAt(j) == board.charAt(i)) {
109                    j++;
110                }
111
112                if (j - i >= 3) {
113
114                    board = board.substring(0, i)
115                           + board.substring(j);
116
117                    changed = true;
118                    break;
119                }
120
121                i = j;
122            }
123        }
124
125        return board;
126    }
127}