class Solution {
    public int reverse(int x) {
        int result = 0;
        boolean fa = false;
        if (x < 0) {
            fa = true;
            x = -x;
        }
        while (x > 0) {
            int s = x % 10;
            x = x / 10;
            result = result * 10 + s;
            if (result % 10 != s)
                return 0;
        }
        if (fa)
            result = -result;
        return result;
    }
}