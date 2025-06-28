package level1.solution_12928;

class Solution_12928 {
    public static void main(String[] args) {

        Solution_12928 _s = new Solution_12928();

        int[] n = {12, 5};
        int[] result = {28, 6};

        for (int i = 0, t = n.length; i < t; i++) {
            System.out.println(_s.solution(n[i]) == result[i]);
        }
    }

    public int solution(int n) {
        int sum = 0, i = 1;
        for (; i * i < n; i++) {
            if (n % i != 0) continue;
            sum += i;
            sum += n / i;
        }
        if (i * i == n) sum += i;
        return sum;
    }
}