package week9;

import java.util.*;
import java.io.*;

public class Boj_1946 {
    //신입 사원
    /*
    * int[N][2] 배열에 지원자들의 점수를 담음
    * 반복문을 돌면서 만약 지원자의 점수가 다른 지원자의 점수보다 적다면 N --;
    * -> 이렇게 풀면 시간초과
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

            Arrays.sort(array, Comparator.comparing(a -> a[0])); // 서류 성적을 기준으로 오름차순 정렬

            int count = 1;

            int minInterview = array[0][1];

            for (int i = 1; i < N; i++) {
                if (array[i][1] < minInterview) {// 서류 성적을 기준으로 이미 이미 정렬돼 있어서 면접 점수도 낮으면 무조건 탈락
                    count ++ ;
                    minInterview = array[i][1];  // 바로 직전 사람이 아니라 지금까지의 최고 경쟁자를 이겨야 합격할 수 있음
                }
            }
            sb.append(count).append("\n");

        }
        System.out.println(sb);
    }
}
