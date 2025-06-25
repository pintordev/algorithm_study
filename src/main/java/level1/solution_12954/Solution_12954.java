package level1.solution_12954;

import java.util.Arrays;

class Solution_12954 {
    public static void main(String[] args) {

        Solution_12954 _s = new Solution_12954();

        int[] x = {2, 4, -4};
        int[] n = {5, 3, 2};
        long[][] result = {
                {2, 4, 6, 8, 10},
                {4, 8, 12},
                {-4, -8}
        };

        for (int i = 0, t = x.length; i < t; i++) {
            System.out.println(Arrays.equals(_s.solution(x[i], n[i]), result[i]));
        }
    }

    public long[] solution(int x, int n) {
        long[] result = new long[n];
        result[0] = x;
        for (int i = 1; i < n; i++) {
            result[i] = result[i - 1] + x;
        }
        return result;
    }
}