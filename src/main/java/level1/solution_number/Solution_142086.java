package level1.solution_number;

import java.util.Arrays;

class Solution_142086 {
    public static void main(String[] args) {

        Solution_142086 _s = new Solution_142086();

        String[] s = {"banana", "foobar"};
        int[][] result = {{-1, -1, -1, 2, 2, 2}, {-1, -1, 1, -1, -1, -1}};

        for (int i = 0, t = s.length; i < t; i++) {
            System.out.println(Arrays.equals(_s.solution(s[i]), result[i]));
        }
    }

    public int[] solution(String s) {
        int n = s.length();
        int[] res = new int[n];
        int[] last = new int[26];
        Arrays.fill(last, -1);
        for (int i = 0; i < n; i++) {
            int c = s.charAt(i) - 'a';
            if (last[c] != -1) res[i] = i - last[c];
            else res[i] = -1;
            last[c] = i;
        }
        return res;
    }
}