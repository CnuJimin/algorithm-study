package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_11866 {

    //요세푸스 문제 0

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N  = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        Deque<Integer> deq = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            deq.add(i + 1);
        }

        sb.append("<");

        while (deq.size() > 1) {
            for (int i = 0; i < K - 1; i++) {
                deq.offer(deq.poll());
            }

            sb.append(deq.poll()).append(", ");
        }

        sb.append(deq.poll()).append(">");
        System.out.println(sb);

    }

}
