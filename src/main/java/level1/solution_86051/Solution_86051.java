package level1.solution_86051;

class Solution_86051 {
    public static void main(String[] args) {

        Solution_86051 _s = new Solution_86051();

        int[][] numbers = {{1,2,3,4,6,7,8,0}, {5,8,4,0,6,7,9}};
        int[] result = {14, 6};

        for (int i = 0, t = numbers.length; i < t; i++) {
            System.out.println(_s.solution(numbers[i]) == result[i]);
        }
    }

    public int solution(int[] numbers) {
        int sum = 45;
        for (int n : numbers) {
            sum -= n;
        }
        return sum;
    }
}