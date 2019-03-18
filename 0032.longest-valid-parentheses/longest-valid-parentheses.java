class Solution {
	 int i = 0;
	 public int longestValidParentheses(String s) {
		 if (s == null || s == "")
			 return 0;
		 Stack<Integer> stack = new Stack<Integer>();
		 int start = -1;
		 int maxLength = 0;
		 for (int i = 0; i < s.length(); i ++) {
			 if (s.charAt(i) == '(')
				 stack.push(i);
			 else {
				 if (!stack.isEmpty()) {
					 stack.pop();
					 if (stack.isEmpty())
						 maxLength = Math.max(i - start, maxLength);
					 else
						 maxLength = Math.max(i - (int)stack.peek(), maxLength);
				 }
				 else
					 start = i;
			 }
		 }
		 return maxLength;
	 }
}