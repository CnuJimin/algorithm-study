package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_2512 {
    // 예산
    /*
    * 1. 예산을 int[N] 배열에 담음
    * 2. 배열의 합과 예산을 비교함
    * - 예산이 더 크면 배열의 수 중 가장 큰 수를 출력
    * - 예산이 더 작으면 최댓값에서 1씩 빼면서 상한액을 설정
    * - 배열의 값이 상한액보다 크면 배열의 값을 상한액으로 바꾸면서 합이 상한액보다 작거나 같을 때 까지 실행
    * -> 틀렸음
    *  재귀로 문제를 풀려고 했는데, 제귀로 풀면 안됨
    *  그리고 max 값에 -1을 하는 식으로 문제를 푸려고 했는데 이유는 모르겠지만 계속 틀림..
    * 이분 탐색으로 푸는게 더 빠르고 정확함
    * */

    static int[] array;
    static int N;
    static int max;
    static long limit, sum;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());


        array = new int[N];

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            array[i] = num;
        }


        limit = Long.parseLong(br.readLine());
        max = Arrays.stream(array).max().getAsInt();


        System.out.println(getMax());


    }

    //이분탐색
    private static int getMax() {
        Arrays.sort(array);
        int left = 0; //최솟값
        int right = array[N - 1]; //최댓값

        while (left <= right) {
            int mid = (left + right) / 2;
            long sum = 0 ;

            for (int i = 0; i < N; i++) {
                sum += Math.min(array[i], mid);
            }

            if (sum <= limit) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }
}
