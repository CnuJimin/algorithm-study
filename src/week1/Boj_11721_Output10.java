package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_11721_Output10 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String str = br.readLine();

        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (i != 0 & i % 10 == 0) {
                sb.append("\n");
            }
            sb.append(charArray[i]);

        }

        System.out.println(sb);


    }
}
