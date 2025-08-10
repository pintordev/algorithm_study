package level1.solution_68644;

import java.util.Arrays;
import java.util.TreeSet;

class Solution_68644 {
    public static void main(String[] args) {

        Solution_68644 _s = new Solution_68644();

        int[][] numbers = {{2,1,3,4,1}, {5,0,2,7}};
        int[][] result = {{2,3,4,5,6,7}, {2,5,7,9,12}};

        System.out.println("boolean array");
        for (int i = 0, t = numbers.length; i < t; i++) {
            System.out.println(Arrays.equals(_s.solution(numbers[i]), result[i]));
        }

        System.out.println("tree set");
        for (int i = 0, t = numbers.length; i < t; i++) {
            System.out.println(Arrays.equals(_s.solution2(numbers[i]), result[i]));
        }
    }

    public int[] solution(int[] numbers) {
        boolean[] visited = new boolean[201];
        int cnt = 0;
        for (int i = 0, n = numbers.length; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = numbers[i] + numbers[j];
                if (visited[sum]) continue;
                visited[sum] = true;
                cnt++;
            }
        }
        int[] res = new int[cnt];
        int idx = 0;
        for (int i = 0; i < 201; i++) {
            if (visited[i]) res[idx++] = i;
        }
        return res;
    }

    public int[] solution2(int[] number) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0, n = number.length; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                set.add(number[i] + number[j]);
            }
        }
        int[] res = new int[set.size()];
        int idx = 0;
        for (int v : set) {
            res[idx++] = v;
        }
        return res;
    }
}