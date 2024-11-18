package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Boj_2824 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st  = new StringTokenizer(br.readLine());
        BigInteger num1 = BigInteger.ONE;
        for (int i = 0; i < M; i++) {
            num1 = num1.multiply(BigInteger.valueOf(Integer.parseInt(st.nextToken())));
        }

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        BigInteger num2 = BigInteger.ONE;
        for (int i = 0; i < N; i++) {
            num2 = num2.multiply(BigInteger.valueOf(Integer.parseInt(st.nextToken())));
        }

        BigInteger gcd = gcd(num1, num2);
        String str = String.valueOf(gcd);
        if (str.length() >= 9) {
            String substring = str.substring(str.length() - 9);
            System.out.println(substring);
        } else {
            System.out.println(str);
        }


    }

    public static BigInteger gcd(BigInteger a, BigInteger b) {
        if (b.compareTo(BigInteger.ZERO) == 0) {
            return a;
        }
        return gcd(b, a.remainder(b));
    }
}
