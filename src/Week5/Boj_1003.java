package Week5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_1003 {

    /*
    * 입력 : 스태틱 N (정수) -> BufferedReader
    * 출력: 정수 2개 N번 -> 함추 호출 횟수?
    * 피보나치 함수를 만듦
    * fibo(int n)
    * if (n = 1) 이면 int 1 ++
    * if (n = 0) 이면 int 0 ++
    * -> 시간 초과
    *
    * (답봤음)
    * DP는 한번 사용한 값을 저장해서 사용하기 때문에 배열을 이용해서 값을 저장해두어야 함
    * */

    static Integer[][] dp = new Integer[41][2]; // N의 범위가 0~40

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        dp[0][0] = 1;
        dp[0][1] = 0;
        dp[1][0] = 0;
        dp[1][1] = 1;


        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            fibo(N);
            sb.append(dp[N][0] + " " + dp[N][1]).append("\n");

        }

        System.out.println(sb);
    }

    public static Integer[] fibo(int N) {
        if (dp[N][0] == null || dp[N][1] == null) {
            dp[N][0] = fibo(N - 1)[0] + fibo(N - 2)[0];
            dp[N][1] = fibo(N - 1)[1] + fibo(N - 2)[1];
        }

        return dp[N];

    }


}
