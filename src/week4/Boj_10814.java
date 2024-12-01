package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_10814 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        List<String[]> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            list.add(new String[]{String.valueOf(age), name});
        }

        list.sort(Comparator.comparingInt(a -> Integer.parseInt(a[0])));

        for (String[] strings : list) {
            sb.append(strings[0]).append(" ").append(strings[1]).append("\n");
        }

        System.out.println(sb);
    }
}
