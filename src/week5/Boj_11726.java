package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_11726 {
    // 2xn 타일링
    /*
    * n = 1 -> 1
    * n = 2 -> 2
    * n = 3 -> 3
    * n = 4 -> 5
    * n = 5 -> 8
    *
    * 여기까지 보면 tile(n) = tile(n-1) + tile(n-2) + tile(n-3) -> 아님
    * tile(n) = tile(n-1) + tile(n-2)
    *
    * */


    static Long[] dp = new Long[1000];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp[0] = 1L;
        dp[1] = 2L;
        dp[2] = 3L;
        dp[3] = 5L;

        System.out.println(tile(N - 1));
    }

    private static Long tile(int N) {
        if (dp[N] == null) {
            dp[N] = tile(N - 1) + tile(N - 2);
        }
        return dp[N] % 10007;
    }
}
