package level1.solution_138477;

import java.util.Arrays;
import java.util.PriorityQueue;

class Solution_138477 {
    public static void main(String[] args) {

        Solution_138477 _s = new Solution_138477();

        int[] k = {3, 4};
        int[][] score = {
            {10, 100, 20, 150, 1, 100, 200},
            {0, 300, 40, 300, 20, 70, 150, 50, 500, 1000}
        };
        int[][] result = {
            {10, 10, 10, 20, 20, 100, 100},
            {0, 0, 0, 0, 20, 40, 70, 70, 150, 300}
        };

        for (int i = 0, t = k.length; i < t; i++) {
            System.out.println(Arrays.equals(_s.solution(k[i], score[i]), result[i]));
        }
    }

    public int[] solution(int k, int[] score) {
        int n = score.length;
        int[] res = new int[n];
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            pq.add(score[i]);
            if (pq.size() > k) pq.poll();
            res[i] = pq.peek();
        }
        return res;
    }
}