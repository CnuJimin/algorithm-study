package week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Boj_1874 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());
        int start = 0;

        while (N-- > 0) {
            int value = Integer.parseInt(br.readLine());
            if (value > start) {
                for (int i = start + 1 ; i <= value; i++) {
                    stack.push(i);
                    sb.append('+').append("\n");
                }
                start = value;
            }

            else if (stack.peek() != value) {
                System.out.println("NO");
                return;
            }
            stack.pop();
            sb.append('-').append("\n");

        }
        System.out.println(sb);
    }
}


/*
* [1, 2, 3]
[1, 2]
[1, 2, 4, 5]
[1, 2, 4, 5, 6, 7]
[1, 2, 4, 5, 6]
NO*/