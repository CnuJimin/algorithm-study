package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Boj_2750_countingSort {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[2001]; // 입력 값 범위가 절댓값 1000이하

        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000] = true; // 인덱스는 -값이 없기 때문에 + 1000
        }


        for (int i = 0; i < 2001; i++) {
            if (arr[i]) {
                System.out.println(i - 1000);
            }
        }

    }
}
