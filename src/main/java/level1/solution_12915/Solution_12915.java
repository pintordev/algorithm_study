package level1.solution_12915;

import java.util.Arrays;

class Solution_12915 {
    public static void main(String[] args) {

        Solution_12915 _s = new Solution_12915();

        String[][] strings = {
                {"sun", "bed", "car"},
                {"abce", "abcd", "cdx"}
        };
        int[] n = {1, 2};
        String[][] result = {
                {"car", "bed", "sun"},
                {"abcd", "abce", "cdx"}
        };

        for (int i = 0, t = strings.length; i < t; i++) {
            System.out.println(Arrays.equals(_s.solution(strings[i], n[i]), result[i]));
        }
    }

    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> {
            if (o1.charAt(n) == o2.charAt(n)) return o1.compareTo(o2);
            return Character.compare(o1.charAt(n), o2.charAt(n));
        });
        return strings;
    }
}