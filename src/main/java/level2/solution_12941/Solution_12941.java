package level2.solution_12941;

import java.util.Arrays;

class Solution_12941 {
    public static void main(String[] args) {

        Solution_12941 _s = new Solution_12941();

        int[][] A = {{1, 4, 2}, {1, 2}};
        int[][] B = {{5, 4, 4}, {3, 4}};
        int[] answer = {29, 10};

        for (int i = 0, t = A.length; i < t; i++) {
            System.out.println(_s.solution(A[i], B[i]) == answer[i]);
        }
    }

    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);
        int sum = 0;
        for (int i = 0, len = A.length; i < len; i++) {
            sum += A[i] * B[len - i - 1];
        }
        return sum;
    }
}