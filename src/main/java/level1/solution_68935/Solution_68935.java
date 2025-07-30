package level1.solution_68935;

class Solution_68935 {
    public static void main(String[] args) {

        Solution_68935 _s = new Solution_68935();

        int[] n = {45, 125};
        int[] result = {7, 229};

        for (int i = 0, t = n.length; i < t; i++) {
            System.out.println(_s.solution(n[i]) == result[i]);
        }
    }

    public int solution(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 3 + (n % 3);
            n /= 3;
        }
        return rev;
    }
}