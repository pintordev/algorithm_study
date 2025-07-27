package level2.solution_70129;

import java.util.Arrays;

class Solution_70129 {
    public static void main(String[] args) {

        Solution_70129 _s = new Solution_70129();

        String[] s = {"110010101001", "01110", "1111111"};
        int[][] result = {{3, 8}, {3, 3}, {4, 1}};

        for (int i = 0, t = s.length; i < t; i++) {
            System.out.println(Arrays.equals(_s.solution(s[i]), result[i]));
        }
    }

    public int[] solution(String s) {
        int t = 0, zc = 0;
        while (s.length() != 1) {
            int oc = 0;
            for (int i = 0, len = s.length(); i < len; i++) {
                if (s.charAt(i) == '1') oc++;
            }
            zc += s.length() - oc;
            t++;
            s = Integer.toBinaryString(oc);
        }
        return new int[]{t, zc};
    }
}