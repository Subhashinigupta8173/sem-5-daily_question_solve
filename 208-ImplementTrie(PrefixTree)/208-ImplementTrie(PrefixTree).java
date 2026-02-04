// Last updated: 4/2/2026, 12:20:27 pm
1
2
3import java.util.HashMap;
4
5public class Trie {
6	class Node{
7		char ch;
8		boolean isterminal;
9		HashMap<Character,Node> child;// character and uske corrsponding node ki location hogi 
10		public Node(char ch) {
11			this.ch=ch;
12			child =new HashMap<>();
13		}
14		
15	}
16	private Node root;
17	public Trie() {
18		root=new Node('*');// node ka object banega jiska prefix false hoga aur hashmap o size ki hogi
19	}
20	public void insert(String word) {
21		Node curr=root;
22		for(int i=0; i<word.length(); i++) {
23			char ch =word.charAt(i);
24			if(curr.child.containsKey(ch)) {
25				curr=curr.child.get(ch);//current child ke map me ch ke addressko de dega aur  curr fir us node ko point krne lagega
26				
27				
28			}
29			else {
30				Node nn=new Node(ch);
31				curr.child.put(ch, nn);
32				curr=nn;
33			}
34		}
35		curr.isterminal=true;
36			
37		
38		
39	}
40	public boolean search(String word) {
41		Node curr=root;
42		for(int i=0; i<word.length(); i++) {
43			char ch =word.charAt(i);
44			if(curr.child.containsKey(ch)) {
45				curr=curr.child.get(ch);//current child ke map me ch ke addressko de dega aur  curr fir us node ko point krne lagega
46				
47				
48			}
49			else {
50				return false;
51			}
52		}
53		return curr.isterminal;
54		
55	}
56	 public boolean startsWith(String word) {
57		 Node curr=root;
58			for(int i=0; i<word.length(); i++) {
59				char ch =word.charAt(i);
60				if(curr.child.containsKey(ch)) {
61					curr=curr.child.get(ch);//current child ke map me ch ke addressko de dega aur  curr fir us node ko point krne lagega
62					
63					
64				}
65				else {
66					return false;
67				}
68			}
69			return true;
70			
71				
72		 
73	        
74	    }
75
76}
77
78
79/**
80 * Your Trie object will be instantiated and called as such:
81 * Trie obj = new Trie();
82 * obj.insert(word);
83 * boolean param_2 = obj.search(word);
84 * boolean param_3 = obj.startsWith(prefix);
85 */