package week8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.StringTokenizer;

public class Boj_2110 {
    // 공유기 설치
    /*
    * 공유기 C개를 거리가 공유기의 거리가 최대가 되로록 설치하는 방법 ..
    * 1. 처음 중간 끝에 두고
    * */

    static int N, C;
    static int[] house;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());// 집의 개수
        C = Integer.parseInt(st.nextToken()); // 공유기 개수

        house = new int[N];

        for (int i = 0; i < N; i++) {
            house[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(house);

        int lo = 1; // 최소 거리가 가질 수 있는 최솟값
        int hi = house[N - 1] - house[0] + 1;

        while (lo < hi) {
            int mid = (hi + lo) / 2;

            //mid 거리에 대해 설치 가능한 공유기 개수가 C보다 작으면(distance = 공유기간 거리가 작아져야함)
            if (canInstall(mid) < C) {
                hi = mid; //그래서 hi 를 줄여줌
            } else { //그게 아니라 거리를 늘려줘야한다면 lo를 늘려줘서 distance를 높여줌
                lo = mid + 1;
            }
        }

        System.out.println(lo - 1); // upper은 탐색 값을 초과하는 첫 번째 값을 가리킴

    }

    private static int canInstall(int distance) {
        int count = 1;
        int lastLocate = house[0]; //첫번째 집은 무조건 설치한다고 가정함

        for (int i = 0; i < house.length; i++) {
            int locate = house[i];

            //현재 탐색하는 집의 위치와 직전 설치한 집의 거리가 요구된 distance보다 클 때 공유기 설치 대수를 늘려주고,
            // 마지막 설치 위치를 갱신해줌
            if (locate - lastLocate >= distance) {
                count++;
                lastLocate = locate;
            }
        }
        return count;
    }

}
