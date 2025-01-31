package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_2630 {
    /*
     * 입력 N, N*N 배열
     *  int [N][N] 배열을 만들어서 배열을 담음
     *  재귀함수를 돌려서 한번 돌릴 떄 마다 배열 4개를 만듦, int[N/2][N/2] -> 4개, 그리고 값 대입
     *  만약 배열의 값이 모두 1이거나 0이면 return; 모두 0일 떄 int zero ++, 1일 대 int one ++
     *
     * */

    static int N ;
    static int[][] array;
    static int zero, one;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;
        N = Integer.parseInt(br.readLine());
        array = new int[N][N];

        for (int i = 0; i <N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        System.out.println(Arrays.deepToString(array));

        count(array, N);

        sb.append(zero).append("\n").append(one);

        System.out.println(sb);



    }

    private static void count(int[][] square, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int first = square[0][0];
                int color = square[i][j];

                if (first == 0 && color == first) {// 전부 흰색일 떄
                    zero ++;
                    return;
                } else if (first == 1 && color == first) { //전부 파랑일 때
                    one++;
                    return;
                } else {
                    int[][] square_one = new int[n / 2][n / 2];
                    int[][] square_two = new int[n / 2][n / 2];
                    int[][] square_three = new int[n / 2][n / 2];
                    int[][] square_four = new int[n / 2][n / 2];

                    for (int k = 0; k < n / 2; k++) {
                        for (int l = 0; l < n / 2; l++) {
                            square_one[k][l] = array[k][l];
                            square_two[k][l] = array[n / 2 + k][l];
                            square_three[k][l] = array[k][n / 2 + l];
                            square_four[k][l] = array[n / 2 + k][n / 2 + l];
                        }
                    }

                    count(square_one, 2 / n);
                    count(square_two, 2 / n);
                    count(square_three, 2 / n);
                    count(square_four, 2 / n);

                }
            }
        }
    }
}
