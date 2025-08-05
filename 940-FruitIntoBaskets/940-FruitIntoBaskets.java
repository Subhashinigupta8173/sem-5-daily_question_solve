// Last updated: 5/8/2025, 10:23:58 pm
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> basket = new HashMap<>();
        int left = 0;
        int maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {
            basket.put(fruits[right], basket.getOrDefault(fruits[right], 0) + 1);

            while (basket.size() > 2) {
                basket.put(fruits[left], basket.get(fruits[left]) - 1);
                if (basket.get(fruits[left]) == 0) {
                    basket.remove(fruits[left]);
                }
                left++;
            }

            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        int n = scanner.nextInt();

        int[] fruits = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            fruits[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int result = solution.totalFruit(fruits);

        System.out.println(result);
    }
}
