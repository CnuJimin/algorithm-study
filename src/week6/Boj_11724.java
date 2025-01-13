package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_11724 {

    static int node, line;
    static int arr[][];
    static boolean check[];


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        node = Integer.parseInt(st.nextToken());
        line = Integer.parseInt(st.nextToken());

        arr = new int[node + 1][node + 1];
        check = new boolean[node + 1];

        int result = 0;

        for (int i = 0; i < line; i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());
            arr[a][b] = arr[b][a] = 1;
        }

        for (int i = 1; i <= node; i++) {
            if (!check[i]) {
                dfs(i);
                result++;
            }
        }

        System.out.println(result);

    }

    private static void dfs(int index) {
        if (check[index]) {
            return;
        }

        check[index] = true;

        for (int i = 1; i <= node; i++) {
            if (arr[index][i] == 1) {
                dfs(i);
            }
        }
    }
}
