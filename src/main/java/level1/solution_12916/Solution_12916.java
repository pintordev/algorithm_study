package level1.solution_12916;

class Solution_12916 {
    public static void main(String[] args) {

        Solution_12916 _s = new Solution_12916();

        String[] s = {"pPoooyY", "Pyy"};
        boolean[] answer = {true, false};

        for (int i = 0, t = s.length; i < t; i++) {
            System.out.println(_s.solution(s[i]) == answer[i]);
        }
    }

    boolean solution(String s) {
        int b = 0;
        for (int i = 0, len = s.length(); i < len; i++) {
            char c = Character.toLowerCase(s.charAt(i));
            if (c == 'p') b++;
            else if (c == 'y') b--;
        }
        return b == 0;
    }
}