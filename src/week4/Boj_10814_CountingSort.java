package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10814_CountingSort {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder[] sb = new StringBuilder[201];

        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String age = st.nextToken();
            String name = st.nextToken();

            sb[Integer.parseInt(age)].append(age).append(" ").append(name).append("\n");
        }


        StringBuilder result = new StringBuilder();
        for (StringBuilder stringBuilder : sb) {
            result.append(stringBuilder);
        }

        System.out.println(result);
    }
}
