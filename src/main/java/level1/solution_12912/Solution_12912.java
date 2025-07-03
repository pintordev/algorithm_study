package level1.solution_12912;

class Solution_12912 {
    public static void main(String[] args) {

        Solution_12912 _s = new Solution_12912();

        int[] a = {3, 3, 5};
        int[] b = {5, 3, 3};
        long[] result = {12L, 3L, 12L};

        for (int i = 0, t = a.length; i < t; i++) {
            System.out.println(_s.solution(a[i], b[i]) == result[i]);
        }
    }

    public long solution(int a, int b) {
        return (Math.abs(a - b) + 1L) * (a + b) / 2;
    }
}