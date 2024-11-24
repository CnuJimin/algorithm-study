package week3;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Boj_18258 {

    //큐2

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st ;
        Deque<Integer> queue = new ArrayDeque<>();

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            String str = br.readLine();
            st = new StringTokenizer(str, " ");
            if (str.contains("push")) {
                st.nextToken();
                int a = Integer.parseInt(st.nextToken());
                queue.offer(a);
            }
            if (str.contains("pop")) {
                if (queue.isEmpty()) {
                    bw.write(String.valueOf(-1));
                    bw.newLine();
//                    bw.close();
                } else {
                    bw.write(String.valueOf(queue.poll()));
                    bw.newLine();

//                    bw.close();
                }
            }
            if (str.contains("size")) {
                bw.write(String.valueOf(queue.size()));
                bw.newLine();
//                bw.close();
            }
            if (str.contains("empty")) {
                if (queue.isEmpty()) {
                    bw.write(String.valueOf(1));
                    bw.newLine();
//                    bw.close();
                } else {
                    bw.write(String.valueOf(0));
                    bw.newLine();
//                    bw.close();
                }
            }
            if (str.contains("front")) {
                if (queue.isEmpty()) {
                    bw.write(String.valueOf(-1));
                    bw.newLine();
//                    bw.close();
                } else {
                    bw.write(String.valueOf(queue.getFirst()));
                    bw.newLine();
//                    bw.close();
                }
            }
            if (str.contains("back")) {
                if (queue.isEmpty()) {
                    bw.write(String.valueOf(-1));
                    bw.newLine();
//                    bw.close();
                } else {
                    bw.write(String.valueOf(queue.getLast()));
                    bw.newLine();
//                    bw.close();
                }
            }
        }
        bw.flush();
        bw.close();

    }
}
