package level1.solution_82612;

class Solution_82612 {
    public static void main(String[] args) {

        Solution_82612 _s = new Solution_82612();

        int[] price = {3};
        int[] money = {20};
        int[] count = {4};
        long[] result = {10};

        for (int i = 0, t = price.length; i < t; i++) {
            System.out.println(_s.solution(price[i], money[i], count[i]) == result[i]);
        }
    }

    public long solution(int price, int money, int count) {
        return Math.max(price * count * (count + 1L) / 2 - money, 0);
    }
}