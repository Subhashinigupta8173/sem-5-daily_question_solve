// Last updated: 20/11/2025, 3:11:29 pm
class Solution {
    public int minimumArea(int[][] grid) {
        int minrow=Integer.MAX_VALUE;
        int maxrow=Integer.MIN_VALUE;
        int mincol=Integer.MAX_VALUE;
        int maxcol=Integer.MIN_VALUE;
        int n=grid.length;
        int m=grid[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==1){
                    minrow=Math.min(minrow,i);
                    maxrow=Math.max(maxrow,i);
                    mincol=Math.min(mincol,j);
                    maxcol=Math.max(maxcol,j);
                }
        
            }
        }
       
        int height=maxrow-minrow+ 1;
        int weight=maxcol-mincol+ 1;
        return height*weight;
        
    }
}