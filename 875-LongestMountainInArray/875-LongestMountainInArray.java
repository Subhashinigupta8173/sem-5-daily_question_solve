// Last updated: 5/8/2025, 10:24:07 pm
class Solution {
    public int longestMountain(int[] arr) {
        int maxLength = 0;
        int n = arr.length;

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                int left = i - 1;
                while (left > 0 && arr[left] > arr[left - 1]) {
                    left--;
                }

                int right = i + 1;
                while (right < n - 1 && arr[right] > arr[right + 1]) {
                    right++;
                }

                int currentLength = right - left + 1;
                maxLength = Math.max(maxLength, currentLength);
                i = right;
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int result = solution.longestMountain(arr);

        System.out.println( result);
    }
}
