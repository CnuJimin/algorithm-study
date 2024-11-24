package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Boj_2164 {
    //카드 2

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= N; i++) {
            stack.offer(i);
        }

        while (stack.size() > 1) {
            System.out.println();
            stack.poll();
            stack.offer(stack.poll());
        }

        System.out.println(stack.poll());
    }
}
