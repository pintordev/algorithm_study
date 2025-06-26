package level1.solution_87389;

class Solution_87389 {
    public static void main(String[] args) {

        Solution_87389 _s = new Solution_87389();

        int[] n = {10, 12};
        int[] result = {3, 11};

        for (int i = 0, t = n.length; i < t; i++) {
            System.out.println(_s.solution(n[i]) == result[i]);
        }
    }

    public int solution(int n) {
        int x = 0;
        while (n % ++x != 1) {}
        return x;
    }
}