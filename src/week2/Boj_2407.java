package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2407 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        System.out.println(C(N, M));


    }

    public static Long C(int N, int M) {
        M = Math.min(M, N - M);

        long a = 1L;
        long b = 1L;

        for (int i = 0; i < M; i++) {
            a *= (N - i);
            b *= (i + 1);

            long gcd = gcd(a, b);
            a /= gcd;
            b /= gcd;
        }

        return a / b;
    }

    public static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
