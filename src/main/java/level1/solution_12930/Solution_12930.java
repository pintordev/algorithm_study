package level1.solution_12930;

class Solution_12930 {
    public static void main(String[] args) {

        Solution_12930 _s = new Solution_12930();

        String[] s = {"try hello world"};
        String[] result = {"TrY HeLlO WoRlD"};

        for (int i = 0, t = s.length; i < t; i++) {
            System.out.println(_s.solution(s[i]).equals(result[i]));
        }
    }

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0, o = 0, len = s.length(); i < len; i++) {
            if (s.charAt(i) == ' ') {
                o = 0;
                sb.append(' ');
                continue;
            }
            if (o % 2 == 0) sb.append(Character.toUpperCase(s.charAt(i)));
            else sb.append(Character.toLowerCase(s.charAt(i)));
            o++;
        }
        return sb.toString();
    }
}