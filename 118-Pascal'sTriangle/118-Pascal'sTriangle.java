// Last updated: 3/9/2025, 7:45:18 am
import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int r = 0; r < numRows; r++) {
            List<Integer> row = new ArrayList<>();

           
            row.add(1);

            
            for (int i = 1; i < r; i++) {
                int val = triangle.get(r - 1).get(i - 1) + triangle.get(r - 1).get(i);
                row.add(val);
            }

           
            if (r > 0) {
                row.add(1);
            }

            triangle.add(row);
        }

        return triangle;
    }

   
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.generate(5)); 
        
    }
}
