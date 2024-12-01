package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Boj_10814 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        Map<Integer, String> map = new HashMap<>();

        int [] nums = new int[N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            nums[i] = num;
            map.put(num, st.nextToken());
        }

        Arrays.sort(nums);

        for (int num : nums) {
            sb.append(num).append(" ").append(map.get(num)).append("\n");
        }

        System.out.println(sb);
    }
}
