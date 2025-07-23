package level2.solution_12909;

class Solution_12909 {
    public static void main(String[] args) {

        Solution_12909 _s = new Solution_12909();

        String[] s = {"()()", "(())()", ")()(", "(()("};
        boolean[] answer = {true, true, false, false};

        for (int i = 0, t = s.length; i < t; i++) {
            System.out.println(_s.solution(s[i]) == answer[i]);
        }
    }

    boolean solution(String s) {
        int flag = 0;
        for (int i = 0, len = s.length(); i < len; i++) {
            if (s.charAt(i) == '(') flag++;
            else flag--;
            if (flag < 0) return false;
        }
        return flag == 0;
    }
}