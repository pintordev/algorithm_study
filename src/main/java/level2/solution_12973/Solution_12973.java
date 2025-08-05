package level2.solution_12973;

class Solution_12973 {
    public static void main(String[] args) {

        Solution_12973 _s = new Solution_12973();

        String[] s = {"baabaa", "cdcd"};
        int[] result = {1, 0};

        for (int i = 0, t = s.length; i < t; i++) {
            System.out.println(_s.solution(s[i]) == result[i]);
        }
    }

    public int solution(String s) {
        int n = s.length();
        char[] c = new char[n];
        int t = 0;
        for (int i = 0; i < n; i++) {
            if (t > 0 && c[t - 1] == s.charAt(i)) t--;
            else c[t++] = s.charAt(i);
        }
        return t == 0 ? 1 : 0;
    }
}