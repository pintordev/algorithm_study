package level1.solution_12906;

import java.util.Arrays;

class Solution_12906 {
    public static void main(String[] args) {

        Solution_12906 _s = new Solution_12906();

        int[][] arr = {{1, 1, 3, 3, 0, 1, 1}, {4, 4, 4, 3, 3}};
        int[][] answer = {{1, 3, 0, 1}, {4, 3}};

        for (int i = 0, t = arr.length; i < t; i++) {
            System.out.println(Arrays.equals(_s.solution(arr[i]), answer[i]));
        }
    }

    public int[] solution(int[] arr) {
        int len = arr.length;
        int[] reduced = new int[len];
        reduced[0] = arr[0];
        int top = 1;
        for (int i = 1; i < len; i++) {
            if (reduced[top - 1] == arr[i]) continue;
            reduced[top++] = arr[i];
        }
        return Arrays.copyOf(reduced, top);
    }
}