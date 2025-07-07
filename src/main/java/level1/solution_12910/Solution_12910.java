package level1.solution_12910;

import java.util.Arrays;

class Solution_12910 {
    public static void main(String[] args) {

        Solution_12910 _s = new Solution_12910();

        int[][] arr = {{5,9,7,10}, {2,36,1,3}, {3,2,6}};
        int[] divisor = {5, 1, 10};
        int[][] result = {{5,10}, {1,2,3,36}, {-1}};

        for (int i = 0, t = arr.length; i < t; i++) {
            System.out.println(Arrays.equals(_s.solution(arr[i], divisor[i]), result[i]));
        }
    }

    public int[] solution(int[] arr, int divisor) {
        Arrays.sort(arr);
        int[] divisible = new int[arr.length];
        int idx = 0;
        for (int n : arr) {
            if (n % divisor != 0) continue;
            divisible[idx++] = n;
        }
        return idx == 0 ? new int[]{-1} : Arrays.copyOf(divisible, idx);
    }
}