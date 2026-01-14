// Last updated: 14/1/2026, 2:00:14 pm
1class Solution {
2    private static final double EPSILON = 0.1; // 0.01 or 0.001 will also work
3    // Tolerance for floating-point comparison. To avoid floating point precission errors 
4
5    public boolean judgePoint24(int[] cards) {
6        List<Double> nums = new ArrayList<>();
7        for (int card : cards) {
8            nums.add((double) card);
9        }
10        return solve(nums);
11    }
12
13    private boolean solve(List<Double> cards) {
14        if (cards.size() == 1) {
15            return Math.abs(cards.get(0) - 24) <= EPSILON;
16        }
17
18        for (int i = 0; i < cards.size(); i++) {
19            for (int j = 0; j < cards.size(); j++) {
20                if (i == j) continue;
21
22                List<Double> temp = new ArrayList<>();
23                for (int k = 0; k < cards.size(); k++) {
24                    if (k != i && k != j) {
25                        temp.add(cards.get(k));
26                    }
27                }
28
29                double a = cards.get(i);
30                double b = cards.get(j);
31                List<Double> possibleVals = new ArrayList<>();
32                possibleVals.add(a + b);
33                possibleVals.add(a - b);
34                possibleVals.add(b - a); //b-a is not required, our i and j for loop will take care of it
35                possibleVals.add(a * b);
36
37                if (Math.abs(b) > 0.0) {
38                    possibleVals.add(a / b);
39                }
40                if (Math.abs(a) > 0.0) {
41                    possibleVals.add(b / a); //b/a is not required, our i and j for loop will take care of it
42                }
43
44                for (double val : possibleVals) {
45                    temp.add(val); // Do
46                    if (solve(temp)) return true; // Explore
47                    temp.remove(temp.size() - 1); // Undo
48                }
49            }
50        }
51
52        return false;
53    }
54}