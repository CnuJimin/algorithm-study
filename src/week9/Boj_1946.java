package week9;

import java.util.*;
import java.io.*;

public class Boj_1946 {
    //신입 사원
    /*
    * int[N][2] 배열에 지원자들의 점수를 담음
    * 반복문을 돌면서 만약 지원자의 점수가 다른 지원자의 점수보다 적다면 N --;
    *
    *
    * */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[][] array = new int[N][2];

            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < 2; j++) {
                    array[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (array[i][0] < array[j][0] && array[i][1] < array[j][1]) {
                        N --;
                    }
                }
            }
            sb.append(N).append("\n");
        }
        System.out.println(sb);
    }
}
