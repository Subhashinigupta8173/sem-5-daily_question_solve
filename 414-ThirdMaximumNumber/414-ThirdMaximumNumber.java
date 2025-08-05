// Last updated: 5/8/2025, 10:24:34 pm
import java.util.Scanner;
import java.util.TreeSet;

class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> maxSet = new TreeSet<>();
        for (int num : nums) {
            maxSet.add(num);
            if (maxSet.size() > 3) {
                maxSet.pollFirst(); 
            }
        }

        if (maxSet.size() < 3) {
            return maxSet.last(); 
        } else {
            return maxSet.first(); 
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println();
            return;
        }

        int[] nums = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int result = solution.thirdMax(nums);

        System.out.println(result);
    }
}
