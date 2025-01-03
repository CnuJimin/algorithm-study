package week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj9461 {
    //파도반 수열
    /*
    * 규칙: P(N) = P(N-2) + P(N-3)
    * 100의 크기를 가진 배열 dp를 만들고
    * dp[0] = 1
    * dp[1] = 1
    * dp[2] = 1
    * 까지 함 근데 배열이 0부터 시작이니까 + 1 해줘야함 입력 값 N의 범위가 1~100
    * -> 처음에 int 형으로 진행해서 틀렸음, long으로 풀어야 함
    * */


    static Long[] dp = new Long[100];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        dp[0] = 1L;
        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 2L;

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            long pado = pado(N -1);
            sb.append(pado).append("\n");
        }

        System.out.println(sb);

    }

    private static long pado(int N) {
        if (dp[N] == null) {
            dp[N] = pado(N - 2) + pado(N - 3);
        }

        return dp[N];
    }

}
