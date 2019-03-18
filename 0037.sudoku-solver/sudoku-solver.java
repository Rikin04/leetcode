class Solution {
    public void solveSudoku(char[][] board) {
    	ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
    	ArrayList<Node> l = new ArrayList<Node>();
    	for (int i = 0; i < 27; i ++)
    		list.add(new ArrayList<Integer>());
    	for (int x = 0; x < 9; x ++) {
    		for (int y = 0; y < 9; y ++) {
    			if (board[x][y] != '.') {
    				list.get(x).add(board[x][y] - 48);
    				list.get(y + 9).add(board[x][y] - 48);
    				if (x < 3) {
    					list.get(18 + y / 3).add(board[x][y] - 48);
    				}
    				else if (x < 6) {
    					list.get(18 + 3 + y / 3).add(board[x][y] - 48);
    				}
    				else {
    					list.get(18 + 6 + y / 3).add(board[x][y] - 48);
    				}
    			}
    			else {
    				l.add(new Node(x, y));
    			}
    		}
    	}
    	int[] num = new int[l.size()];
    	S(list, l, num, 0);
    	for (int i = 0; i < num.length; i ++) {
    		int x = l.get(i).x;
    		int y = l.get(i).y;
    		board[x][y] = (char)(num[i] + 48);
    	}
    }
    public void S(ArrayList<ArrayList<Integer>> list, ArrayList<Node> l, int[] num, int n) {
    	if (n == num.length) 
    		return;
    	int x = l.get(n).x;
    	int y = l.get(n).y;
    	for (int i = 1; i <= 9; i ++) {
    		if (list.get(x).contains(i)) continue;
    		if (list.get(y + 9).contains(i)) continue;
			if (x < 3) {
				if (list.get(18 + y / 3).contains(i))
					continue;				
			}
			else if (x < 6) {
				if (list.get(18 + 3 + y / 3).contains(i))
					continue;
			}
			else {if (list.get(18 + 6 + y / 3).contains(i)) continue;}
			
			num[n] = i;
			list.get(x).add(i);
			list.get(y + 9).add(i);
			if (x < 3) list.get(18 + y / 3).add(i);			
			else if (x < 6) list.get(18 + 3 + y / 3).add(i);
			else list.get(18 + 6 + y / 3).add(i);
			
			S(list, l, num, n + 1);
			if (num[num.length - 1] != 0)
				return;
			
			num[n] = 0;
			list.get(x).remove(list.get(x).size() - 1);
			list.get(y + 9).remove(list.get(y + 9).size() - 1);
			if (x < 3) list.get(18 + y / 3).remove(list.get(18 + y / 3).size() - 1);			
			else if (x < 6) list.get(18 + 3 + y / 3).remove(list.get(18 + 3 + y / 3).size() - 1);
			else list.get(18 + 6 + y / 3).remove(list.get(18 + 6 + y / 3).size() - 1);
    	}
    }
}
class Node {
	public int x;
	public int y;
	public Node(int x, int y) {
		this.x = x;
		this.y = y;
	}
}