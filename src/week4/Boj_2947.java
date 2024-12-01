package week4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Boj_2947 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        sort(nums);
    }

    private static void sort(int[] nums) {
        int term;

        while (!Arrays.equals(nums, new int[]{1, 2, 3, 4, 5})) { //Arrays.equals -> 배열끼리 비교
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    term = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = term;
                    for (int num : nums) {
                        System.out.print(num + " ");
                    }
                    System.out.println();
                }
            }

        }


    }
}
