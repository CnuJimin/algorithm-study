package week9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_1783 {
    //병든 나이트
    /*
    * N*M 크기의 boolean 배열을 만들고
    * [0][0] = true로 설정
    * 이동 방향으로 움직일 떄 false 인 곳으로 이동
    * 마지막에 true인 곳을 세기
    * */

    static int N, M;
    static boolean[][] array;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int count = 0;

        if (N == 1) {
            count = 1;
        } else if (N == 2) {
            count = Math.min(4, (M + 1) / 2);
            // 4보다 크면 불가능 더 이상 이동이 불가능하고, 그것 보다 작을 때는 오른 쪽으로 두칸씩 이동해야 하기 대문에 M+1/2
        } else {
            if (M < 7) { //4가지 방향을 모두 사용하면 7을 넘게 됨
                count = Math.min(4, M); //무조건 오른 쪽으로 한칸 이동 하는거 선택
            } else count = M - 2;
        }

        System.out.println(count);
    }
}
