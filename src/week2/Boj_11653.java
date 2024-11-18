package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//소인수 분해
public class Boj_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int d = 2;

        while (true) {
            if (num == 1) break;

            if (num % d == 0) {
                System.out.println(d);
                num = num / d;
                continue;
            }
            d ++;
        }


    }


}
