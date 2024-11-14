package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj_11720_SumNum {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        String nums = br.readLine();

        char[] numsCharArray = nums.toCharArray();

        int sum = 0;

        for (char c : numsCharArray) {
            sum += c - '0'; //이거 기억
        }
        System.out.println(sum);

    }
}
