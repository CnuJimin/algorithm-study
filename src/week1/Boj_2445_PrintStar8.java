package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2445_PrintStar8 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        StringBuffer sb = new StringBuffer();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }
            for (int j = 0; j < 2 * (n - i); j++) {
                sb.append(" ");
            }
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i ; j--) {
                sb.append("*");
            }
            for (int j = 1 ; j <= 2 * i; j ++ ) {
                sb.append(" ");
            }
            for (int j = n; j > i ; j--) {
                sb.append("*");
            }
            sb.append("\n");

        }

        System.out.println(sb);

    }
}

