// Last updated: 24/7/2026, 10:11:08 am
1/*
2// Definition for a Node.
3class Node {
4    public int val;
5    public List<Node> neighbors;
6
7    public Node() {
8        val = 0;
9        neighbors = new ArrayList<Node>();
10    }
11
12    public Node(int _val) {
13        val = _val;
14        neighbors = new ArrayList<Node>();
15    }
16
17    public Node(int _val, ArrayList<Node> _neighbors) {
18        val = _val;
19        neighbors = _neighbors;
20    }
21}
22*/
23
24class Solution {
25
26    HashMap<Node, Node> map = new HashMap<>();
27
28    public Node cloneGraph(Node node) {
29
30        if (node == null)
31            return null;
32
33        if (map.containsKey(node))
34            return map.get(node);
35
36        Node clone = new Node(node.val);
37
38        map.put(node, clone);
39
40        for (Node neigh : node.neighbors) {
41            clone.neighbors.add(cloneGraph(neigh));
42        }
43
44        return clone;
45    }
46}