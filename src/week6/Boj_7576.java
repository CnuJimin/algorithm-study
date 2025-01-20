package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_7576 {
    //토마토

    /*
     * 배열을 이중 배열로 받고, map[][]에 저장해둠 값이 1일 때 해당 값의 좌표를 저장해둠
     * 저장해두고, 해당 좌표들을 bfs로 실행..
     * 조건은 0보다 작을 때, M,N보다 클 때 제외
     * 다음 좌표 값이 -1일 떄 제외
     * 그리고 count[][]배열에 총 며칠 걸리는지 계산
     * 근데 모르겠는 것
     * => 표시는 정답 보고 알아낸 것
     * 1. 1의 좌표 값을 어디에 저장해야할 것인가?
     * => bfs를 구현할 q를 애초에 int[] 배열을 담도록 만들어서, queue에 바로 배열 형식으로 담아버림
     * 2. 1이 여러개 있으면 어떻게 여러개를 동시에 bfs를 실행할 수 있을지
     * => 어차피 1인 좌표 값을 큐에 넣고 큐에서 값을 빼면서 bfs를 진행함, 그래서 하나씩 서로 한번씩 움직이니까 동시에 실행할 필요가 없고 큐에 넣은 다음 실행하면 됨
     * 3. 언제 끝내야 할지 -> 큐에 더 이상 값이 없을 때 그냥 끝내면 되는건가? => 0인 곳을 기준으로 이동하고 큐가 비면 가능한 모든 곳을 탐색한 것이기 떄문에 종료하면 됨
     * 근데 그럼 count 배열에서 어떤 값을 반환해야 할지.. -> count를 배열이 아니라 전역 변수로 설정하면?
     * => 전역 변수로 설정하고 map[][]에서 가장 큰 값을 Math.max를 통해서 count와 배열의 값을 비교해 가장 높은 값을 저장하면 됨
     * # 생각 못한 것
     * - 에초에 큐를 int[] 배열을 담을 수 있게 해서 좌표를 담는 방법
     * - 모든 토마토가 익어 있는 경우 -> count 값이 1일 때로 확인
     * - count값에서 1을 뺄 것 -> 하루 뒤부터 시작하는 것이 기준임
     * */

    static int M, N;
    static int[][] map;
    static int[][] visited; // 필요 없는 이유가 뭐지
    static int count;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, 1, 0, -1};
    static Queue<int[]> queue = new LinkedList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                map[i][j] = Integer.parseInt(st.nextToken()); //배열에 담을 때 StringTokenizer로 한번에 담을 수 있음
                if (map[i][j] == 1) { //익은 토마토를 미리 큐에 저장
                    queue.add(new int[]{i, j});
                }
            }
        }

        System.out.println(bfs());
    }

    private static int bfs() {
        while (!queue.isEmpty()) {
            int[] temp = queue.poll(); // 익은 토마토 좌표 꺼내기
            int x = temp[0];
            int y = temp[1];

            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if (nx >= 0 && ny >= 0 && nx < N && ny < M) {
                    if (map[nx][ny] == 0) { //토마토가 범위를 벗어나지 않고 방문하지 않았을 때 그 위치를 큐에 넣고, 해당 위치 값 업데이트
                        queue.add(new int[]{nx, ny});
                        map[nx][ny] = map[x][y] + 1;
                    }
                }
            }
        }
        //bfs 로직 종료


        //count에 값을 넣기 위한 로직
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == 0) { //탐색하지 않은 곳 -> 아직 익지 않은 토마토 존재하면 -1 return
                    return -1;
                }
                count = Math.max(count, map[i][j]);
            }
        }

        if (count == 1) { //모두 익은 토마토가 주어졌을 때
            return 0;
        } else {
            return count - 1; // 최종 날짜에서 하루 빼줘야 함
        }

    }

}
