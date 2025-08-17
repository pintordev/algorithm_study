package level2.solution_42885;

import java.util.Arrays;

class Solution_42885 {
    public static void main(String[] args) {

        Solution_42885 _s = new Solution_42885();

        int[][] people = {{70, 50, 80, 50}, {70, 80, 50}};
        int[] limit = {100, 100};
        int[] result = {3, 3};

        for (int i = 0, t = people.length; i < t; i++) {
            System.out.println(_s.solution(people[i], limit[i]) == result[i]);
        }
    }

    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0;
        int j = people.length - 1;
        while (i < j) {
            if (people[i] + people[j] <= limit) i++;
            j--;
        }
        return people.length - i;
    }
}