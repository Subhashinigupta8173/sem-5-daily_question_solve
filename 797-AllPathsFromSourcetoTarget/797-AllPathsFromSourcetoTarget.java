// Last updated: 29/8/2026, 10:41:00 pm
1class Solution {
2    List<List<Integer>>  ans = new ArrayList<>();
3    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
4        List<Integer>  ways = new ArrayList<>();
5        ways.add(0);
6        dfs(0,graph,ways);
7        return ans;
8    
9        
10    }
11    public  void dfs(int i,int [][] graph,List<Integer> ways){
12        if(i == graph.length-1){
13            ans.add(new ArrayList<>(ways));
14            return ;
15        }
16        for(int nbrs : graph[i]){
17            ways.add(nbrs);
18            dfs(nbrs,graph,ways);
19            ways.remove(ways.size()-1);
20        }
21    }
22}