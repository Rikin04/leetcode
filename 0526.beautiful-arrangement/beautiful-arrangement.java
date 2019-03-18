class Solution {
    boolean[] b;
    int count = 0;
    int N;
    public int countArrangement(int N) {
        b = new boolean[N + 1];
        this.N = N;
        arrangement(1);
        return count;
    }
    public void arrangement(int n) {
        if (n == N + 1)
            ++ count;
        else {
            for (int i = 1; i <= N; i ++) {
                if (b[i]) continue;
                if (i % n != 0 && n % i != 0) continue;
                b[i] = true;
                arrangement(n + 1);
                b[i] = false;
            }
        }
    }
}