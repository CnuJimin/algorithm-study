package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj_1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        int[] nums = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            nums[i] = str.charAt(i) - '0'; // 문자열 -> int 형으로 쉽게 바꾸는 방법 숙지..
        }

        Arrays.sort(nums);
        for (int num : nums) {
            sb.append(num);
        }
        sb.reverse();

        System.out.println(sb);
    }
}
