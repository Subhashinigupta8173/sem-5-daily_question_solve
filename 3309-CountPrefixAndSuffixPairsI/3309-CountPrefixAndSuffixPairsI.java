// Last updated: 5/8/2025, 10:23:32 pm

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println();
        int n = scanner.nextInt();
        scanner.nextLine(); 

        
        String[] words = new String[n];

    
        System.out.println();
        for (int i = 0; i < n; i++) {
            words[i] = scanner.nextLine();
        }

       
        Solution solution = new Solution();
        int count = solution.countPrefixSuffixPairs(words);

        
        System.out.println(count);
    }

    public int countPrefixSuffixPairs(String[] words) {
        int count = 0;

        
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (isPrefixAndSuffix(words[i], words[j])) {
                    count++;
                }
            }
        }

        return count;
    }

    private boolean isPrefixAndSuffix(String str1, String str2) {
        
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
}
