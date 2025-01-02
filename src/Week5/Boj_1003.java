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

    static int N ;
    static int zero ;
    static int one;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < N; i++) {
            fibo(Integer.parseInt(br.readLine()));
            sb.append(zero).append(" ").append(one).append("\n");

            zero = 0;
            one = 0;
        }

        System.out.println(sb);
    }

    public static int fibo(int n) {
        if (n == 1) {
            return one ++;
        } else if (n == 0) {
            return zero++;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }

    }
}
