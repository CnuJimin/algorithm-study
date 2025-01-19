package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_11725 {
    //트리의 부모 찾기


    public static void main(String[] args) throws IOException {
        List<List<Integer>> tree = new ArrayList<>(); //tree 구조 생성

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 노드의 개수

        StringTokenizer st ;
        int[] parent = new int[N + 1]; //노드의 부모를 저장할 배열
        boolean[] visited = new boolean[N + 1]; //방문 여부 체크 배열

        Queue<Integer> queue = new LinkedList<>(); // BFS를 위한 queue 생성

        for (int i = 0; i < N + 1; i++) { //tree에 인접 노드를 담을 배열 생성
            tree.add(new ArrayList<>());
        }

        for (int i = 0; i < N - 1; i++) { // tree에 인접 노드 넣어주기
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            tree.get(a).add(b);
            tree.get(b).add(a);
        }

        queue.add(1); // 트리의 루트가 1이라서 1부터 시작
        visited[1] = true; // 1은 방문했다고 치고

        //BFS
        while (!queue.isEmpty()) {
            int node = queue.poll(); // 1번 부터 시작
            for (int neighbor : tree.get(node)) { //1번의 인접 노드 -> 6,4
                if (!visited[neighbor]) {
                    visited[neighbor] = true; //6번, 4번 ture
                    parent[neighbor] = node; //6번 4번 노드의 부모는 1
                    queue.add(neighbor); // 다음 탐색할 노드로 6번 4번 노드 등록 -> 다시 6번부터 poll 됨 -> 인접 노드 등록, queue에 추가 4번 노드도 진행 ==> 이렇게 쭉
                }
            }
        }

        for (int i = 2; i < N + 1; i++) { //2번 노드부터 부모 노드 출력
            System.out.println(parent[i]);
        }
    }
}
