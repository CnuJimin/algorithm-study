package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj1929 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);

    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
