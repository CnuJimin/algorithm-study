package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Boj_5014 {
    // 스타트링크

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int F = Integer.parseInt(st.nextToken()); // 전체 층
        int S = Integer.parseInt(st.nextToken()); // 시작 층
        int G = Integer.parseInt(st.nextToken()); // 목표 층
        int U = Integer.parseInt(st.nextToken()); // 올라갈 때 몇칸 올라가는지
        int D = Integer.parseInt(st.nextToken()); // 내려갈 때 몇칸 내려가는지

        int[] count = new int[F + 1]; // count 배열 생성 -> 목표 층 까지 몇번 버튼을 누르는지 배열로 기록

        Queue<Integer> q = new LinkedList<>(); // bfs 사용하기 위한 큐
        boolean[] check = new boolean[F + 1]; // 방문 여부 확인 배열

        q.add(S); // 큐에 시작층 과 방문 여부 저장
        check[S] = true;
        count[S] = 0; // 시작 층이니까 count 0

        while (!q.isEmpty()) { // 모든 층 도달했거나 목표 층 도달 return

            Integer pull = q.poll();

            if (pull == G) { // 도달한 층이 목표 층이면 도달 층의 count 값 출력하고 return
                System.out.println(count[pull]);
                return;
            }

            for (int i = 0; i < 2; i++) {

                int next = 0 ;
                if (i == 0) next = pull + U; // 먼저갈 경우
                else next = pull - D; // 내려갈 경우

                if (next>F || next < 1) continue; // 올라가고 내려갔을 때 값이 최대층보다 크거나 아래로 내려가면 안됨

                if (!check[next]) { // 그게 아니고 방문 하지 않은 노드라면 방문했다고 표시하고, 해당 위치를 큐에 저장 후 count를 하나 늘려줌
                    check[next] = true;
                    q.add(next);
                    count[next] = count[pull] + 1;
                }
            }
        }
        System.out.println("use the stairs");

    }


}
