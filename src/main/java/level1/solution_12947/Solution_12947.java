package level1.solution_12947;

class Solution_12947 {
    public static void main(String[] args) {

        Solution_12947 _s = new Solution_12947();

        int[] x = {10, 12, 11, 13};
        boolean[] result = {true, true, false, false};

        for (int i = 0, t = x.length; i < t; i++) {
            System.out.println(_s.solution(x[i]) == result[i]);
        }
    }

    public boolean solution(int x) {
        int sum = 0, n = x;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return x % sum == 0;
    }
}