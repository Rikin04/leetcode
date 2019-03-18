class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        for (int i = 0; i < K; i ++) {
            A[0] = -A[0];
            Arrays.sort(A);
        }
        int sum = 0;
        for (int i = 0; i < A.length; i ++)
            sum += A[i];
        return sum;
    }
}