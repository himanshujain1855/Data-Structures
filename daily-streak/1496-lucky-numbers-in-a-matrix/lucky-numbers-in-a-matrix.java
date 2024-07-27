class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> rowMins = new ArrayList();
        List<Integer> colMaxs = new ArrayList();

        int rows = matrix.length;
        int cols = matrix[0].length;

        // Traverse in row major order regular
        for (int row = 0; row < rows; row++) {
            int rowMin = matrix[row][0];

            for (int col = 0; col < cols; col++) {
                rowMin = Math.min(matrix[row][col], rowMin);
            }
            rowMins.add(rowMin);
        }

        // Traverse in column major order regular
        for (int col = 0; col < cols; col++) {
            int colMax = -1;

            for (int row = 0; row < rows; row++) {
                colMax = Math.max(matrix[row][col], colMax);
            }
            colMaxs.add(colMax);
        }

        List<Integer> ans = new ArrayList();
        // Traverse in row major order regular
        for (int row = 0; row < rows; row++) {
            int rowMin = rowMins.get(row);

            for (int col = 0; col < cols; col++) {
                int colMax = colMaxs.get(col);
                if (matrix[row][col] == rowMin && matrix[row][col] == colMax) {
                    ans.add(matrix[row][col]);
                }
            }
            rowMins.add(rowMin);
        }
        return ans;
    }
}