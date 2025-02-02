package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1780 {
    // 종이의 개수

    static int N;
    static int [][] paper ;
    static int minus_one, zero, one;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        paper = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                paper[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, N);

        sb.append(minus_one).append("\n").append(zero).append("\n").append(one);

        System.out.println(sb);

    }

    private static void partition(int x, int y, int size) {
        int first = paper[x][y];
        if (isUniform(x, y, size)) {
            if (first == -1) {
                minus_one++;
            } else if (first == 0) {
                zero++;
            } else if (first == 1) {
                one++;
            }
        } else {

            int newSize = size / 3;
            partition(x, y, newSize);
            partition(x + newSize, y, newSize);
            partition(x + newSize + newSize, y, newSize);

            partition(x, y + newSize, newSize);
            partition(x + newSize, y + newSize, newSize);
            partition(x + newSize + newSize, y + newSize, newSize);

            partition(x, y + newSize + newSize, newSize);
            partition(x + newSize, y + newSize + newSize, newSize);
            partition(x + newSize + newSize, y + newSize + newSize, newSize);

        }

    }

    private static boolean isUniform(int x, int y, int size) {
        int first = paper[x][y];

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (paper[i][j] != first) {
                    return false;
                }
            }
        }
        return true;
    }
}
