package level2.solution_12951;

class Solution_12951 {
    public static void main(String[] args) {

        Solution_12951 _s = new Solution_12951();

        String[] s = {"3people unFollowed me", "for the last week"};
        String[] result = {"3people Unfollowed Me", "For The Last Week"};

        for (int i = 0, t = s.length; i < t; i++) {
            System.out.println(_s.solution(s[i]).equals(result[i]));
        }
    }

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toUpperCase(s.charAt(0)));
        for (int i = 1, len = s.length(); i < len; i++) {
            if (s.charAt(i - 1) == ' ') sb.append(Character.toUpperCase(s.charAt(i)));
            else sb.append(Character.toLowerCase(s.charAt(i)));
        }
        return sb.toString();
    }
}