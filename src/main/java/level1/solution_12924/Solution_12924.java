package level1.solution_12924;

class Solution_12924 {
    public static void main(String[] args) {

        Solution_12924 _s = new Solution_12924();

        int[] n = {15};
        int[] result = {4};

        for (int i = 0, t = n.length; i < t; i++) {
            System.out.println(_s.solution(n[i]) == result[i]);
        }
    }

    public int solution(int n) {
        int cnt = 0;
        // i개 => i * m + i * (i + 1) / 2 = n
        // m = (n - i * (i + 1) / 2)  / i
        // m = n / i - (i + 1) / 2
        // i -> n의 약수 && 홀수
        for (int i = 1; i <= n; i += 2) {
            if (n % i == 0) cnt++;
        }
        return cnt;
    }
}