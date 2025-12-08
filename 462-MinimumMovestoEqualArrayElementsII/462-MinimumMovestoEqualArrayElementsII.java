// Last updated: 8/12/2025, 10:29:54 pm
1class Solution {
2    public int minMoves2(int[] arr) {
3        Arrays.sort(arr);
4        int n = arr.length;
5        int median = arr[n / 2];
6        int moves = 0;
7
8        for (int x : arr) {
9            moves += Math.abs(x - median);
10        }
11        return moves;
12    }
13}
14