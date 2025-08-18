package level2.solution_138476;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution_138476 {
    public static void main(String[] args) {

        Solution_138476 _s = new Solution_138476();

        int[] k = {6, 4, 2};
        int[][] tangerine = {{1, 3, 2, 5, 4, 5, 2, 3}, {1, 3, 2, 5, 4, 5, 2, 3}, {1, 1, 1, 1, 2, 2, 2, 3}};
        int[] result = {3, 2, 1};

        // Map
        for (int i = 0, t = k.length; i < t; i++) {
            System.out.println(_s.solution(k[i], tangerine[i]) == result[i]);
        }

        // Coordinate Compression
        for (int i = 0, t = k.length; i < t; i++) {
            System.out.println(_s.solution2(k[i], tangerine[i]) == result[i]);
        }
    }

    // Map
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int t : tangerine) {
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        int n = tangerine.length;
        int[] bucket = new int[n + 1];
        for (int f : map.values()) bucket[f]++;
        int cnt = 0;
        for (int i = n; i > 0 && k > 0; i--) {
            while (bucket[i] > 0 && k > 0) {
                k -= i;
                bucket[i]--;
                cnt++;
            }
        }
        return cnt;
    }

    // Coordinate Compression
    public int solution2(int k, int[] tangerine) {
        Arrays.sort(tangerine);
        int n = tangerine.length;
        int[] bucket = new int[n + 1];
        int r = 1;
        for (int i = 1; i < n; i++) {
            if (tangerine[i] == tangerine[i - 1]) r++;
            else {
                bucket[r]++;
                r = 1;
            }
        }
        bucket[r]++;
        int cnt = 0;
        for (int i = n; i > 0 && k > 0; i--) {
            while (bucket[i] > 0 && k > 0) {
                k -= i;
                bucket[i]--;
                cnt++;
            }
        }
        return cnt;
    }
}