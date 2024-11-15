package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj4948 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int count = 0 ;
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (isPrime(i)) {
                    count ++ ;
                }
            }
            System.out.println(count);
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
