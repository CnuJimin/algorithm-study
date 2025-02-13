package week9;

import java.util.*;
import java.io.*;
public class Boj_11501 {
    //주식
    /*
     * 입력 값을 일단 배열에 집어 넣음
     * 배열에서 가장 큰 값으 찾고, 그 값 뒤에 있는 값은 그 값에서 뺌
     * 가장 큰 값 뒤에 있는 배열은 다시 배열에 담고 가장 큰 수를 찾고 뺌
     * -> 풀려는 생각은 비슷했는데
     * 그냥 뒤에서 부터 큰 값을 찾아서 빼주면 됨, 처음 최댓값을 그냥 마지막 수로 설정하고..
     * */
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            long proceeds = 0L;
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            int[] array = new int[N];
            for (int i = 0; i < N; i++) {
                array[i] = Integer.parseInt(st.nextToken());
            }
            int max = array[N - 1];
            for (int i = N - 2; i >= 0; i--) {
                if (max >= array[i]) {
                    proceeds += max - array[i];
                } else {
                    max = array[i];
                }
            }
            sb.append(proceeds).append("\n");
        }

        System.out.println(sb);



    }
}