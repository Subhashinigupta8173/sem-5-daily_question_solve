// Last updated: 3/9/2025, 8:24:10 am
class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        long[] ugly = new long[n];
        ugly[0] = 1; 
        
        int k = primes.length;
        int[] idx = new int[k]; 
        long[] nextMultiple = new long[k];
        
        for (int i = 0; i < k; i++) {
            nextMultiple[i] = primes[i];
        }
        
        for (int i = 1; i < n; i++) {
            long nextUgly = Long.MAX_VALUE;
            
            for (int j = 0; j < k; j++) {
                nextUgly = Math.min(nextUgly, nextMultiple[j]);
            }
            
            ugly[i] = nextUgly;
            
            for (int j = 0; j < k; j++) {
                if (nextUgly == nextMultiple[j]) {
                    idx[j]++;
                    nextMultiple[j] = ugly[idx[j]] * primes[j];
                }
            }
        }
        
        return (int) ugly[n - 1]; 
    }
}
