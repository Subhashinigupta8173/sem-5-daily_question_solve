// Last updated: 28/7/2026, 2:36:29 am
1class Solution {
2    public List<Integer> eventualSafeNodes(int[][] graph) {
3        int n = graph.length;
4        List<Integer>[] rev = new ArrayList[n];
5        for(int i = 0; i<n;i++){
6            rev[i]=new ArrayList<>();
7        }
8        int [] outdegree = new int [n];
9        for(int i =0; i<n;i++){
10            outdegree[i] = graph[i].length;
11            for(int nbrs : graph[i]){
12                rev[nbrs].add(i) ;//reverse edge create kr rha haiye,rev[1].add(0)
13            }
14        }
15        Queue<Integer>q = new LinkedList<>();
16        for(int i=0;i<n;i++){
17            if(outdegree[i] == 0){
18                q.offer(i);
19            }
20        }
21
22        List<Integer> ans = new ArrayList<>();
23        while(!q.isEmpty()){
24            int node = q.poll();//outdegree 0 vale phle se hi node me hai jo ki termnial hai 
25            ans.add(node);//isliye ans me directadd kar diya
26            for(int parent: rev[node]){
27                outdegree[parent]--;
28                if(outdegree[parent] == 0){
29                    q.offer(parent);
30                }
31            }
32        }
33        Collections.sort(ans);
34        return ans;
35
36         
37
38        
39    }
40}