package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_2913 {
    //이친수
    /*
    * 1 = 1
    * 2 = 10 = 1
    * 3 = 101 100= 2
    * 4 = 1000 1010 1001 = 3
    * 5 = 10000 10100 10010 10001 10101 = 5
    *
    * fTwo(n) = fTwo(n-1) + fTwo(n-2)
    * */

    static Long[] dp = new Long[91];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 2L;

        System.out.println(fTwo(N));
    }

    private static Long fTwo(int N) {
        if (dp[N] == null) {
            dp[N] = fTwo(N - 1) + fTwo(N - 2);
        }

        return dp[N];

    }
}
