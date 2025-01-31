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
     *  count(int[][] square, int n)
     *   1. 모든 색종이가 0이거나 1인거 검사
     *   -> 내가 시도한 방식
     *   이중 for 문 돌려서 첫번째 값과 각 값을 비교해서 모두 같은색이면 각 색의 값을 올리려고 했음
     *   2. 아니라면 배열 4개를 만들어 각각 4분등한 정사각형을 대입
     *   3. 그 정사각형으로 다시 count() 재귀 호출
     * -> 처음에는 이렇게 배열 4개를 생성해서 로직을 돌렸었음
    square_one[k][l] = array[k][l];
    square_two[k][l] = array[n / 2 + k][l];
    square_three[k][l] = array[k][n / 2 + l];
    square_four[k][l] = array[n / 2 + k][n / 2 + l];
     -> 잘못된 부분
     * 1) 모든 색종이가 0이거나 1인지 검사하는 로직을 잘못 만들었음 -> 모두 같은 배열인지 확인하는 것과 값이 0인지 1인지 확인하는 로직을 분리했어야 했음
     * 2) 배열 4개를 만드는 것보다 원래 만든 배열에서 인덱스 값으로 찾는게 더 효율적임
     *
     * 이를 수정하기 위해서 boolean isUniform(int x, int y, iny size) 메서드로 배열이 모두 같은 값인지 확인하도록 했고,
     * count(int x, int y, int size) 처럼 count() 메서드를 수정했음, 인자는 x,y 좌표와 탐색할 배열의 size
     *
    *

     * */
    static int N;
    static int[][] array;
    static int zero, one;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st ;
        N = Integer.parseInt(br.readLine());
        array = new int[N][N];

        //배열 채워주기
        for (int i = 0; i <N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                array[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        count(0, 0, N); // 탐색을 시작할 좌표와 탐색할 배열의 크기

        sb.append(zero).append("\n").append(one);

        System.out.println(sb);



    }

    private static void count(int x, int y, int size) {
        if (isUniform(x, y, size)) { // 모두 같은 값인지 확인 -> true일 경우 모두 같은 값
            if (array[x][y] == 0) zero++; // 근데 처음 값이 0이면 흰색
            else one++; //1이면 파랑색
            return;
        }

        int newSize = size / 2; //4등분 할 것이기에 탐색할 배열의 크기를 size/2 해줌

        count(x, y, newSize);
        count(x, y + newSize, newSize);
        count(x + newSize, y, newSize);
        count(x + newSize, y+newSize, newSize);
    }


    static boolean isUniform(int x, int y, int size) { // 모두 같은 값인지 확인하는 메서드
        int first = array[x][y]; //처음 값 받기

        for (int i = x; i < x + size; i++) {
            for (int j = y; j < y + size; j++) {
                if (array[i][j] != first) return false; //처음 값이랑 각 값들을 비교해서 하나라도 다르면 false
            }
        }
        return true; // 모두 같으면 true
    }
}
