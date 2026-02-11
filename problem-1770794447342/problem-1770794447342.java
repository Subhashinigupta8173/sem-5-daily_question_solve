// Last updated: 11/2/2026, 12:50:47 pm
1class Solution {
2    public int findMaximumXOR(int[]arr) {
3        //we willuse the trie concpt trie bana lenge numbers ka binary bna kar no ko 32 bit me lenge ,fir no ka xor krke store karenge max nikalte hue ,jo max ha i no use print kar denge
4    
5     
6		Trie t=new Trie();
7		for(int x:arr) {
8			t.add(x);
9		}
10		int ans=0;
11		for(int x:arr) {
12			ans=Math.max(t.getMaxXor(x),ans);
13		}
14		return ans;
15    }
16    static  class Trie{
17		class Node{
18			  Node zero;
19			  Node One;
20			  
21		}
22		private  Node root=new Node();
23		
24		public void add(int val) {
25			Node curr=root;
26			for(int i=31; i>=0;i--) {//32 bit  me lenge no ko
27				int bit=val & (1<< i);
28				if(bit ==0) {
29					if(curr.zero!=null) {
30						curr=curr.zero;
31					}
32					else {
33						Node nn=new Node();
34						curr.zero=nn;
35						curr=nn;
36					}
37					
38					
39				}
40				else {
41					if(curr.One!=null) {
42						curr=curr.One;
43					}
44					else {
45						Node nn=new Node();
46						curr.One=nn;
47						curr=nn;
48					}
49					
50				}
51				
52			}
53		}
54		public int getMaxXor(int x) {
55			int ans=0;
56			Node curr=root;
57			for(int i=31; i>=0; i--) {
58				int bit=x &(1<< i);
59				if(bit==0) {
60					if(curr.One!=null) {
61						ans=ans | (1<<i);//xor ,+ bhi use kar sakte hai chal jaiga 
62						curr=curr.One;
63							
64					}
65					else {
66						curr=curr.zero;
67					}
68					
69				}
70				else {
71					if(curr.zero!=null) {
72						ans =ans|(1<<i);
73						curr=curr.zero;
74					}
75					else {
76						curr=curr.One;
77					}
78					
79				}
80			}
81			return ans;
82		}
83	}
84}