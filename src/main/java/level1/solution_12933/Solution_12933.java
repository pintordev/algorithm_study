package level1.solution_12933;

import java.util.Arrays;

class Solution_12933 {
    public static void main(String[] args) {

        Solution_12933 _s = new Solution_12933();

        long[] n = {118372};
        long[] result = {873211};

        for (int i = 0, t = n.length; i < t; i++) {
            System.out.println(_s.solution(n[i]) == result[i]);
        }
    }

    public long solution(long n) {
        char[] c = Long.toString(n).toCharArray();
        Arrays.sort(c);
        long sorted = 0;
        for (int i = c.length - 1; i >= 0; i--) {
            sorted = (sorted << 3) + (sorted << 1) + c[i] - 48;
        }
        return sorted;
    }
}