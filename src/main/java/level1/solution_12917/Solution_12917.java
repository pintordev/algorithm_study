package level1.solution_12917;

class Solution_12917 {
    public static void main(String[] args) {

        Solution_12917 _s = new Solution_12917();

        String[] s = {"Zbcdefg"};
        String[] result = {"gfedcbZ"};

        for (int i = 0, t = s.length; i < t; i++) {
            System.out.println(_s.solution(s[i]).equals(result[i]));
        }
    }

    public String solution(String s) {
        int[] cnt = new int[52];
        for (int i = 0, len = s.length(); i < len; i++) {
            char c = s.charAt(i);
            if (c >= 'a') cnt[c - 'a']++;
            else cnt[c - 'A' + 26]++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 25; i >= 0; i--) {
            while (cnt[i]-- > 0) sb.append((char) (i + 'a'));
        }
        for (int i = 51; i >= 26; i--) {
            while (cnt[i]-- > 0) sb.append((char) (i - 26 + 'A'));
        }
        return sb.toString();
    }
}