class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] a = new int[2];
        if (edges.length <= 1 || edges == null)
            return a;
        int max = edges[0][0];
        for (int[] j : edges) 
            if (j[1] > max)
                max = j[1];
        int[] value = new int[max + 1];
        for (int x = 1; x < max + 1; x ++)
            value[x] = x;
        for (int[] j : edges) {
            if (value[j[0]] != value[j[1]]) {
                int v = value[j[1]];
                for (int k = 1; k < max + 1; k ++)
                    if (v == value[k])
                        value[k] = value[j[0]];
            }
            else {
                a[0] = j[0];
                a[1] = j[1];
            }
        }
        return a;
    }
}