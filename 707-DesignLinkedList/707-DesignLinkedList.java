// Last updated: 21/7/2026, 8:41:06 am
1class MyLinkedList {
2    class Node{
3        int val;
4        Node next;
5        Node(int val){
6            this.val = val;
7            this.next = null;
8        }
9    }
10    Node head;
11    Node tail;
12    int NON;//number of te nodes
13
14
15    public MyLinkedList() {
16        head = null;
17        tail = null;
18        NON = 0;
19    }
20    
21    public int get(int index) {
22        if(index <0 || index >= NON || head == null){ // id index not found
23            return -1;
24        }
25        else{
26            Node temp = head;
27            for(int i = 0; i < index; i++){
28                temp = temp.next;
29            }
30            return temp.val;
31        }
32        
33    }
34    
35    public void addAtHead(int val) {
36        Node newNode = new Node(val);
37        if(head == null){
38            head = tail = newNode;
39        }
40        else{
41            newNode.next = head;
42            head = newNode;
43        }
44        NON++;
45        
46    }
47    
48    public void addAtTail(int val) {
49        Node newNode = new Node(val);
50        if(tail == null){
51            head = tail = newNode;
52        }
53        else{
54            tail.next = newNode;
55            tail = newNode;
56        }
57        NON++;
58
59        
60    }
61    
62    public void addAtIndex(int index, int val) {
63        if(index < 0 || index > NON){
64            return ;
65        }
66        if(index == 0){
67            addAtHead(val);
68        }
69        else if(index == NON){
70            addAtTail(val);
71        }
72        else{
73            Node newNode = new Node(val);
74            Node temp = head;
75            for(int i = 0;i < index-1; i++){
76                temp = temp.next;
77            }
78            newNode.next = temp.next;
79            temp.next = newNode;
80            NON++;
81        }
82    }
83    
84    public void deleteAtIndex(int index) {
85        if(index < 0 || index >= NON || head == null){
86            return ;
87        }
88        else if(head == tail){
89            head = null;
90            tail = null;
91            NON--;
92
93        }
94        else if(index == 0){
95            head = head.next ;
96            NON--;
97        }
98        else if(index == NON-1){
99            Node temp = head;
100            while(temp.next != tail) {
101                temp = temp.next;
102            }
103            temp.next = null;
104            tail = temp;
105            NON--;
106
107        }
108        else{
109            Node temp = head;
110            for(int i = 0; i < index-1; i++){
111                temp = temp.next;
112            }
113            temp.next = temp.next.next;
114            NON--;
115        }
116        
117    }
118}
119
120/**
121 * Your MyLinkedList object will be instantiated and called as such:
122 * MyLinkedList obj = new MyLinkedList();
123 * int param_1 = obj.get(index);
124 * obj.addAtHead(val);
125 * obj.addAtTail(val);
126 * obj.addAtIndex(index,val);
127 * obj.deleteAtIndex(index);
128 */