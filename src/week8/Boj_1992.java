package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_1992 {
    //쿼드 트리

    static int N;
    static int[][] array;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        array = new int[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                array[i][j] = line.charAt(j) - '0';
            }
        }

        partition(0, 0, N);
        System.out.println(sb);
    }

    private static void partition(int x, int y, int size) {
        int first = array[x][y];
        if (isUniform(x, y, size)) {
            if (first == 1) {
                sb.append(1);
            } else {
                sb.append(0);
            }
            return;
        }
        int newSize = size / 2;
        partition(x, y, newSize);
        partition(x, y + newSize, newSize);
        partition(x + newSize, y, newSize);
        partition(x + newSize, y + newSize, newSize);
        sb.append(")");


    }


    private static boolean isUniform(int x, int y, int size) {
        int first = array[x][y];
        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (array[i][j] != first) {
                    sb.append("(");
                    return false;
                }
            }
        }
        return true;
    }
}
