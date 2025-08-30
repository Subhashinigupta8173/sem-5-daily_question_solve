// Last updated: 30/8/2025, 8:24:20 pm
class Solution {
    public int minSensors(int n, int m, int k) {
        int tileSize = 2 * k + 1;                
        int rowsNeeded = (n + tileSize - 1) / tileSize; 
        int colsNeeded = (m + tileSize - 1) / tileSize; 
        return rowsNeeded * colsNeeded;
        
    }
}