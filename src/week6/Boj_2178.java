package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_2178 {


    static int N,M; // N*M 배열 담을 변수
    static int[][] map; // Map 이중 배열
    static boolean[][] visited; // 방문 여부 이중 배열
    static Queue<point> queue = new LinkedList<>(); // BFS 구현을 위한 큐

    static int[] dx = {1, 0, -1, 0}; //bfs 이동 시 x 축
    static int[] dy = {0, 1, 0, -1}; // 이동시 y 축



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) { // 입격값 map 배열에 넣어주기
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                map[i][j] = line.charAt(j) - '0'; // -'0'을 통해서 정수 값으로 값 입력
            }
        }

        bfs(0, 0); //bfs 시작
        visited[0][0] = true; // 방문 체크

        System.out.println(map[N - 1][M - 1]); // 도착 지점 출력
    }

    private static void bfs(int x, int y) {
        queue.offer(new point(x, y)); // 현재 위치 큐에 넣어주기 (0.0)

        while (!queue.isEmpty()) {
            point currentPoint = queue.poll(); //현재 위치 뺴주기

            for (int i = 0; i < 4; i++) {
                int nextX = currentPoint.x + dx[i]; // x 축으로 이동
                int nextY = currentPoint.y + dy[i]; // y 축으로 이동

                if (nextX < 0 || nextX >= N || nextY < 0 || nextY >= M) { // 맵 밖으로 나갔는지 체크
                    continue;
                }

                if (map[nextX][nextY] == 0 || visited[nextX][nextY]) { // map 값이 0인 곳은 길이 아님 + 이미 방문했는지 체크
                    continue;
                }

                queue.offer(new point(nextX, nextY)); // if 문을 통과했다면, 다음 이동할 길이라는 뜻
                visited[nextX][nextY] = true; // 다음 이동할 길 방문 체크

                map[nextX][nextY] = map[currentPoint.x][currentPoint.y] + 1; // 다음 이동할 길에 출발지점으로부터의 이동 거리 저장
                // BFS로 이동하면 어짜치 최소 거리가 다음 map 배열에 저장됨
            }
        }


    }

    static class point { //현재 위치 표시를 위한 point 클래스
        int x;
        int y;

        public point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

}
