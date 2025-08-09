package level2.solution_42842;

import java.util.Arrays;

class Solution_42842 {
    public static void main(String[] args) {

        Solution_42842 _s = new Solution_42842();

        int[] brown = {10, 8, 24};
        int[] yellow = {2, 1, 24};
        int[][] result = {{4, 3}, {3, 3}, {8, 6}};

        for (int i = 0, t = brown.length; i < t; i++) {
            System.out.println(Arrays.equals(_s.solution(brown[i], yellow[i]), result[i]));
        }
    }

    public int[] solution(int brown, int yellow) {
        // b + y == wh;
        // (w - 2)(h - 2) == y;
        // (b + 4) >> 1 == w + h;
        // sum & times -> 2nd order equation
        int t = brown + yellow;
        int s = (brown + 4) >> 1;
        int d = (int) Math.sqrt(s * s - 4 * t);
        return new int[]{(s + d) >> 1, (s - d) >> 1};
    }
}