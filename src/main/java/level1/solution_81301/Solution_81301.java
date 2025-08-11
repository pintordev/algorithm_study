package level1.solution_81301;

class Solution_81301 {
    public static void main(String[] args) {

        Solution_81301 _s = new Solution_81301();

        String[] s = {"one4seveneight", "23four5six7", "2three45sixseven", "123"};
        int[] result = {1478, 234567, 234567, 123};

        for (int i = 0, t = s.length; i < t; i++) {
            System.out.println(_s.solution(s[i]) == result[i]);
        }
    }

    public int solution(String s) {
        int res = 0;
        for (int i = 0, len = s.length(); i < len; i++) {
            char c = s.charAt(i);
            if (c <= '9') {res = add(res, c - '0'); continue;}
            char c2 = s.charAt(i + 1);
            switch (c) {
                case 'z': res = add(res, 0); i += 3; break;
                case 'o': res = add(res, 1); i += 2; break;
                case 't':
                    if (c2 == 'w') {res = add(res, 2); i += 2;}
                    else {res = add(res, 3); i += 4;}
                    break;
                case 'f':
                    if (c2 == 'o') {res = add(res, 4); i += 3;}
                    else {res = add(res, 5); i += 3;}
                    break;
                case 's':
                    if (c2 == 'i') {res = add(res, 6); i += 2;}
                    else {res = add(res, 7); i += 4;}
                    break;
                case 'e': res = add(res, 8); i += 4; break;
                case 'n': res = add(res, 9); i += 3; break;
            }
        }
        return res;
    }

    public int add(int res, int num) {
        return (res << 3) + (res << 1) + num;
    }
}