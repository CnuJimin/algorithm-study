package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Boj_10818_Max_Min {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        List<Integer> numList = new ArrayList<Integer>();

        for (int i = 0; i < T; i++) {
            numList.add(Integer.parseInt(st.nextToken()));
        }
        numList.sort(null);

        System.out.println(numList.get(0) + " " + numList.get(numList.size() - 1));
    }
}
