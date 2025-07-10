package level1.solution_12948;

class Solution_12948 {
    public static void main(String[] args) {

        Solution_12948 _s = new Solution_12948();

        String[] phone_number = {"01033334444", "027778888"};
        String[] result = {"*******4444", "*****8888"};

        for (int i = 0, t = phone_number.length; i < t; i++) {
            System.out.println(_s.solution(phone_number[i]).equals(result[i]));
        }
    }

    public String solution(String phone_number) {
        char[] c = phone_number.toCharArray();
        for (int i = 0, len = c.length - 4; i < len; i++) {
            c[i] = '*';
        }
        return String.valueOf(c);
    }
}