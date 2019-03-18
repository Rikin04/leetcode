class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        if (nums.length * nums[0].length != r * c)
            return nums;
        int[][] newNums = new int[r][c];
        int m = 0, n = 0;
        for (int x = 0; x < nums.length; x ++) {
            for (int y = 0; y < nums[0].length; y ++) {
                newNums[m][n ++] = nums[x][y];
                if (n == c) {
                    m ++;
                    n = 0;
                }
            }
        }
        return newNums;
    }
}