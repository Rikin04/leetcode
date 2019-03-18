class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        if (bits.length == 1)
            return true;
        int x = 0;
        while (x + 1 < bits.length) {
            if (bits[x] == 0)
                x = x + 1;
            else x = x + 2;
        }
        if (x == bits.length)
            return false;
        return true;
    }
}