package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2606 {

    static int node, line;
    static int [][] graph;
    static boolean [] visit;
    static int count ;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());

        graph = new int[node + 1][node + 1];
        visit = new boolean[node + 1];


        //선 연결
        for (int i = 0; i < line; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            graph[a][b] = graph[b][a] = 1; //양방향 연결

        }

        dfs(1);

        System.out.println(count - 1); //시작 지점 빼주기
    }

    private static void dfs(int index) {
        if (visit[index]) {
            return;
        }
        visit[index] = true;
        count++; //count 위치

        for (int i = 0; i <= node; i++) {
            if (graph[index][i] == 1) {
                dfs(i);
            }
        }
    }
}
