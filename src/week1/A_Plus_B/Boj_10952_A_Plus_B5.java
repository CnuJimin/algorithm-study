package week1.A_Plus_B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10952_A_Plus_B5 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int a  = Integer.parseInt(st.nextToken());
            int b  = Integer.parseInt(st.nextToken());

            if ((a + b) == 0) {

                break;
            }

            System.out.println(a + b);
        }
    }
}
