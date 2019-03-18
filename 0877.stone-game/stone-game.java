class Solution {
    public boolean stoneGame(int[] piles) {
        int[][] pile = new int[piles.length][piles.length];
        for (int x = 0; x < piles.length; x ++)
            pile[x][x] = piles[x];
        for (int y = 1; y < piles.length; y ++) {
            int x = y - 1;
            while (x >= 0) {
                int max1 = piles[x] + pile[x + 1][y];
                int max2 = piles[y] + pile[x][y - 1];
                if (max1 >= max2) pile[x][y] = max1;
                else pile[x][y] = max2;
                x --;
            }
        }
        int max = pile[0][piles.length - 1];
        int sum = -max;
        for (int x = 0; x < piles.length; x ++)
            sum += piles[x];
        if (max > sum) return true;
        else return false; 
    }
}