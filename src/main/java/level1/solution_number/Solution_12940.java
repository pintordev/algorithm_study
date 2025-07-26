package level1.solution_number;

import java.util.Arrays;

class Solution_12940 {
    public static void main(String[] args) {

        Solution_12940 _s = new Solution_12940();

        int[] n = {3, 2};
        int[] m = {12, 5};
        int[][] result = {{3, 12}, {1, 10}};

        for (int i = 0, t = n.length; i < t; i++) {
            System.out.println(Arrays.equals(_s.solution(n[i], m[i]), result[i]));
        }
    }

    public int[] solution(int n, int m) {
        int gcd = gcd(n, m);
        int lcm = (n * m) / gcd;
        return new int[]{gcd, lcm};
    }

    public int gcd(int n, int m) {
        return m == 0 ? n : gcd(m, n % m);
    }
}