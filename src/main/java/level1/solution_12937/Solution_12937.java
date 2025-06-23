package level1.solution_12937;

class Solution_12937 {
    public static void main(String[] args) {

        Solution_12937 _s = new Solution_12937();

        int[] n = {3, 4};
        String[] result = {"Odd", "Even"};

        for (int i = 0, t = n.length; i < t; i++) {
            System.out.println(_s.solution(n[i]).equals(result[i]));
        }
    }

    public String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}