// Last updated: 5/8/2025, 10:23:53 pm
public class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        
        Set<String> exactWords = new HashSet<>();
        
        Map<String, String> caseInsensitiveWords = new HashMap<>();
        
        Map<String, String> vowelErrorWords = new HashMap<>();
        
        
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        
        
        for (String word : wordlist) {
            exactWords.add(word);
            
            String lowerCaseWord = word.toLowerCase();
            caseInsensitiveWords.putIfAbsent(lowerCaseWord, word);
            
            String devoweledWord = devowel(lowerCaseWord, vowels);
            vowelErrorWords.putIfAbsent(devoweledWord, word);
        }
        
        
        String[] result = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String query = queries[i];
            if (exactWords.contains(query)) {
                result[i] = query;
            } else {
                String lowerCaseQuery = query.toLowerCase();
                if (caseInsensitiveWords.containsKey(lowerCaseQuery)) {
                    result[i] = caseInsensitiveWords.get(lowerCaseQuery);
                } else {
                    String devoweledQuery = devowel(lowerCaseQuery, vowels);
                    result[i] = vowelErrorWords.getOrDefault(devoweledQuery, "");
                }
            }
        }
        
        return result;
    }
    
    private String devowel(String word, Set<Character> vowels) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (vowels.contains(c)) {
                sb.append('*'); 
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
