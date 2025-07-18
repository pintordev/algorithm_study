package level1.solution_12918;

class Solution_12918 {
    public static void main(String[] args) {

        Solution_12918 _s = new Solution_12918();

        String[] s = {"a234", "1234"};
        boolean[] result = {false, true};

        for (int i = 0, t = s.length; i < t; i++) {
            System.out.println(_s.solution(s[i]) == result[i]);
        }
    }

    public boolean solution(String s) {
        int len = s.length();
        if (len != 4 && len != 6) return false;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) >= 'A') return false;
        }
        return true;
    }
}