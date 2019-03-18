import java.util.*;
class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashMap<Character, Character> row  = new HashMap<Character, Character>();
        HashMap<Character, Character> col  = new HashMap<Character, Character>();
        HashMap<Character, Character> rc  = new HashMap<Character, Character>();
        for (int m = 0; m < board.length; m ++) {
        	row.clear();
        	col.clear();
        	for (int n = 0; n < board[m].length; n ++) {
        		if (board[m][n] != '.') {
        			if (!row.containsKey(board[m][n]))
        					row.put(board[m][n], board[m][n]);
        			else 
        				return false; 
        		}
        		if (board[n][m] != '.') {
        			if (!col.containsKey(board[n][m]))
        				col.put(board[n][m], board[n][m]);
        			else 
        				return false;
        		}
        	}
        }
        for (int x = 0; x < 9; x += 3) {
        	for (int y = 0; y < 9; y += 3) {
        		rc.clear();
        		for (int k = 0; k < 9; k ++) {
                    if (board[x + k / 3][y + k % 3] != '.') {
        			if (!rc.containsKey(board[x + k / 3][y + k % 3]))
        				rc.put(board[x + k / 3][y + k % 3], board[x + k / 3][y + k % 3]);
        			else
        				return false;
                }
        		}
        	}
        }
        return true;
         
    }
}