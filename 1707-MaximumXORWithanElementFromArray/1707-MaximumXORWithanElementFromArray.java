// Last updated: 12/2/2026, 12:21:53 pm
1class Solution {
2    public int[] maximizeXor(int[] arr, int[][] queries) {
3        
4        int[][] q = new int[queries.length][3];
5
6        for(int i = 0; i < q.length; i++) {
7            q[i][0] = queries[i][0]; // xi
8            q[i][1] = queries[i][1]; // mi
9            q[i][2] = i;             // original index
10        }
11
12        // Sort queries by mi in ascending order
13        Arrays.sort(q, (a,b) -> a[1] - b[1]);
14
15        Arrays.sort(arr);
16
17        Trie t = new Trie();
18        int[] ans = new int[q.length];
19
20        int j = 0;
21
22        for(int[] a : q) {
23
24            while(j < arr.length && arr[j] <= a[1]) {
25                t.add(arr[j]);
26                j++;
27            }
28
29            if(j == 0) {
30                ans[a[2]] = -1;
31            } else {
32                ans[a[2]] = t.getMaxXor(a[0]);
33            }
34        }
35
36        return ans;   // ✅ correct return
37    }
38
39    static class Trie {
40
41        class Node {
42            Node zero;
43            Node one;
44        }
45
46        private Node root = new Node();
47
48        public void add(int val) {
49            Node curr = root;
50
51            for(int i = 31; i >= 0; i--) {
52                int bit = (val >> i) & 1;
53
54                if(bit == 0) {
55                    if(curr.zero == null)
56                        curr.zero = new Node();
57                    curr = curr.zero;
58                } else {
59                    if(curr.one == null)
60                        curr.one = new Node();
61                    curr = curr.one;
62                }
63            }
64        }
65
66        public int getMaxXor(int x) {
67            int ans = 0;
68            Node curr = root;
69
70            for(int i = 31; i >= 0; i--) {
71
72                int bit = (x >> i) & 1;
73
74                if(bit == 0) {
75                    if(curr.one != null) {
76                        ans |= (1 << i);
77                        curr = curr.one;
78                    } else {
79                        curr = curr.zero;
80                    }
81                } else {
82                    if(curr.zero != null) {
83                        ans |= (1 << i);
84                        curr = curr.zero;
85                    } else {
86                        curr = curr.one;
87                    }
88                }
89            }
90
91            return ans;
92        }
93    }
94}
95