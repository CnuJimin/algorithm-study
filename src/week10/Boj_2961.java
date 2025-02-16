package week10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj_2961 {
    // 도영이가 만든 맛있는 음식
    
    static int[][] ingredient; 
    static int N;
    static int min_diff = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; 
        N = Integer.parseInt(br.readLine());

        ingredient = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            ingredient[i][0] = Integer.parseInt(st.nextToken());
            ingredient[i][1] = Integer.parseInt(st.nextToken());
        }

        backtracking(0, 1, 0, 0);

        System.out.println(min_diff);

    }

    private static void backtracking(int dept, int sour, int bit, int count) {
        if (dept == N) {
            if (count > 0) {
                min_diff = Math.min(min_diff, Math.abs(sour - bit));
            }
            return;
        }

        backtracking(dept + 1, sour * ingredient[dept][0], bit + ingredient[dept][1], count + 1);
        backtracking(dept + 1, sour, bit, count);
    }
}
