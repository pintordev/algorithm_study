package level1.solution_12925;

class Solution_12925 {
    public static void main(String[] args) {

        Solution_12925 _s = new Solution_12925();

        String[] str = {"1234", "-1234"};
        int[] result = {1234, -1234};

        for (int i = 0, t = str.length; i < t; i++) {
            System.out.println(_s.solution(str[i]) == result[i]);
        }
    }

    public int solution(String s) {
        char s0 = s.charAt(0);
        int sign = s0 == '-' ? -1 : 1;
        int result = 0;
        for (int i = s0 > 47 ? 0 : 1, len = s.length(); i < len; i++) {
            result = (result << 3) + (result << 1) + s.charAt(i) - 48;
        }
        return sign * result;
    }
}