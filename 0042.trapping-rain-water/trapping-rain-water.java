class Solution {
    public int trap(int[] height) {
        if (height.length < 3)
            return 0;
        int maxHeight = height[0], index = 0;
        for (int x = 0; x < height.length; x ++)
            if (maxHeight < height[x]) {
                maxHeight = height[x];
                index = x;
            }
        int sum = 0;
        int front = 0, frontIndex = index;
        while (front < frontIndex) {
            int frontMax = height[0], i = 0;
            for (int x = 0; x < frontIndex; x ++)
                if (frontMax < height[x]) {
                    frontMax = height[x];
                    i = x;
                }
            int y = i + 1, fsum = 0;
            while (y < frontIndex)
                fsum += height[y ++];
            sum = Math.min(height[i], height[frontIndex]) * (frontIndex - i - 1) + sum - fsum;
            frontIndex = i;
        }
        int behind = height.length - 1, behindIndex = index;
        while (behindIndex < behind) {
            int behindMax = height[height.length - 1], i = height.length - 1;
            for (int x = height.length - 1; x > behindIndex; x --)
                if (behindMax < height[x]) {
                    behindMax = height[x];
                    i = x;
                }
            int y = i - 1, fsum = 0;
            while (y > behindIndex)
                fsum += height[y --];
            sum = Math.min(height[i], height[behindIndex]) * (i - behindIndex - 1) + sum - fsum;
            behindIndex = i;
        }
        return sum;
    }
}