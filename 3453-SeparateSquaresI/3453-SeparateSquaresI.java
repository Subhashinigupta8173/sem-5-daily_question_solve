// Last updated: 13/1/2026, 11:08:56 pm
1class Solution {
2    public double separateSquares(int[][] squares) {
3        // 1️ Calculate total area of all squares
4        // Also find minY and maxY for binary search range
5        double totalArea = 0;
6        double minY = Double.MAX_VALUE;
7        double maxY = 0;
8
9        for (int[] s : squares) {
10            double y = s[1];   // bottom y of square
11            double l = s[2];   // side length
12
13            totalArea += l * l;        // area of square
14            minY = Math.min(minY, y);  // lowest possible line
15            maxY = Math.max(maxY, y + l); // highest possible line
16        }
17
18        // We want area below the line = half of total area
19        double target = totalArea / 2.0;
20
21        // 2️ Binary search range
22        double low = minY;
23        double high = maxY;
24
25        // 3️ Binary search to find correct Y
26        for (int i = 0; i < 60; i++) { // 60 iterations = high precision
27            double mid = (low + high) / 2;
28
29            // Calculate area below height = mid
30            double area = areaBelow(squares, mid);
31
32            if (area < target) {
33                // Line is too low → not enough area below
34                low = mid;
35            } else {
36                // Line is too high → too much area below
37                high = mid;
38            }
39        }
40
41        // Lowest Y where areas are equal
42        return low;
43    }
44
45    // 4️ Helper function: calculate area below Y
46    private double areaBelow(int[][] squares, double Y) {
47        double area = 0;
48
49        for (int[] s : squares) {
50            double y = s[1];
51            double l = s[2];
52
53            // Case 1: line is below the square
54            if (Y <= y) {
55                continue;
56            }
57            // Case 2: line is above the square
58            else if (Y >= y + l) {
59                area += l * l;
60            }
61            // Case 3: line cuts the square
62            else {
63                area += l * (Y - y);
64            }
65        }
66
67        return area;
68    }
69}
70//binary searc nice problem
71
72    