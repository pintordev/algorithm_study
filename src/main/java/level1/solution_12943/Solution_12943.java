package level1.solution_12943;

class Solution_12943 {
    public static void main(String[] args) {

        Solution_12943 _s = new Solution_12943();

        int[] n = {6, 16, 626331};
        int[] result = {8, 4, -1};

        for (int i = 0, t = n.length; i < t; i++) {
            System.out.println(_s.solution(n[i]) == result[i]);
        }
    }

    public int solution(int num) {
        int cnt = 0;
        while (num > 1 && cnt++ < 500) {
            if (num % 2 == 0) num = num >> 1;
            else num = num * 3 + 1;
        }
        return num == 1 ? cnt : -1;
    }
}