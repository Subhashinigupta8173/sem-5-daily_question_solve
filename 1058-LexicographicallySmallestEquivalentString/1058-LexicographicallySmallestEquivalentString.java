// Last updated: 5/8/2025, 10:23:51 pm
class Solution {
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        int[] parent = new int[26]; // To track root of each character
        for (int i = 0; i < 26; i++) {
            parent[i] = i; // Each character initially maps to itself
        }

        // Union operation for each pair in s1 and s2
        for (int i = 0; i < s1.length(); i++) {
            union(parent, s1.charAt(i) - 'a', s2.charAt(i) - 'a');
        }

        // Find the lexicographically smallest representative for each character
        for (int i = 0; i < 26; i++) {
            parent[i] = find(parent, i);
        }

        // Transform baseStr using the smallest equivalent characters
        StringBuilder result = new StringBuilder();
        for (char c : baseStr.toCharArray()) {
            result.append((char) (parent[c - 'a'] + 'a'));
        }

        return result.toString();
    }

    // Find operation with path compression
    private int find(int[] parent, int x) {
        if (parent[x] != x) {
            parent[x] = find(parent, parent[x]); // Path compression for efficiency
        }
        return parent[x];
    }

    // Union operation to merge sets
    private void union(int[] parent, int a, int b) {
        int rootA = find(parent, a);
        int rootB = find(parent, b);
        if (rootA != rootB) {
            if (rootA < rootB) {
                parent[rootB] = rootA;
            } else {
                parent[rootA] = rootB;
            }
        }
    }
}