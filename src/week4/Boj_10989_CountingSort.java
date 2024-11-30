package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_10989_CountingSort {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[10001];

        for (int i = 0; i < N; i++) {
            nums[Integer.parseInt(br.readLine())]++;
        }

        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                for (int j = 0; j < nums[i]; j++) {
                    sb.append(i).append("\n");
                }
            }
        }

        System.out.println(sb);



    }
}
