package level1.solution_12922;

class Solution_12922 {
    public static void main(String[] args) {

        Solution_12922 _s = new Solution_12922();

        int[] n = {3, 4};
        String[] result = {"수박수", "수박수박"};

        for (int i = 0, t = n.length; i < t; i++) {
            System.out.println(_s.solution(n[i]).equals(result[i]));
        }
    }

    public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(i % 2 == 0 ? '수' : '박');
        }
        return sb.toString();
    }
}