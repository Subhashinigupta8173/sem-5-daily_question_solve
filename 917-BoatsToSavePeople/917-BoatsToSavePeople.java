// Last updated: 5/8/2025, 10:24:00 pm
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                left++;
            }
            right--;
            boats++;
        }

        return boats;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int n = scanner.nextInt();

        int[] people = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            people[i] = scanner.nextInt();
        }
        int limit = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.numRescueBoats(people, limit);

        System.out.println( result);
    }
}
