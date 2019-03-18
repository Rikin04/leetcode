class Solution {
    boolean[][] b;
    public boolean exist(char[][] board, String word) {
        if (word == null || word.length() == 0)
            return false;
        b = new boolean[board.length][board[0].length];
        boolean bo = false;
        for (int x = 0; x < board.length; x ++) {
            for (int y = 0; y < board[x].length; y ++) {
                if (board[x][y] == word.charAt(0)) {
                    b[x][y] = true;
                    bo = ex(board, word.substring(1), x, y);
                    if (bo)
                        return bo;
                    b[x][y] = false;
                }
            }
        }
        return bo;
    }
    public boolean ex(char[][] board, String word, int x, int y) {
        boolean bo = false;
        if (word.equals(""))
            return true;
        if (x != 0) {
            if (board[x - 1][y] == word.charAt(0) && !b[x - 1][y]) {
                b[x - 1][y] = true;
                bo = ex(board, word.substring(1), x - 1, y);
                b[x - 1][y] = false;
            }
        }
        if (!bo && x < board.length - 1) {
            if (board[x + 1][y] == word.charAt(0) && !b[x + 1][y]) {
                b[x + 1][y] = true;
                bo = ex(board, word.substring(1), x + 1, y);
                b[x + 1][y] = false;
            }
        }
        if (!bo && y != 0) {
            if (board[x][y - 1] == word.charAt(0) && !b[x][y - 1]) {
                b[x][y - 1] = true;
                bo = ex(board, word.substring(1), x, y - 1);
                b[x][y - 1] = false;
            }
        }
        if (!bo && y < board[0].length - 1) {
            if (board[x][y + 1] == word.charAt(0) && !b[x][y + 1]) {
                b[x][y + 1] = true;
                bo = ex(board, word.substring(1), x, y + 1);
                b[x][y + 1] = false;
            }
        }
        return bo;
    }
}