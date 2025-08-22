package level2.solution_12914;

class Solution_12914 {
    public static void main(String[] args) {

        Solution_12914 _s = new Solution_12914();

        int[] n = {4, 3};
        long[] result = {5, 3};

        for (int i = 0, t = n.length; i < t; i++) {
            System.out.println(_s.solution(n[i]) == result[i]);
        }
    }

    public long solution(int n) {
        if (n <= 3) return n;
        int mod = 1234567;
        long da = 2;
        long db = 3;
        for (int i = 4; i <= n; i++) {
            long dc = (da + db) % mod;
            da = db;
            db = dc;
        }
        return db;
    }
}