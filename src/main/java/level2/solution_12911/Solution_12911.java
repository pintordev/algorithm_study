package level2.solution_12911;

class Solution_12911 {
    public static void main(String[] args) {

        Solution_12911 _s = new Solution_12911();

        int[] n = {78, 15};
        int[] result = {83, 23};

        System.out.println("standard bit-scan solution");
        for (int i = 0, t = n.length; i < t; i++) {
            System.out.println(_s.solution(n[i]) == result[i]);
        }

        System.out.println("one-line hack solution");
        for (int i = 0, t = n.length; i < t; i++) {
            System.out.println(_s.solution2(n[i]) == result[i]);
        }
    }

    // standard approach: scan trailing zeros (c0) and ones (c1), flip bit at p=c0+c1,
    // clear lower bits and insert (c1-1) ones at the right
    public int solution(int n) {
        int c = n;
        int c0 = 0, c1 = 0;
        while ((c & 1) == 0 && c != 0) {c0++; c >>= 1;}
        while ((c & 1) == 1) {c1++; c >>= 1;}
        int p = c0 + c1;
        n |= (1 << p);
        n &= ~((1 << p) - 1);
        n |= (1 << (c1 - 1)) - 1;
        return n;
    }

    // compact hack: uses lowest set bit trick and arithmetic to produce next number
    public int solution2(int n) {
        int c = n & -n;
        int p = ((n ^ (n + c))/ c) >> 2;
        return n + c | p;
    }
}