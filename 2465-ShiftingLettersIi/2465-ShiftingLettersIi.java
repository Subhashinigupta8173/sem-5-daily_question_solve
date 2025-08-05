// Last updated: 5/8/2025, 10:23:36 pm
class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] shiftAmounts = new int[n + 1];

        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2] == 1 ? 1 : -1;

            shiftAmounts[start] += direction;
            if (end + 1 < n) {
                shiftAmounts[end + 1] -= direction;
            }
        }

        for (int i = 1; i < n; i++) {
            shiftAmounts[i] += shiftAmounts[i - 1];
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < n; i++) {
            int shift = shiftAmounts[i] % 26;
            chars[i] = (char) ((chars[i] - 'a' + shift + 26) % 26 + 'a');
        }

        return new String(chars);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        
        String s = scanner.next();

        
        int n = scanner.nextInt();

        int[][] shifts = new int[n][3];

        System.out.println();
        for (int i = 0; i < n; i++) {
            shifts[i][0] = scanner.nextInt();
            shifts[i][1] = scanner.nextInt();
            shifts[i][2] = scanner.nextInt();
        }

        Solution solution = new Solution();
        String result = solution.shiftingLetters(s, shifts);

        System.out.println(result);
    }
}
