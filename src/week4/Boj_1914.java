package week4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Boj_1914 {
    //하노이 탑
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        System.out.println(BigInteger.TWO.pow(N).subtract(BigInteger.ONE));
        if (N <= 20) {
            hanoi(N, 1, 2, 3);
            System.out.println(sb);
        }
    }

    private static void hanoi(int N, int from, int term, int to) {
        if (N == 1) {
            sb.append(from).append(" ").append(to).append("\n");
            //결국 하노이 탑이 맨 밑에거 빼고 이동하는 구조인데 1개 남았을 때 목표하는 곳으로 이동시키면 됨
            //위 코드에서 to는 메서드의 파라미터 to가 아니라 밑에서 호출되는 to 자리에 있는 파라미터임 그냥 맞는 자리에 알아서 간다고 생각하면 됨
            return;
        }

        hanoi(N - 1, from, to, term); // N-1 개를 중간 막대로 이동
        sb.append(from).append(" ").append(to).append("\n"); //마지막(제일 큰 막대)를 마지막 막대로 이동
        hanoi(N - 1, term, from, to); // 중간 막대에 있는 N-1 개를 마지막 막대로 이동
    }
}
