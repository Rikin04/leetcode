class Solution {
    int[][] newGrid;
    public int minPathSum(int[][] grid) {
        newGrid = new int[grid.length][grid[0].length];
        for(int x = 0; x < newGrid.length; x ++) 
            for (int y = 0; y < newGrid[x].length; y ++)
                newGrid[x][y] = Integer.MAX_VALUE;
        min(grid, newGrid, 0, 0, 0);
        return newGrid[newGrid.length - 1][newGrid[0].length - 1];
    }
    public void min(int[][] grid, int[][] newGrid, int sum, int x, int y) {
        if (sum + grid[x][y] >= newGrid[x][y])
            return;
        newGrid[x][y] = sum + grid[x][y];
        sum = newGrid[x][y];
        if (y < grid[0].length - 1)
            min(grid, newGrid, sum, x, y + 1);
        if (x < grid.length - 1)
            min(grid, newGrid, sum, x + 1, y);
    }
}