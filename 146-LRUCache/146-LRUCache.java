// Last updated: 9/1/2026, 3:20:03 pm
1import java.util.HashMap;
2
3class LRUCache {
4
5    class Node {
6        int key, value;
7        Node prev, next;
8
9        Node(int key, int value) {
10            this.key = key;
11            this.value = value;
12        }
13    }
14
15    private int capacity;
16    private HashMap<Integer, Node> map;
17    private Node head, tail;
18
19    public LRUCache(int capacity) {
20        this.capacity = capacity;
21        map = new HashMap<>();
22
23        // dummy nodes
24        head = new Node(0, 0);
25        tail = new Node(0, 0);
26
27        head.next = tail;
28        tail.prev = head;
29    }
30
31    public int get(int key) {
32        if (!map.containsKey(key)) {
33            return -1;
34        }
35
36        Node node = map.get(key);
37        remove(node);
38        addToFront(node);
39        return node.value;
40    }
41
42    public void put(int key, int value) {
43        if (map.containsKey(key)) {
44            Node node = map.get(key);
45            node.value = value;
46            remove(node);
47            addToFront(node);
48        } else {
49            if (map.size() == capacity) {
50                Node lru = tail.prev;
51                remove(lru);
52                map.remove(lru.key);
53            }
54
55            Node newNode = new Node(key, value);
56            addToFront(newNode);
57            map.put(key, newNode);
58        }
59    }
60
61    private void addToFront(Node node) {
62        node.next = head.next;
63        node.prev = head;
64
65        head.next.prev = node;
66        head.next = node;
67    }
68
69    private void remove(Node node) {
70        node.prev.next = node.next;
71        node.next.prev = node.prev;
72    }
73}
74