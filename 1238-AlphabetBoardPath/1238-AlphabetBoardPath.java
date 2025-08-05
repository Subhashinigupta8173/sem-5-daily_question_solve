// Last updated: 5/8/2025, 10:23:46 pm
public class Solution {
    public String alphabetBoardPath(String target) {
        StringBuilder result = new StringBuilder();
        int[] currentPosition = {0, 0};
        
        for (char c : target.toCharArray()) {
            int[] targetPosition = getPosition(c);
            result.append(getPath(currentPosition, targetPosition));
            currentPosition = targetPosition;
            result.append('!');
        }
        
        return result.toString();
    }
    
    private int[] getPosition(char c) {
        int index = c - 'a';
        return new int[] {index / 5, index % 5};
    }
    
    private String getPath(int[] start, int[] end) {
        StringBuilder path = new StringBuilder();
        int startX = start[0], startY = start[1];
        int endX = end[0], endY = end[1];
        
        
        if (endX == 5 && startY != 0) {
            while (startY > 0) {
                path.append('L');
                startY--;
            }
            while (startX < endX) {
                path.append('D');
                startX++;
            }
        } else {
            while (startX > endX) {
                path.append('U');
                startX--;
            }
            while (startX < endX) {
                path.append('D');
                startX++;
            }
            while (startY > endY) {
                path.append('L');
                startY--;
            }
            while (startY < endY) {
                path.append('R');
                startY++;
            }
        }
        
        return path.toString();
    }
}
