package week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_15649 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List <int []> list = new ArrayList<>();

        int [] nList = new int[N];

        int j = 1;
        for (int i = 0; i <N; i++) {
            nList[i] = j;
            j++;
        }

        int [] mList = new int[M];

        for (int i = 0; i < N; i++) {
            for (int k = 0; k <M; k++) {
                mList[k] = nList[i];
            }
        }

    }

}
