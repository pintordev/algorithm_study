package level1.solution_147355;

class Solution_147355 {
    public static void main(String[] args) {

        Solution_147355 _s = new Solution_147355();

        String[] t = {"3141592", "500220839878", "10203"};
        String[] p = {"271", "7", "15"};
        int[] result = {2, 8, 3};

        for (int i = 0, len = t.length; i < len; i++) {
            System.out.println(_s.solution(t[i], p[i]) == result[i]);
        }
    }

    public int solution(String t, String p) {
        int pLen = p.length();
        long pL = Long.parseLong(p);
        long tL = Long.parseLong(t.substring(0, pLen));
        long m = pow(10, pLen);
        int cnt = tL <= pL ? 1 : 0;
        for (int i = pLen, tLen = t.length(); i < tLen; i++) {
            tL -= (t.charAt(i - pLen) - '0') * m;
            tL = (tL << 3) + (tL << 1);
            tL += t.charAt(i) - '0';
            if (tL <= pL) cnt++;
        }
        return cnt;
    }

    public long pow(int i, int len) {
        long res = 1;
        while (--len > 0) res *= i;
        return res;
    }
}