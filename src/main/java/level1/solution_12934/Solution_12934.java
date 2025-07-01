package level1.solution_12934;

class Solution_12934 {
    public static void main(String[] args) {

        Solution_12934 _s = new Solution_12934();

        long[] n = {121, 3};
        long[] result = {144, -1};

        for (int i = 0, t = n.length; i < t; i++) {
            System.out.println(_s.solution(n[i]) == result[i]);
        }
    }

    public long solution(long n) {
        long sqrt = (long) Math.sqrt(n);
        return sqrt * sqrt == n ? (sqrt + 1) * (sqrt + 1) : -1;
    }
}