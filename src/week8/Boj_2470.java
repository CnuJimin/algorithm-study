package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_2470 {
    // 두 용액
    // 두 수의 합의 절댓값이 가장 작을 때를 구하기

    static int N ;
    static int[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        array = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        int check = Integer.MAX_VALUE; //일단 최댓값을 체크 값으로 설정

        int[] answer = new int[2];

        int lo = 0 ;
        int hi = N - 1;

        while (lo < hi) {
            int sum = array[lo] + array[hi]; //

            if (Math.abs(sum) < check) {
                check = Math.abs(sum); //sum 값이 작아질 수록 check 값이 갱신됨
                answer[0] = array[lo];
                answer[1] = array[hi];
            }

            if (sum < 0) {
                lo++;
            } else hi--;
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }

}
