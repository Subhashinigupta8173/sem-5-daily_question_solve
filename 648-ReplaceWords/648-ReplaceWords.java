// Last updated: 5/2/2026, 12:18:25 pm
1import java.util.*;
2
3class Solution {
4
5    public String replaceWords(List<String> dictionary, String setn) {
6        Trie t = new Trie();
7
8        for (String s : dictionary) {
9            t.insert(s);
10        }
11
12        String[] arr = setn.split(" ");   // ✅ correct split
13
14        StringBuilder sb = new StringBuilder();
15        for (String word : arr) {
16            sb.append(t.search(word)).append(" ");
17        }
18
19        return sb.toString().trim();
20    }
21
22    static class Trie {
23
24        class Node {
25            char ch;
26            String isterminal;
27            HashMap<Character, Node> child;
28
29            Node(char c) {
30                this.ch = c;
31                child = new HashMap<>();
32            }
33        }
34
35        private Node root = new Node('*');
36
37        public void insert(String word) {
38            Node curr = root;
39
40            for (char ch : word.toCharArray()) {
41                curr.child.putIfAbsent(ch, new Node(ch));
42                curr = curr.child.get(ch);
43            }
44            curr.isterminal = word;
45        }
46
47        public String search(String word) {
48            Node curr = root;
49
50            for (char ch : word.toCharArray()) {
51                if (!curr.child.containsKey(ch)) {
52                    return word;
53                }
54                curr = curr.child.get(ch);
55
56                if (curr.isterminal != null) {
57                    return curr.isterminal; // shortest root found
58                }
59            }
60            return word;
61        }
62    }
63}
64