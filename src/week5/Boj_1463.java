package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1463 {
    //1로 만들기
    /*
     * if N % 2 = 0 => dp[N%2] + 1
    * if N % 3 = 0 => dp[N%3] + 1
    * else dp[N-1] + 1
    * 틀렸음 주어진 연산 순서가 우선순위가 아닌 것 같음
    * 2와 3으로 나눴을 떄 그리고 -1 중 더 적은 값을 선택하도록 해야 함
    * => 이렇게 하면 시간 초과
    * for 문으로 만들어보기 -> 정답
    * */
    static Long[] dp = new Long[10_000_000];
/*

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        dp[1] = 0L;
        dp[2] = 1L;
        dp[3] = 1L;
        dp[4] = 2L;

        System.out.println(makeOne(N));

    }

    private static Long makeOne(int N) {
        if (dp[N] == null) {
            long result = makeOne(N - 1) + 1;

            if (N % 3 == 0) {
                result = Math.min(result, makeOne(N / 3) + 1);
            }

            if (N % 2 == 0) {
                result = Math.min(result, makeOne(N / 2) + 1);
            }

            dp[N] = result;
        }
        return dp[N];

    => 시간 초과가 뜸
    }*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        dp[1] = 0L;

        for (int i = 2; i <= N; i++) {
            dp[i] = dp[i - 1] + 1;

            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        System.out.println(dp[N]);
    }
}
