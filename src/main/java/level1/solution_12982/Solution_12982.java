package level1.solution_12982;

import java.util.Arrays;

class Solution_12982 {
    public static void main(String[] args) {

        Solution_12982 _s = new Solution_12982();

        int[][] d = {{1,3,2,5,4}, {2,2,3,3}};
        int[] budget = {9, 10};
        int[] result = {3, 4};

        for (int i = 0, t = d.length; i < t; i++) {
            System.out.println(_s.solution(d[i], budget[i]) == result[i]);
        }
    }

    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int cnt = 0;
        while ((budget -= d[cnt]) >= 0 && ++cnt < d.length);
        return cnt;
    }
}