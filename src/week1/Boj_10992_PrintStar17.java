package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_10992_PrintStar17 {

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(in.readLine());

        for (int i = 1; i < n; i++) {
            for (int j = i; j <= n - 1; j++) {
                sb.append(" ");
            }
            sb.append("*");
            for (int j = 1; j < 2* (i - 1); j++) {
                sb.append(" ");
                if (j == 2 * (i - 1) -1) {
                    sb.append("*");
                }
            }
            sb.append("\n");
        }


        for (int i = 0; i < 2 * n - 1; i++) {
            sb.append("*");
        }

        System.out.println(sb);
    }
}
