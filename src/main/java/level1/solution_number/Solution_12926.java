package level1.solution_number;

class Solution_12926 {
    public static void main(String[] args) {

        Solution_12926 _s = new Solution_12926();

        String[] s = {"AB", "z", "a B z"};
        int[] n = {1, 1, 4};
        String[] result = {"BC", "a", "e F d"};

        for (int i = 0, t = s.length; i < t; i++) {
            System.out.println(_s.solution(s[i], n[i]).equals(result[i]));
        }
    }

    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0, len = s.length(); i < len; i++) {
            char c = s.charAt(i);
            if (c >= 'a') sb.append((char) ('a' + (c - 'a' + n) % 26));
            else if (c >= 'A') sb.append((char) ('A' + (c - 'A' + n) % 26));
            else sb.append(c);
        }
        return sb.toString();
    }
}