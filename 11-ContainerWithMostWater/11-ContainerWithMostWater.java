// Last updated: 5/8/2025, 10:26:06 pm
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int area = width * h;
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println();
            return;
        }

        int[] height = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int result = solution.maxArea(height);

        System.out.println( result);
    }
}
