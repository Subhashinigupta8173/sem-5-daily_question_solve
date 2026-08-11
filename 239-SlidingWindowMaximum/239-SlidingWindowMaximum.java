// Last updated: 11/8/2026, 5:31:00 am
1class Solution {
2    public List<String> topKFrequent(String[] words, int k) {
3
4        HashMap<String, Integer> map = new HashMap<>();
5
6        for (String word : words) {
7            map.put(word, map.getOrDefault(word, 0) + 1);
8        }
9        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
10            if (!map.get(a).equals(map.get(b))) {
11                return map.get(b) - map.get(a);
12            }
13            return a.compareTo(b);
14        });
15        for (String word : map.keySet()) {
16            pq.add(word);
17        }
18
19        List<String> ans = new ArrayList<>();
20        while (k > 0) {
21            ans.add(pq.poll());
22            k--;
23        }
24
25        return ans;
26    }
27}