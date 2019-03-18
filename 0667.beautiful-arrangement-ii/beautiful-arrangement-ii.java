class Solution {
    public int[] constructArray(int n, int k) {
        int[] number = new int[n];
        int count = 0;
        int sum = n - 1;
        number[0] = 1;
        int i = 1;
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        for (; count != k - 1; i ++) {
            if (number[i - 1] + sum <= n && !list.contains(number[i - 1] + sum)) number[i] = number[i - 1] + sum;
            else number[i] = number[i - 1] - sum;
            -- sum;
            ++ count;
            list.add(number[i]);
        }
        if (number[i - 1] + sum <= n && !list.contains(number[i - 1] + sum)) {
            for (; i < n; i ++)
                number[i] = number[i - 1] + 1;
        }
        else
            for (; i < n; i ++)
                number[i] = number[i - 1] - 1;
        return number;
    }
}