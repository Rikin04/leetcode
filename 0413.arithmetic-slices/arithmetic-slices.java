class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        if (A == null || A.length <= 2) return 0;
        int count = 0;
        boolean[][] B = new boolean[A.length][A.length];
        for (int x = 0; x < A.length; ++ x) {
            for (int y = 0; y < A.length; ++ y) {
                if (y - x < 2) continue;
                if ((y - x > 2) && !B[x][y - 1]) continue;
                if (x != 0 && B[x - 1][y]) B[x][y] = true;
                else if ((A[y] - A[y - 1]) == (A[y - 1] - A[y - 2])) B[x][y] = true;
                if (B[x][y]) ++ count;
            }
        }
        return count;
    }
}