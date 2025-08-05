// Last updated: 5/8/2025, 10:23:55 pm
class Solution {
    public int threeSumMulti(int[] arr, int target) {
        long MOD = 1_000_000_007;
        long count = 0;

        Map<Integer, Long> map = new HashMap<>();
        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0L) + 1);
        }

        for (int i : map.keySet()) {
            for (int j : map.keySet()) {
                int k = target - i - j;
                if (map.containsKey(k)) {
                    long cnt1 = map.get(i);
                    long cnt2 = map.get(j);
                    long cnt3 = map.get(k);

                    if (i == j && j == k) {
                        count += cnt1 * (cnt1 - 1) * (cnt1 - 2) / 6;
                    } else if (i == j && j != k) {
                        count += cnt1 * (cnt1 - 1) / 2 * cnt3;
                    } else if (i < j && j < k) {
                        count += cnt1 * cnt2 * cnt3;
                    }
                }
                count %= MOD;
            }
        }

        return (int) count;
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

        
        int target = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.threeSumMulti(arr, target);

        System.out.println( result);
    }
}
