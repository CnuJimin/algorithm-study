package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Boj_2407_answer{

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        System.out.println(C(N, M));


    }

    public static BigInteger C(int N, int M) {
        M = Math.min(M, N - M);
        BigInteger a  = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        for (int i = 0; i < M; i++) {
            a  = a.multiply(new BigInteger(String.valueOf(N - i)));
            b  = b.multiply(new BigInteger(String.valueOf(i + 1)));
        }

        BigInteger answer = a.divide(b);
        return answer;
    }
}
