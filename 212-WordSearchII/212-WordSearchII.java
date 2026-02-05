// Last updated: 5/2/2026, 12:57:05 pm
1class Solution {
2    static List<String> ll;
3    public List<String> findWords(char[][] maze, String[] word) {
4        ll=new ArrayList<>();
5
6        Trie t=new Trie();
7		for(String s:word) {
8			t.insert(s);
9		}
10		for(int i=0; i<maze.length; i++) {
11			for(int j=0; j<maze[0].length; j++) {
12				if(t.root.child.containsKey(maze[i][j])) {
13					t.Search(maze,i,j,t.root);
14					
15				}
16			}
17		}
18		return ll;
19
20	}
21
22	 static class Trie {
23
24	        class Node {
25	            char ch;
26	            String isterminal;
27	            HashMap<Character, Node> child;
28
29	            public Node(char c) {
30	                this.ch = c;                 
31	                child = new HashMap<>();
32	            }
33	        }
34
35	        Node root = new Node('*');
36
37	        public void insert(String word) {
38	            Node curr = root;
39
40	            for (int i = 0; i < word.length(); i++) {
41	                char ch = word.charAt(i);
42
43	                if (curr.child.containsKey(ch)) {
44	                    curr = curr.child.get(ch);
45	                } else {
46	                    Node nn = new Node(ch);
47	                    curr.child.put(ch, nn);
48	                    curr = nn;
49	                }
50	            }
51	            curr.isterminal = word;   // store root word
52	        }
53
54			public void Search(char[][] maze, int i, int j, Node node) {
55				
56				// TODO Auto-generated method stub
57				if(i<0 || j<0 || i>=maze.length || j>=maze[0].length || !node.child.containsKey(maze[i][j])) {
58					return ;
59				}
60				char ch=maze[i][j];
61				node=node.child.get(ch);
62				if(node.isterminal!=null) {
63					ll.add(node.isterminal);
64					node.isterminal=null;
65				}
66				maze[i][j]='*';
67				
68				Search(maze,i+1,j,node);
69				Search(maze,i-1,j,node);
70				Search(maze,i,j+1,node);
71				Search(maze,i,j-1,node);
72				maze[i][j]=ch;
73				
74			}
75
76        
77    }
78}