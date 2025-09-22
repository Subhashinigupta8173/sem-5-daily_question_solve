// Last updated: 22/9/2025, 9:04:37 pm
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1); // row 0

        for (int i = 1; i <= rowIndex; i++) {
            // Update from right to left
            for (int j = row.size() - 1; j >= 1; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1); // last element
        }

        return row;
    }
}
