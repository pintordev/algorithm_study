package level1.solution_12944;

class Solution_12944 {
    public static void main(String[] args) {

        Solution_12944 _s = new Solution_12944();

        int[][] arr = {{1, 2, 3, 4},
                {5, 5}};
        double[] result = {2.5, 5};

        for (int i = 0, t = arr.length; i < t; i++) {
            System.out.println(_s.solution(arr[i]) == result[i]);
        }
    }

    public double solution(int[] arr) {
        double sum = 0;
        for (int n : arr) sum += n;
        return sum / arr.length;
    }
}