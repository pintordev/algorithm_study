package level1.solution_86491;

class Solution_86491 {
    public static void main(String[] args) {

        Solution_86491 _s = new Solution_86491();

        int[][][] sizes = {
            {{60,50},{30,70},{60,30},{80,40}},
            {{10,7},{12,3},{8,15},{14,7},{5,15}},
            {{14,4},{19,6},{6,16},{18,7},{7,11}}
        };
        int[] result = {4000, 120, 133};

        for (int i = 0, t = sizes.length; i < t; i++) {
            System.out.println(_s.solution(sizes[i]) == result[i]);
        }
    }

    public int solution(int[][] sizes) {
        int w = 0;
        int h = 0;
        for (int[] size : sizes) {
            w = Math.max(w, Math.max(size[0], size[1]));
            h = Math.max(h, Math.min(size[0], size[1]));
        }
        return w * h;
    }
}