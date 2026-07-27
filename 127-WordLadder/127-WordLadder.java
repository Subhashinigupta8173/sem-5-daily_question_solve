// Last updated: 27/7/2026, 8:00:40 am
1import java.util.*;
2
3class Solution {
4    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
5        Set<String> set = new HashSet<>(wordList);
6        if (!set.contains(endWord))
7            return 0;
8        Queue<String> queue = new LinkedList<>();
9        queue.offer(beginWord);
10        int level = 1;
11        while (!queue.isEmpty()) {
12            int size = queue.size();
13            for (int i = 0; i < size; i++) {
14                String word = queue.poll();
15                if (word.equals(endWord))
16                    return level;
17                char[] arr = word.toCharArray();
18                for (int j = 0; j < arr.length; j++) {
19                    char original = arr[j];
20                    for (char ch = 'a'; ch <= 'z'; ch++) {
21                        arr[j] = ch;
22                        String nextWord = new String(arr);
23                        if (set.contains(nextWord)) {
24                            queue.offer(nextWord);
25                            set.remove(nextWord);  
26                        }
27                    }
28                    arr[j] = original;
29                }
30            }
31            level++;
32        }
33        return 0;
34    }
35}