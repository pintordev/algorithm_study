package level1.solution_159994;

class Solution_159994 {
    public static void main(String[] args) {

        Solution_159994 _s = new Solution_159994();

        String[][] cards1 = {
            {"i", "drink", "water"},
            {"i", "water", "drink"}
        };
        String[][] cards2 = {
            {"want", "to"},
            {"want", "to"}
        };
        String[][] goal = {
            {"i", "want", "to", "drink", "water"},
            {"i", "want", "to", "drink", "water"}
        };
        String[] result = {"Yes", "No"};

        for (int i = 0, t = result.length; i < t; i++) {
            System.out.println(_s.solution(cards1[i], cards2[i], goal[i]).equals(result[i]));
        }
    }

    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int c1 = 0;
        int c2 = 0;
        for (String g : goal) {
            if (c1 < cards1.length && g.equals(cards1[c1])) c1++;
            else if (c2 < cards2.length && g.equals(cards2[c2])) c2++;
            else return "No";
        }
        return "Yes";
    }
}