package level1.solution_12935;

import java.util.Arrays;

class Solution_12935 {
    public static void main(String[] args) {

        Solution_12935 _s = new Solution_12935();

        int[][] arr = {{4, 3, 2, 1}, {10}};
        int[][] result = {{4, 3, 2}, {-1}};

        for (int i = 0, t = arr.length; i < t; i++) {
            System.out.println(Arrays.equals(_s.solution(arr[i]), result[i]));
        }
    }

    public int[] solution(int[] arr) {
        int len = arr.length;
        if (len == 1) return new int[]{-1};
        int min = Integer.MAX_VALUE;
        for (int n : arr) min = Math.min(min, n);
        int[] res = new int[len - 1];
        int idx = 0;
        for (int n : arr) {
            if (n == min) continue;
            res[idx++] = n;
        }
        return res;
    }
}