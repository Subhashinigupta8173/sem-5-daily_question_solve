// Last updated: 5/8/2025, 10:23:42 pm
class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        
        int balls = 0;
        int operations = 0;
        for (int i = 0; i < n; i++) {
            answer[i] += operations;
            if (boxes.charAt(i) == '1') {
                balls++;
            }
            operations += balls;
        }

        
        balls = 0;
        operations = 0;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] += operations;
            if (boxes.charAt(i) == '1') {
                balls++;
            }
            operations += balls;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        
        String boxes = scanner.nextLine();

        Solution solution = new Solution();
        int[] result = solution.minOperations(boxes);

        
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
