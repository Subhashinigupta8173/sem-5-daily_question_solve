// Last updated: 19/11/2025, 12:36:44 pm
class Solution {
    public int longestCycle(int[] edges) {
        int [] in=new int [edges.length];
		for(int i=0; i<edges.length; i++) {
			if(edges[i]!=-1) {
				in[edges[i]]++;
				
			}
			
			
		}
		Queue<Integer> q=new LinkedList<>();
		for(int i=0;i<in .length;i++) {
			if(in[i]==0) {
				q.add(i);
			}
		}
		boolean [] visited=new boolean [edges.length];
		while(!q.isEmpty()) {
			int e=q.poll();
			visited[e]=true;
			if(edges[e]!=-1) {
				in[edges[e]]--;
				if(in[edges[e]]==0) {
					q.add(edges[e]);
				
			}
			
			}
		}
		int ans=-1;
		//ak vertx pe agar visit ho chuka hai to dubara uspe visit nhi hoga 
		for(int i=0; i<visited.length; i++ ) {// sirf false ke liye lga rh ahi a topological sort taki unme cycle chekc na ho  
			if(visited[i]==false) { //agar visites  nhi hai to 
				int c=1; //
				visited[i]=true; //visited mark kar diya hai 
				int nbrs=edges[i]; //first vertex jispe visite kar rhe ehia use hi visited bna de rhe hia 
				while(nbrs!=i) { //neighbor chal kar vapas i pe a gya iska mtlb hia ki cycle mil gai hme
					c++;
					visited[nbrs]=true;
					nbrs=edges[nbrs];
					
				}
				ans=Math.max(ans, c);
			}
		}
		return ans;
	}
	

}
        
    
