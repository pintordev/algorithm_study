package level1.solution_12919;

class Solution_12919 {
    public static void main(String[] args) {

        Solution_12919 _s = new Solution_12919();

        String[] seoul = {"Jane", "Kim"};
        String result = "김서방은 1에 있다";

        System.out.println(_s.solution(seoul).equals(result));
    }

    public String solution(String[] seoul) {
        for (int i = 0, len = seoul.length; i < len; i++) {
            if (!seoul[i].equals("Kim")) continue;
            return new StringBuilder()
                    .append("김서방은 ")
                    .append(i)
                    .append("에 있다")
                    .toString();
        }
        return null;
    }
}