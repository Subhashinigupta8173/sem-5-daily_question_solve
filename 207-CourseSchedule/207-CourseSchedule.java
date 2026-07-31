// Last updated: 31/7/2026, 7:46:31 am
1class Solution {
2    public boolean canFinish(int numCourses, int[][] prerequisites) {
3        ArrayList<Integer>[] graph = new ArrayList[numCourses];
4        for(int i = 0; i < numCourses; i++) {
5            graph[i] = new ArrayList<>();
6        }
7         int[] indegree = new int[numCourses];
8        for(int[] pair : prerequisites){
9            int course= pair[0];
10            int prerequisite = pair[1];
11            graph[prerequisite].add(course);
12            indegree[course]++;
13        }
14        Queue<Integer> queue = new LinkedList<>();
15        int count = 0;
16        for(int i = 0; i < numCourses; i++) {
17
18            if(indegree[i] == 0)
19                queue.add(i);
20        }
21        
22        while(!queue.isEmpty()){
23            int node = queue.poll();
24            count++;
25            for(int nbrs:graph[node]){
26                indegree[nbrs]--;
27                if(indegree[nbrs]==0){
28                    queue.add(nbrs);
29                }
30            }
31        }
32        return count == numCourses;
33
34
35        
36
37    }
38}