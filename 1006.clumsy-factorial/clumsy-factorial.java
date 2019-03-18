class Solution {
    public int clumsy(int N) {
        int[] number = new int[N];
        String[] flag = {"*","/", "+", "-"};
        int[] rm = new int[N];
        int  index = 0;
        for (int i = 0; i < N; i ++)
             number[i] = N - i;
        rm[0] = number[0];
        for (int i = 1; i <= N - 1; i ++) {
            if (flag[(i - 1)  % 4].equals("*")) {
                rm[index] = rm[index] * number[i];
            }
            else if (flag[(i - 1)  % 4].equals("/")) {
                rm[index] = rm[index] / number[i];
            }
            else {
                rm[index + 1] = number[i];
                ++ index;
            }
        }
        String[] f = {"+", "-"};
        int sum = rm[0];
        for (int i = 0; i < index; i ++) {
            if (f[i % 2].equals("+")) {
                sum = sum + rm[i + 1];
            }
            else {
                sum = sum - rm[i + 1];
            }
        }
        return sum;

    }
}