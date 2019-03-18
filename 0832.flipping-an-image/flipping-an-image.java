class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int i = 0; i < A.length; i ++) {
            int j = 0, k = A[i].length - 1;
            while (j < k) {
                int temp = A[i][j];
                if (A[i][k] == 1) A[i][j] = 0;
                else A[i][j] = 1;
                if (temp == 1) A[i][k] = 0;
                else  A[i][k] = 1;
                ++ j;
                -- k;
            }
            if (j == k) {
                if (A[i][j] == 1) A[i][j] = 0;
                else A[i][j] = 1;
            }
        }
        return A;
    }
}