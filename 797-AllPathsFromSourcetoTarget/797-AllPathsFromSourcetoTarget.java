// Last updated: 29/8/2026, 10:40:15 pm
1class Solution {
2    List<List<Integer>> ans = new ArrayList<>();
3    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
4
5        List<Integer> ways = new LinkedList<>();
6        ways.add(0);
7        dfs(0, graph, ways);
8
9        return ans;
10
11        
12    }
13    private void dfs(int node,int[][] graph,List<Integer> ways){
14        if(node == graph.length - 1){
15            ans.add(new ArrayList<>(ways));
16            return ;
17        }
18        for(int nbrs : graph[node]){
19            ways.add(nbrs);
20            dfs(nbrs,graph,ways);
21            ways.remove(ways.size()-1);
22
23        }
24    }
25
26}