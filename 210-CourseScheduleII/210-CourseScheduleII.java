// Last updated: 2/8/2026, 6:27:41 am
1class Solution {
2    public int[] findOrder(int numCourses, int[][] prerequisites) {
3        List<List<Integer>> adj = new ArrayList<>();
4       
5        for(int i =0;i<numCourses;i++){
6            adj.add(new ArrayList<>());
7            
8        }
9        int [] indegree =  new int [numCourses];
10        for(int [] pair:prerequisites){
11            adj.get(pair[1]).add(pair[0]);
12            indegree[pair[0]]++;
13        }
14        Queue<Integer> q = new LinkedList<>();
15        for(int i= 0; i<numCourses;i++){
16            if(indegree[i] == 0){
17                q.offer(i);
18            }
19        }
20        int [] order =  new int[numCourses];
21        int index =0;
22        while(!q.isEmpty()){
23            int curr   = q.poll();
24            order[index++] = curr; // collectin  order of yte courses
25            for(int next : adj.get(curr)){
26                indegree[next]-- ;
27                if(indegree[next] == 0){
28                    q.offer(next);
29                }
30
31            }
32
33        }
34        if(index == numCourses){
35            return order;
36        }
37        return new int[0];
38    
39
40
41
42
43        
44    }
45}