package level1.solution_12931;

class Solution_12931 {
    public static void main(String[] args) {

        Solution_12931 _s = new Solution_12931();

        int[] n = {123, 987};
        int[] result = {6, 24};

        for (int i = 0, t = n.length; i < t; i++) {
            System.out.println(_s.solution(n[i]) == result[i]);
        }
    }

    public int solution(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}