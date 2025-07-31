package level1.solution_131705;

class Solution_131705 {
    public static void main(String[] args) {

        Solution_131705 _s = new Solution_131705();

        int[][] number = {{-2, 3, 0, 2, -5}, {-3, -2, -1, 0, 1, 2, 3}, {-1, 1, -1, 1}};
        int[] result = {2, 5, 0};

        for (int i = 0, t = number.length; i < t; i++) {
            System.out.println(_s.solution(number[i]) == result[i]);
        }
    }

    public int solution(int[] number) {
        int n = number.length;
        int cnt = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (number[i] + number[j] + number[k] == 0) cnt++;
                }
            }
        }
        return cnt;
    }
}