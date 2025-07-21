package level1.solution_12969;

import java.io.IOException;

class Solution_12969 {
    public static void main(String[] args) throws IOException {
        int c = read();
        int r = read();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                sb.append('*');
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }

    public static int read() throws IOException {
        int c, n = System.in.read() & 15;
        while ((c = System.in.read()) > 32) {
            n = (n << 3) + (n << 1) + (c & 15);
        }
        return n;
    }
}