class Solution {
    public int divide(int dividend, int divisor) {
    	if (divisor == 0)
    		return Integer.MAX_VALUE;
    	if (dividend == Integer.MIN_VALUE && divisor == -1)
    		return ~dividend;
    	long dividend1 = Math.abs((long) dividend);
    	long divisor1 = Math.abs((long) divisor);
    	int result = 0;
    	while (dividend1 >= divisor1) {
    		int num = 0;
    		while (dividend1 >= divisor1 << num)
    			++ num;
    		dividend1 -= divisor1 << (num - 1);
    		result += 1 << (num - 1);
    	}
    	if ((dividend  > 0 && divisor > 0) || (dividend < 0 && divisor < 0))
    		return result;
    	else 
    		return -result;
    }
}