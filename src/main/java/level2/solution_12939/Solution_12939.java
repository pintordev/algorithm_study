package level2.solution_12939;

class Solution_12939 {
    public static void main(String[] args) {

        Solution_12939 _s = new Solution_12939();

        String[] s = {"1 2 3 4", "-1 -2 -3 -4", "-1 -1"};
        String[] result = {"1 4", "-4 -1", "-1 -1"};

        for (int i = 0, t = s.length; i < t; i++) {
            System.out.println(_s.solution(s[i]).equals(result[i]));
        }
    }

    public String solution(String s) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int i = -1;
        int len = s.length();
        while (++i < len) {
            int sign = 1;
            if (s.charAt(i) == '-') {
                sign = -1;
                i++;
            }
            int num = 0;
            while (i < len && s.charAt(i) != ' ') {
                num = (num << 3) + (num << 1) + (s.charAt(i) - '0');
                i++;
            }
            num *= sign;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return new StringBuilder()
                .append(min)
                .append(' ')
                .append(max)
                .toString();
    }
}