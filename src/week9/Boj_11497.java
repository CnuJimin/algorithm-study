package week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Boj_11497 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] logs = new int[N];

            for (int i = 0; i < N; i++) {
                logs[i] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(logs);

            Deque<Integer> deque = new ArrayDeque<>();

            for (int i = 0; i < N; i++) { // 스네이크 배치..
                if (i % 2 == 0) {
                    deque.addFirst(logs[i]);
                } else {
                    deque.addLast(logs[i]);
                }
            }

            int max = 0 ;
            Integer[] array = deque.toArray(new Integer[0]);

            for (int i = 1; i < N; i++) {
                max = Math.max(max, Math.abs(array[i] - array[i - 1]));
            }
            max = Math.max(max, Math.abs(array[0] - array[N-1]));
            sb.append(max).append("\n");

        }
        System.out.println(sb);
    }
}
