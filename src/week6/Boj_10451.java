package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10451 {

    static int [][] arr;
    static int T,N;
    static int count;
    static boolean [] visit;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;



        while (T-- > 0) {
            count = 0;
            N = Integer.parseInt(br.readLine());
            arr = new int[N + 1][N + 1];
            visit = new boolean[N + 1];
            st = new StringTokenizer(br.readLine());

            for (int i = 1; i <= N; i++) {
                int node = Integer.parseInt(st.nextToken());
                arr[i][node] = 1;
            }

            for (int i = 1; i <= N; i++) {
                if (!visit[i]) {
                    dfs(i);
                    count++;
                }
            }

            sb.append(count).append("\n");
        }

        System.out.println(sb);
    }

    private static void dfs(int index) {
        if (visit[index]) {
            return;
        }
        visit[index] = true;

        for (int i = 1; i <= N; i++) {
            if (arr[index][i] == 1) {
                dfs(i);
            }
        }
    }
}
