package level1.solution_12903;

class Solution_12903 {
    public static void main(String[] args) {

        Solution_12903 _s = new Solution_12903();

        String[] s = {"abcde", "qwer"};
        String[] result = {"c", "we"};

        for (int i = 0, t = s.length; i < t; i++) {
            System.out.println(_s.solution(s[i]).equals(result[i]));
        }
    }

    public String solution(String s) {
        int len = s.length();
        return s.substring((len - 1) >> 1, (len >> 1) + 1);
    }
}