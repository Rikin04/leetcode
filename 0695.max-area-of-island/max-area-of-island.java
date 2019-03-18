class Solution {
    int[][] judge;
    public int maxAreaOfIsland(int[][] grid) {
        judge = new int[grid.length][grid[0].length];
        int max = 0;
        for (int x = 0; x < grid.length; x ++) {
            for (int y = 0; y < grid[0].length; y ++) {
                if (grid[x][y] == 1 && judge[x][y] == 0) {
                    judge[x][y] = 1;
                    max = Math.max(max, dfs(grid, x, y));
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid, int x, int y) {
        int count = 1;
        if (x > 0) {
            if (grid[x - 1][y] == 1 && judge[x - 1][y] == 0) {
                judge[x - 1][y] = 1;
                count = count + dfs(grid, x - 1, y);
            }
        }
        if (x < grid.length - 1) {
            if (grid[x + 1][y] == 1 && judge[x + 1][y] == 0) {
                judge[x + 1][y] = 1;
                count = dfs(grid, x + 1, y) + count;
            }
        }
        if (y > 0) {
            if (grid[x][ y - 1] == 1 && judge[x][y - 1] == 0) {
                judge[x][y - 1] = 1;
                count = count + dfs(grid, x, y - 1);
            }
        }
        if (y < grid[0].length - 1) {
            if (grid[x][ y + 1] == 1 && judge[x][y + 1] == 0) {
                judge[x][y + 1] = 1;
                count = count + dfs(grid, x, y + 1);
            }
        }
        return count;
    }
}