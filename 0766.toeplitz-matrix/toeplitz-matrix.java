class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix.length == 0)
            return true;
        for (int y = 0; y < matrix[0].length; y ++) {
            int x = 0;
            int num = matrix[x][y];
            for (int i = 1; x + i < matrix.length && y + i < matrix[0].length; i ++)
                if (matrix[x + i][y + i] != num)
                    return false;
        }
        for (int x = 1; x < matrix.length; x ++) {
            int y = 0;
            int num = matrix[x][y];
            for (int i = 1; x + i < matrix.length && y + i < matrix[0].length; i ++)
                if (matrix[x + i][y + i] != num)
                    return false;
        }
        return true;
    }
}