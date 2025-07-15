package level1.solution_77884;

class Solution_77884 {
    public static void main(String[] args) {

        Solution_77884 _s = new Solution_77884();

        int[] left = {13, 24};
        int[] right = {17, 27};
        int[] result = {43, 52};

        for (int i = 0, t = left.length; i < t; i++) {
            System.out.println(_s.solution(left[i], right[i]) == result[i]);
        }
    }

    public int solution(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            if (i % Math.sqrt(i) == 0) sum -= i;
            else sum += i;
        }
        return sum;
    }
}