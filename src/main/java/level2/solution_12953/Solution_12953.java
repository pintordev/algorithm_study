package level2.solution_12953;

class Solution_12953 {
    public static void main(String[] args) {

        Solution_12953 _s = new Solution_12953();

        int[][] arr = {
                {2, 6, 8, 14},
                {1, 2, 3}
        };
        int[] result = {168, 6};

        for (int i = 0, t = arr.length; i < t; i++) {
            System.out.println(_s.solution(arr[i]) == result[i]);
        }
    }

    public int solution(int[] arr) {
        int lcm = 1;
        for (int num : arr) {
            int gcd = gcd(lcm, num);
            lcm = lcm * num / gcd;
        }
        return lcm;
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}