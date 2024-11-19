package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Boj_10828 {
    //스택
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            if (str.contains("push")) {
                StringTokenizer st = new StringTokenizer(str, " ");
                st.nextToken();
                stack.push(Integer.parseInt(st.nextToken()));
            }else if (str.contains("pop")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.pop());
                }

            } else if (str.contains("top")) {
                if (stack.isEmpty()) {
                    System.out.println(-1);
                } else {
                    System.out.println(stack.getFirst());

                }
            } else if (str.contains("size")) {
                if (stack.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(stack.size());

                }
            } else if (str.contains("empty")) {
                if (stack.isEmpty()) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
        }
    }
}
