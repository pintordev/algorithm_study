package level2.solution_12945;

class Solution_12945 {
    public static void main(String[] args) {

        Solution_12945 _s = new Solution_12945();

        int[] n = {3, 5};
        int[] result = {2, 5};

        for (int i = 0, t = n.length; i < t; i++) {
            System.out.println(_s.solution(n[i]) == result[i]);
        }
    }

    public int solution(int n) {
        int mod = 1234567;
        int fa = 0;
        int fb = 1;
        for (int i = 2; i <= n; i++) {
            int fn = (fa + fb) % mod;
            fa = fb;
            fb = fn;
        }
        return fb;
    }
}