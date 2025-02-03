package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_10816 {
    //숫자 카드

    static int N ;
    static int[] array;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
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
            int key = Integer.parseInt(st.nextToken());
            sb.append(UpperBound(array, key) - LowerBound(array, key)).append(" ");
        }

        System.out.println(sb);
    }

    private static int UpperBound(int[] array, int key) {
        int lo = 0;
        int hi = array.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;

            if (key < array[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    private static int LowerBound(int[] array, int key) {
        int lo = 0;
        int hi = array.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;

            if (key <= array[mid]) {
                hi = mid;

            } else {
                lo = mid + 1;
            }
        }
        return lo;


    }
}
