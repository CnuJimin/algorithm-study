package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_10870 {
    //피보나치수

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(fibo(N));


    }

    public static int fibo(int n) {

        if (n <2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }

    }
}

