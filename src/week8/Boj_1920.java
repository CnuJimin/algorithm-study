package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_1920 {
    //수 찾기
    //이분 탐색 기본
    static int N;
    static int[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        array = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(array);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());


        for (int i = 0; i < M; i++) {
            if (binarySearch(Integer.parseInt(st.nextToken())) == -1) {
                sb.append(0).append("\n");
            } else {
                sb.append(1).append("\n");
            }
        }

        System.out.println(sb);
    }

    private static int binarySearch(int key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;


            if (key < array[mid]) {
                right = mid - 1;
            } else if (key > array[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
