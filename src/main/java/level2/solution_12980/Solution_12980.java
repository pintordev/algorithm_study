package level2.solution_12980;

class Solution_12980 {
    public static void main(String[] args) {

        Solution_12980 _s = new Solution_12980();

        int[] N = {5, 6, 5000};
        int[] result = {2, 2, 5};

        System.out.println("bit-count");
        for (int i = 0, t = N.length; i < t; i++) {
            System.out.println(_s.solution(N[i]) == result[i]);
        }

        System.out.println("built-in");
        for (int i = 0, t = N.length; i < t; i++) {
            System.out.println(_s.solution2(N[i]) == result[i]);
        }
    }

    // Bit-count approach: number of 1-bits equals minimum battery usage.
    public int solution(int n) {
        int cnt = 0;
        while (n > 0) {
            if ((n & 1) == 1) cnt++;
            n >>= 1;
        }
        return cnt;
    }

    // Built-in approach: Integer.bitCount produces the same result.
    public int solution2(int n) {
        return Integer.bitCount(n);
    }
}