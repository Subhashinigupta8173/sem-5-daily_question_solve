// Last updated: 13/9/2026, 11:10:21 pm
1class Solution {
2    public int largestRectangleArea(int[] arr) {
3        return Largest_Area(arr); 
4    }
5
6    public static int Largest_Area(int[] arr) {
7        int ans = 0; 
8        Stack<Integer> st = new Stack<>();
9        for (int i = 0; i < arr.length; i++) { 
10            while (!st.isEmpty() && arr[i] < arr[st.peek()]) { 
11                int h = arr[st.pop()];
12                int r = i;
13                if (st.isEmpty()) {
14                    ans = Math.max(h * r, ans);
15                } else {
16                    int l = st.peek();
17                    int area = h * (r - l - 1);
18                    ans = Math.max(area, ans);
19                }
20            }
21            st.push(i);
22        }
23        int r = arr.length;
24        while (!st.isEmpty()) {
25            int h = arr[st.pop()];
26            if (st.isEmpty()) {
27                ans = Math.max(h * r, ans);
28            } else {
29                int l = st.peek();
30                int area = h * (r - l - 1);
31                ans = Math.max(area, ans);
32            }
33        }
34        return ans;
35    }
36}
37