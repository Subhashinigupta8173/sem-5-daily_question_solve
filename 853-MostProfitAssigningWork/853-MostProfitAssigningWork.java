// Last updated: 5/8/2025, 10:24:08 pm
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int n = difficulty.length;
        int[][] jobs = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            jobs[i][0] = difficulty[i];
            jobs[i][1] = profit[i];
        }
        
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        Arrays.sort(worker);
        
        int maxProfit = 0;
        int totalProfit = 0;
        int j = 0;
        
        for (int ability : worker) {
            while (j < n && ability >= jobs[j][0]) {
                maxProfit = Math.max(maxProfit, jobs[j][1]);
                j++;
            }
            totalProfit += maxProfit;
        }
        
        return totalProfit;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        int n = scanner.nextInt();
        
        int[] difficulty = new int[n];
        int[] profit = new int[n];

        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print("Job " + (i + 1) + " difficulty: ");
            difficulty[i] = scanner.nextInt();
            System.out.print("Job " + (i + 1) + " profit: ");
            profit[i] = scanner.nextInt();
        }

       
        int m = scanner.nextInt();
        
        int[] worker = new int[m];

        System.out.println();
        for (int i = 0; i < m; i++) {
            System.out.print("Worker " + (i + 1) + " ability: ");
            worker[i] = scanner.nextInt();
        }

        Solution solution = new Solution();
        int result = solution.maxProfitAssignment(difficulty, profit, worker);

        System.out.println( result);
    }
}
