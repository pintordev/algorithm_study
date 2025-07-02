package level1.solution_12932;

import java.util.Arrays;

class Solution_12932 {
    public static void main(String[] args) {

        Solution_12932 _s = new Solution_12932();

        long[] n = {12345};
        int[][] answer = {{5, 4, 3, 2, 1}};

        for (int i = 0, t = n.length; i < t; i++) {
            System.out.println(Arrays.equals(_s.solution(n[i]), answer[i]));
        }
    }

    public int[] solution(long n) {
        int len = Long.toString(n).length();
        int[] rev = new int[len];
        for (int i = 0; i < len; i++) {
            rev[i] = (int) (n % 10);
            n /= 10;
        }
        return rev;
    }
}