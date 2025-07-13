package level1.solution_70128;

class Solution_70128 {
    public static void main(String[] args) {

        Solution_70128 _s = new Solution_70128();

        int[][] a = {{1, 2, 3, 4}, {-1, 0, 1}};
        int[][] b = {{-3, -1, 0, 2}, {1, 0, -1}};
        int[] result = {3, -2};

        for (int i = 0, t = a.length; i < t; i++) {
            System.out.println(_s.solution(a[i], b[i]) == result[i]);
        }
    }

    public int solution(int[] a, int[] b) {
        int dp = 0;
        for (int i = 0, len = a.length; i < len; i++) {
            dp += a[i] * b[i];
        }
        return dp;
    }
}