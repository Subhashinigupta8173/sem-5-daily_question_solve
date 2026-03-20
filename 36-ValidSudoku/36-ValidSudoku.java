// Last updated: 20/3/2026, 9:51:43 pm
1import java.util.*;
2
3class Solution {
4    public boolean isValidSudoku(char[][] board) {
5        
6        for (int i = 0; i < 9; i++) {
7            HashSet<Character> row = new HashSet<>();
8            HashSet<Character> col = new HashSet<>();
9            HashSet<Character> box = new HashSet<>();
10            
11            for (int j = 0; j < 9; j++) {
12                
13             
14                if (board[i][j] != '.') {
15                    if (row.contains(board[i][j])) return false;
16                    row.add(board[i][j]);
17                }
18                
19                
20                if (board[j][i] != '.') {
21                    if (col.contains(board[j][i])) return false;
22                    col.add(board[j][i]);
23                }
24                
25            
26                int rowIndex = 3 * (i / 3) + j / 3;
27                int colIndex = 3 * (i % 3) + j % 3;
28                
29                if (board[rowIndex][colIndex] != '.') {
30                    if (box.contains(board[rowIndex][colIndex])) return false;
31                    box.add(board[rowIndex][colIndex]);
32                }
33            }
34        }
35        
36        return true;
37    }
38}