package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_9095 {
    // 1,2,3 더하기
    /* sum(1) = 1
    sum (2) = 2
    sum (3) = 4
    sum(4) = 7
    sum(5) = 13
    sum(n) = sum(n-1) + sum(n-2) + sum(n-3)
    * */

    static Long[] dp = new Long[10];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        dp[0] = 1L;
        dp[1] = 2L;
        dp[2] = 4L;

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            Long sum = sum(N - 1);

            sb.append(sum).append("\n");
        }

        System.out.println(sb);

    }

    private static Long sum(int N) {
        if (dp[N] == null) {
            dp[N] = sum(N - 1) + sum(N - 2) + sum(N - 3);
        }
        return dp[N];
    }
}
