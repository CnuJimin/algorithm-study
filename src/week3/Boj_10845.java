package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_10845 {
    //큐

    static int[] queue = new int[10_000];
    static int front;
    static int back;
    static int size;
    static StringBuilder sb = new StringBuilder();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st ;

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine(), " ");

            switch (st.nextToken()) {
                case "push" : push(Integer.parseInt(st.nextToken())); break;
                case "pop" : pop(); break;
                case "size" : size(); break;
                case "empty" : empty(); break;
                case "front" : front(); break;
                case "back" : back(); break;
            }
        }
        System.out.println(sb);

    }

    private static void push(int a) {
        queue[back] = a;
        size++;
        back++;
    }

    private static void pop() {
        if (size == 0) {
            sb.append(-1).append("\n");
        } else {
            sb.append(queue[front]).append("\n");
            front ++;
            size --;
        }
    }

    private static void size() {
        sb.append(size).append("\n");
    }

    private static void empty() {
        if (size == 0) {
            sb.append(1).append("\n");
        } else {
            sb.append(0).append("\n");
        }
    }

    private static void front() {
        if (size == 0) {
            sb.append(-1).append("\n");
        } else {
            sb.append(queue[front]).append("\n");
        }
    }

    private static void back() {
        if (size == 0) {
            sb.append(-1).append("\n");
        } else {
            sb.append(queue[back -1]).append("\n");
        }
    }
}
